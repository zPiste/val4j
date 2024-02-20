package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HTTPMethod;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class PutRequestBuilder extends RestRequestBuilder {

    public PutRequestBuilder(String body, ContentType contentType) {
        super(HTTPMethod.PUT, body, contentType);
    }

}