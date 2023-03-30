package dev.piste.jva.apis.riotgames.exceptions;

import java.io.IOException;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class InvalidAPIKeyException extends IOException {

    private final String providedKey;

    public InvalidAPIKeyException(String providedKey) {
        super("The provided API key is invalid");
        this.providedKey = providedKey;
    }

    public String getProvidedKey() {
        return providedKey;
    }

}