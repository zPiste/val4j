package dev.piste.api.val4j.apis.riotgames.official.models;

/**
 * @author Piste (<a href="https://github.com/pistedev">GitHub</a>)
 */
public class AccountTokens {

    private final String accessToken;
    private final String idToken;

    public AccountTokens(String accessToken, String idToken) {
        this.accessToken = accessToken;
        this.idToken = idToken;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getIdToken() {
        return idToken;
    }

}