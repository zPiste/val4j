package dev.piste.jva.http.requests;

import dev.piste.jva.http.enums.ContentType;
import dev.piste.jva.http.enums.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Piste | https://github.com/PisteDev
 */
public abstract class RestRequest {

    private final String path;
    private final HttpMethod method;
    private final String body;
    private final ContentType contentType;
    private final Map<String, String> headers;

    protected RestRequest(String path, HttpMethod method, String body, ContentType contentType) {
        this.path = path;
        this.method = method;
        this.body = body;
        this.contentType = contentType;
        this.headers = new HashMap<>();
    }

    public RestRequest addHeader(String key, String value) {
        headers.put(key, value);
        return this;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public String getPath() {
        return path;
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