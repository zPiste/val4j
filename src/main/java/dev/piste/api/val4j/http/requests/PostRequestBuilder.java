package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.enums.HttpMethod;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class PostRequestBuilder extends RestRequestBuilder {

    public PostRequestBuilder(String body, ContentType contentType) {
        super(HttpMethod.POST, body, contentType);
    }

}