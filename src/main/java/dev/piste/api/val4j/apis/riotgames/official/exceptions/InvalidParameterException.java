package dev.piste.api.val4j.apis.riotgames.official.exceptions;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class InvalidParameterException extends IOException {

    private final ParameterType parameterType;
    private final String providedParameter;

    public InvalidParameterException(ParameterType parameterType, String providedParameter) {
        super("The provided \"" + parameterType.getName() + "\" is invalid");
        this.parameterType = parameterType;
        this.providedParameter = providedParameter;
    }

    public ParameterType getParameterType() {
        return parameterType;
    }

    public String getProvidedParameter() {
        return providedParameter;
    }

}