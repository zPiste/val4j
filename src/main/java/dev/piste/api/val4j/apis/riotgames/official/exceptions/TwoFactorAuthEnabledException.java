package dev.piste.api.val4j.apis.riotgames.official.exceptions;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class TwoFactorAuthEnabledException extends IOException {

    public TwoFactorAuthEnabledException() {
        super("Two Factor Authentication is enabled for this account. You need to disable it in order to use this API.");
    }

}