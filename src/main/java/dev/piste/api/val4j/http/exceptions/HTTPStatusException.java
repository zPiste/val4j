package dev.piste.api.val4j.http.exceptions;

import dev.piste.api.val4j.http.enums.HTTPStatus;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class HTTPStatusException extends IOException {

    private final HTTPStatus status;
    private final String requestMethod;
    private final String responseBody;
    private final String url;

    public HTTPStatusException(int statusCode, String responseBody, String url, String requestMethod) {
        super("HTTP Error " + statusCode + " on " + requestMethod + " " + url);
        this.status = HTTPStatus.ofCode(statusCode);
        this.requestMethod = requestMethod;
        this.responseBody = responseBody;
        this.url = url;
    }

    public HTTPStatus getStatus() {
        return status;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public String getURL() {
        return url;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

}