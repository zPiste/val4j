package dev.piste.api.val4j.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HttpMethod;
import dev.piste.api.val4j.http.enums.HttpStatus;
import dev.piste.api.val4j.http.exceptions.HttpStatusException;
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
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class RestClient {

    private final String baseUrl;
    private final Gson gson;
    private HttpClient httpClient;
    private final CookieManager cookieManager;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
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

    public JsonObject sendRequest(RestRequest restRequest) throws IOException {
        HttpRequest httpRequest = createHttpRequest(restRequest.getPath(), restRequest.getMethod(), restRequest.getBody(), restRequest.getContentType(), restRequest.getHeaders());
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (!isValidJson(response.body())) {
                throw new MalformedJsonException("Response body is not valid JSON");
            }
            HttpStatus status = HttpStatus.ofCode(response.statusCode());
            if (status.isError()) {
                StringWriter bodyWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(bodyWriter);
                jsonWriter.setIndent("  ");
                gson.toJson(JsonParser.parseString(response.body()).getAsJsonObject(), jsonWriter);
                throw new HttpStatusException(response.statusCode(), bodyWriter.toString(), baseUrl + restRequest.getPath(), restRequest.getMethod().toString());
            }
            if(response.body().equals("")) return null;
            return JsonParser.parseString(response.body()).getAsJsonObject();
        } catch (MalformedJsonException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private HttpRequest createHttpRequest(String path, HttpMethod method, String body, ContentType contentType, Map<String, String> headers) {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + path))
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

    private boolean isValidJson(String json) {
        try {
            JsonParser.parseString(json);
            return true;
        } catch (Exception e) {
            return false;
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

}