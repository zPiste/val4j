package dev.piste.jva.http.requests;

import dev.piste.jva.http.enums.ContentType;
import dev.piste.jva.http.enums.HttpMethod;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class PostRequest extends RestRequest {

    public PostRequest(String path, String body, ContentType contentType) {
        super(path, HttpMethod.POST, body, contentType);
    }

}