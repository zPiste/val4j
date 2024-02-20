package dev.piste.api.val4j.apis.riotgames.official.models;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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

    public String getIDToken() {
        return idToken;
    }

}