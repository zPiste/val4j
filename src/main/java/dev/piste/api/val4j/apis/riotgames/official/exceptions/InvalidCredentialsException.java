package dev.piste.api.val4j.apis.riotgames.official.exceptions;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class InvalidCredentialsException extends IOException {

    public InvalidCredentialsException() {
        super("Invalid Credentials provided");
    }

}