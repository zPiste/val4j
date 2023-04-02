package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.HttpMethod;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class GetRequestBuilder extends RestRequestBuilder {

    public GetRequestBuilder() {
        super(HttpMethod.GET, null, null);
    }

}