package dev.piste.api.val4j.http.exceptions;

import dev.piste.api.val4j.http.enums.HttpStatus;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class HttpStatusException extends IOException {

    private final HttpStatus status;
    private final String requestMethod;
    private final String responseBody;
    private final String uri;


    public HttpStatusException(int statusCode, String responseBody, String uri, String requestMethod) {
        super("HTTP Error " + statusCode + " on " + requestMethod + " " + uri);
        this.status = HttpStatus.valueOf(statusCode);
        this.requestMethod = requestMethod;
        this.responseBody = responseBody;
        this.uri = uri;
    }

    public HttpStatus getStatus() {
        return status;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public String getURI() {
        return uri;
    }

    public String getRequestMethod() {
        return requestMethod;
    }

}