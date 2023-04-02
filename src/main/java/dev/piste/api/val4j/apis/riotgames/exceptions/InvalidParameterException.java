package dev.piste.api.val4j.apis.riotgames.exceptions;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class InvalidParameterException extends IOException {

    private final String parameter;

    public InvalidParameterException(String parameterName, String parameter) {
        super("The provided \"" + parameterName + "\" is invalid");
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }

}