package dev.piste.api.val4j.apis.riotgames.official.exceptions;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class InvalidCredentialsException extends IOException {

    public InvalidCredentialsException() {
        super("Invalid Credentials provided");
    }

}