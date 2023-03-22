package dev.piste.jva.riotgames.exceptions;

import java.io.IOException;

/**
 * @author Piste | https://github.com/PisteDev
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