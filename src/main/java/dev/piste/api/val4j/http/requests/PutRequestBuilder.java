package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HttpMethod;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class PutRequestBuilder extends RestRequestBuilder {

    public PutRequestBuilder(String body, ContentType contentType) {
        super(HttpMethod.PUT, body, contentType);
    }

}