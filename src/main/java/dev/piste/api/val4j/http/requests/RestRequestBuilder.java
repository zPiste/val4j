package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HTTPMethod;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public abstract class RestRequestBuilder {

    private final StringBuilder pathBuilder;
    private final HTTPMethod method;
    private final String body;
    private final ContentType contentType;
    private final Map<String, String> headers;
    private final Map<String, String> parameters;

    protected RestRequestBuilder(HTTPMethod method, String body, ContentType contentType) {
        this.pathBuilder = new StringBuilder();
        this.method = method;
        this.body = body;
        this.contentType = contentType;
        this.headers = new HashMap<>();
        this.parameters = new HashMap<>();
    }

    public RestRequestBuilder addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public RestRequestBuilder addPath(String path) {
        pathBuilder.append("/").append(URLEncoder.encode(path, StandardCharsets.UTF_8));
        return this;
    }

    public RestRequestBuilder addParameter(String key, String value) {
        parameters.put(key, URLEncoder.encode(value, StandardCharsets.UTF_8));
        return this;
    }

    public RestRequest build() {
        if(!parameters.isEmpty()) {
            String parametersAsString = parameters.entrySet().stream()
                    .map(entry -> entry.getKey() + "=" + entry.getValue())
                    .collect(Collectors.joining("&"));
            pathBuilder.append("?").append(parametersAsString);
        }
        return new RestRequest(method, pathBuilder.toString(), body, contentType, headers);
    }

}