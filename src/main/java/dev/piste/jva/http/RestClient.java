package dev.piste.jva.http;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonWriter;
import com.google.gson.stream.MalformedJsonException;
import dev.piste.jva.http.exceptions.HttpStatusException;

import java.io.IOException;
import java.io.StringWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class RestClient {

    private final String baseUri;
    private final HttpClient httpClient;
    private final Map<String, String> headers;

    public RestClient(String baseUri) {
        this.baseUri = baseUri;
        this.httpClient = HttpClient.newHttpClient();
        this.headers = new HashMap<>();
    }

    public RestClient addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public RestClient removeHeader(String key) {
        headers.remove(key);
        return this;
    }

    public JsonObject doGet(String uriPath) throws HttpStatusException {
        HttpRequest httpRequest = createHttpRequest(uriPath, HttpMethods.GET);
        return sendRequest(httpRequest);
    }

    public JsonObject doPost(String uriPath, String body) throws HttpStatusException {
        HttpRequest httpRequest = createHttpRequest(uriPath, HttpMethods.POST, body);
        return sendRequest(httpRequest);
    }



    private HttpRequest createHttpRequest(String uriPath, HttpMethods method) {
        return createHttpRequest(uriPath, method, null);
    }

    private HttpRequest createHttpRequest(String uriPath, HttpMethods method, String body) {
        HttpRequest.Builder builder = HttpRequest.newBuilder()
                .uri(URI.create(baseUri + uriPath))
                .method(method.toString(), HttpRequest.BodyPublishers.noBody());
        headers.forEach(builder::header);

        if (body != null) {
            builder.method(method.toString(), HttpRequest.BodyPublishers.ofString(body));
        }

        return builder.build();
    }

    private JsonObject sendRequest(HttpRequest httpRequest) throws HttpStatusException {
        try {
            HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
            if (!isValidJson(response.body())) {
                throw new MalformedJsonException("Response body is not valid JSON");
            }
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonObject jsonObject = JsonParser.parseString(response.body()).getAsJsonObject();
            HttpStatus status = HttpStatus.valueOf(response.statusCode());
            if (status.isError()) {
                StringWriter bodyWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(bodyWriter);
                jsonWriter.setIndent("  ");
                gson.toJson(jsonObject, jsonWriter);
                throw new HttpStatusException(response.statusCode(), bodyWriter.toString(),
                        httpRequest.uri().toString(), httpRequest.method());
            }
            return jsonObject;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
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

enum HttpMethods {
    GET,
    POST
}