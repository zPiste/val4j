package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HTTPMethod;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class PostRequestBuilder extends RestRequestBuilder {

    public PostRequestBuilder(String body, ContentType contentType) {
        super(HTTPMethod.POST, body, contentType);
    }

}