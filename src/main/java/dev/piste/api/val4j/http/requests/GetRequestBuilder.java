package dev.piste.api.val4j.http.requests;

import dev.piste.api.val4j.http.enums.HTTPMethod;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class GetRequestBuilder extends RestRequestBuilder {

    public GetRequestBuilder() {
        super(HTTPMethod.GET, null, null);
    }

}