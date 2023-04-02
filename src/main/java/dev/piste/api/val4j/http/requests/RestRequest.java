package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HttpMethod;

import java.util.Map;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class RestRequest {

    private final String path;
    private final HttpMethod method;
    private final String body;
    private final ContentType contentType;
    private final Map<String, String> headers;

    protected RestRequest(HttpMethod method, String path, String body, ContentType contentType, Map<String, String> headers) {
        this.path = path;
        this.method = method;
        this.body = body;
        this.contentType = contentType;
        this.headers = headers;
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