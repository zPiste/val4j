package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.InvalidCredentialsException;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.TwoFactorAuthEnabledException;
import dev.piste.api.val4j.apis.riotgames.official.models.AccountTokens;
import dev.piste.api.val4j.apis.riotgames.official.models.UserInfo;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.PostRequestBuilder;
import dev.piste.api.val4j.http.requests.PutRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;
import java.net.URI;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class RiotAuthAPI {

    private final RestClient restClient;
    private final Gson gson;

    public RiotAuthAPI() {
        this.restClient = new RestClient("https://auth.riotgames.com").enableSSL();
        this.gson = new Gson();
    }

    private void storeCookies() throws IOException {
        JsonObject bodyObject = new JsonObject();
        bodyObject.addProperty("client_id", "play-valorant-web-prod");
        bodyObject.addProperty("nonce", 1);
        bodyObject.addProperty("redirect_uri", "https://playvalorant.com/opt_in");
        bodyObject.addProperty("response_type", "token id_token");
        bodyObject.addProperty("scope", "account openid");

        RestRequest restRequest = new PostRequestBuilder(gson.toJson(bodyObject), ContentType.JSON).addPath("api")
                .addPath("v1").addPath("authorization")
                .build();

        restClient.sendRequest(restRequest);
    }

    public AccountTokens getTokens(String username, String password) throws IOException {
        storeCookies();

        JsonObject bodyObject = new JsonObject();
        bodyObject.addProperty("type", "auth");
        bodyObject.addProperty("username", username);
        bodyObject.addProperty("password", password);
        bodyObject.addProperty("remember", true);
        bodyObject.addProperty("language", "en_US");

        RestRequest restRequest = new PutRequestBuilder(gson.toJson(bodyObject), ContentType.JSON).addPath("api")
                .addPath("v1").addPath("authorization")
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest);
        if(responseObject.get("type").getAsString().equalsIgnoreCase("multifactor")) throw new TwoFactorAuthEnabledException();
        if(responseObject.get("type").getAsString().equalsIgnoreCase("auth")
                && responseObject.get("error").getAsString().equalsIgnoreCase("auth_failure")) throw new InvalidCredentialsException();
        String responseUrl = responseObject.getAsJsonObject("response").getAsJsonObject("parameters").get("uri").getAsString();

        URI uri = URI.create(responseUrl);
        String accessToken = null;
        String idToken = null;
        for (String queryParam : uri.getFragment().split("&")) {
            String[] keyValue = queryParam.split("=");
            if (keyValue.length == 2 && keyValue[0].equals("access_token")) {
                accessToken = keyValue[1];
            } else if(keyValue.length == 2 && keyValue[0].equals("id_token")) {
                idToken = keyValue[1];
            }
        }
        return new AccountTokens(accessToken, idToken);
    }

    public UserInfo getUserInfo(String accessToken) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("userinfo")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest);
        return gson.fromJson(responseObject, UserInfo.class);
    }

}