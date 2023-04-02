package dev.piste.api.val4j.http.enums;

/**
 * @author Piste | https://github.com/PisteDev
 */
public enum ContentType {

    JSON("application/json"),
    XML("application/xml"),
    TEXT("text/plain"),
    HTML("text/html"),
    FORM("application/x-www-form-urlencoded"),
    MULTIPART("multipart/form-data");

    private final String headerValue;

    ContentType(String headerValue) {
        this.headerValue = headerValue;
    }

    public String getHeaderValue() {
        return headerValue;
    }

}