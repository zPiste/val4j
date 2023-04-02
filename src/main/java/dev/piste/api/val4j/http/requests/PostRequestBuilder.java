package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HttpMethod;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class PostRequestBuilder extends RestRequestBuilder {

    public PostRequestBuilder(String body, ContentType contentType) {
        super(HttpMethod.POST, body, contentType);
    }

}