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

import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class RestClient {

    private final String baseUrl;
    private final Gson gson;
    private final HttpClient httpClient;

    public RestClient(String baseUrl) {
        this.baseUrl = baseUrl;
        this.gson = new GsonBuilder().setPrettyPrinting().create();
        this.httpClient = HttpClient.newHttpClient();
    }

    public JsonObject sendRequest(RestRequest restRequest) throws IOException {
        HttpRequest httpRequest = createHttpRequest(restRequest.getPath(), restRequest.getMethod(), restRequest.getBody(), restRequest.getContentType(), restRequest.getHeaders());
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (!isValidJson(response.body())) {
                throw new MalformedJsonException("Response body is not valid JSON");
            }
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            HttpStatus status = HttpStatus.valueOf(response.statusCode());
            if (status.isError()) {
                StringWriter bodyWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(bodyWriter);
                jsonWriter.setIndent("  ");
                gson.toJson(jsonObject, jsonWriter);
                throw new HttpStatusException(response.statusCode(), bodyWriter.toString(), baseUrl + restRequest.getPath(), restRequest.getMethod().toString());
            }
            return jsonObject;
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

}