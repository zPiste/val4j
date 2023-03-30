package dev.piste.jva.http.requests;

import dev.piste.jva.http.enums.ContentType;
import dev.piste.jva.http.enums.HttpMethod;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Piste | https://github.com/PisteDev
 */
public abstract class RestRequest {

    private final StringBuilder pathBuilder;
    private final HttpMethod method;
    private final String body;
    private final ContentType contentType;
    private final Map<String, String> headers;
    private final Map<String, String> parameters;

    protected RestRequest(HttpMethod method, String body, ContentType contentType) {
        this.pathBuilder = new StringBuilder();
        this.method = method;
        this.body = body;
        this.contentType = contentType;
        this.headers = new HashMap<>();
        this.parameters = new HashMap<>();
    }

    public RestRequest addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public RestRequest addPath(String path) {
        pathBuilder.append("/").append(URLEncoder.encode(path, StandardCharsets.UTF_8));
        return this;
    }

    public RestRequest addParameter(String key, String value) {
        parameters.put(key, value);
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getPath() {
        if(!parameters.isEmpty()) {
            String parametersAsString = parameters.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining("&"));
            pathBuilder.append("?").append(parametersAsString);
        }
        return pathBuilder.toString();
    }

    public HttpMethod getMethod() {
        return method;
    }

    public String getBody() {
        return body;
    }

    public ContentType getContentType() {
        return contentType;
    }

}