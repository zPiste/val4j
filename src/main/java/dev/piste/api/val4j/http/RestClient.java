package dev.piste.api.val4j.http;

import com.google.gson.*;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HTTPMethod;
import dev.piste.api.val4j.http.enums.HTTPStatus;
import dev.piste.api.val4j.http.exceptions.HTTPStatusException;
import dev.piste.api.val4j.http.requests.RestRequest;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.IOException;
import java.io.StringWriter;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.Map;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class RestClient {

    private final String baseURL;
    private final Gson gson;
    private HttpClient httpClient;
    private final CookieManager cookieManager;

    public RestClient(String baseURL) {
        this.baseURL = baseURL;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        cookieManager = new CookieManager();
        cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        this.httpClient = HttpClient.newBuilder()
                .cookieHandler(cookieManager)
                .build();
    }

    public RestClient enableSSL() {
        SSLParameters sslParameters = new SSLParameters();
        sslParameters.setProtocols(new String[] {"TLSv1.3"});
        sslParameters.setCipherSuites(new String[] {"TLS_CHACHA20_POLY1305_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA256"});
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");

        try {
            this.httpClient = HttpClient.newBuilder()
                    .sslContext(SSLContext.getDefault())
                    .sslParameters(sslParameters)
                    .version(HttpClient.Version.HTTP_1_1)
                    .cookieHandler(cookieManager)
                    .build();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return this;
    }

    public RestClient bypassAllSLLCertificates() {
        SSLParameters sslParameters = new SSLParameters();
        sslParameters.setProtocols(new String[] {"TLSv1.3"});
        sslParameters.setCipherSuites(new String[] {"TLS_CHACHA20_POLY1305_SHA256", "TLS_RSA_WITH_AES_256_CBC_SHA256"});
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");

        this.httpClient = HttpClient.newBuilder()
                .sslContext(getBypassSSLContext())
                .sslParameters(sslParameters)
                .version(HttpClient.Version.HTTP_1_1)
                .cookieHandler(cookieManager)
                .build();
        return this;
    }

    public JsonElement sendRequest(RestRequest restRequest) throws IOException {
        HttpRequest httpRequest = createHTTPRequest(restRequest.getPath(), restRequest.getMethod(), restRequest.getBody(), restRequest.getContentType(), restRequest.getHeaders());
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            HTTPStatus status = HTTPStatus.ofCode(response.statusCode());
            if (status.isError()) {
                if (isInvalidJSON(response.body())) {
                    throw new HTTPStatusException(response.statusCode(), response.body(), baseURL + restRequest.getPath(), restRequest.getMethod().toString());
                }
                StringWriter bodyWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(bodyWriter);
                jsonWriter.setIndent("  ");
                gson.toJson(JsonParser.parseString(response.body()).getAsJsonObject(), jsonWriter);
                throw new HTTPStatusException(response.statusCode(), bodyWriter.toString(), baseURL + restRequest.getPath(), restRequest.getMethod().toString());
            }
            if (isInvalidJSON(response.body())) {
                throw new MalformedJsonException("Response body is not valid JSON");
            }
            if(response.body().isEmpty()) return null;
            return JsonParser.parseString(response.body());
        } catch (MalformedJsonException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpRequest createHTTPRequest(String path, HTTPMethod method, String body, ContentType contentType, Map<String, String> headers) {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(baseURL + path))
                .method(method.toString(), HttpRequest.BodyPublishers.noBody());
        if(contentType != null) {
            builder.header("Content-Type", contentType.getHeaderValue());
        }
        headers.forEach(builder::header);
        if (body != null) {
            builder.method(method.toString(), HttpRequest.BodyPublishers.ofString(body));
        }
        return builder.build();
    }

    private boolean isInvalidJSON(String json) {
        try {
            JsonParser.parseString(json);
            return false;
        } catch (Exception e) {
            return true;
        }
    }

    private SSLContext getBypassSSLContext() {
        try {
            TrustManager[] trustAllCerts = new TrustManager[] {
                    new X509TrustManager() {
                        public X509Certificate[] getAcceptedIssuers() {
                            return null;
                        }

                        public void checkClientTrusted(X509Certificate[] certs, String authType) {
                        }

                        public void checkServerTrusted(X509Certificate[] certs, String authType) {
                        }
                    }
            };

            // Create an SSLContext with the custom TrustManager.
            SSLContext sslContext = SSLContext.getInstance("SSL");
            sslContext.init(null, trustAllCerts, new SecureRandom());
            return sslContext;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public CookieManager getCookieManager() {
        return cookieManager;
    }

}