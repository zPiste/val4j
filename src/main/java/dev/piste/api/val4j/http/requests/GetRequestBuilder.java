package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.HttpMethod;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class GetRequestBuilder extends RestRequestBuilder {

    public GetRequestBuilder() {
        super(HttpMethod.GET, null, null);
    }

}