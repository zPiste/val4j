package dev.piste.jva.http.requests;

import dev.piste.jva.http.enums.HttpMethod;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class GetRequest extends RestRequest {

    public GetRequest(String path) {
        super(path, HttpMethod.GET, null, null);
    }

}