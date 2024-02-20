package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.InvalidCredentialsException;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.TwoFactorAuthEnabledException;
import dev.piste.api.val4j.apis.riotgames.official.models.AccountTokens;
import dev.piste.api.val4j.apis.riotgames.official.models.TokenSet;
import dev.piste.api.val4j.apis.riotgames.official.models.UserInfo;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.PostRequestBuilder;
import dev.piste.api.val4j.http.requests.PutRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;
import java.net.HttpCookie;
import java.net.URI;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class RiotAuthAPI {

    private final RestClient restClient;
    private final Gson gson;

    public RiotAuthAPI() {
        this.restClient = new RestClient("https://auth.riotgames.com").enableSSL();
        this.gson = new Gson();
    }

    private void storeCookies() throws IOException {
        JsonObject bodyObject = new JsonObject();
        bodyObject.addProperty("client_id", "riot-client");
        bodyObject.addProperty("nonce", "HqDjhMCk-gwcA7vNoG-EsA");
        bodyObject.addProperty("redirect_uri", "http://localhost/redirect");
        bodyObject.addProperty("response_type", "token id_token");
        bodyObject.addProperty("scope", "account openid offline_access link id offline");

        RestRequest restRequest = new PostRequestBuilder(gson.toJson(bodyObject), ContentType.JSON).addPath("api")
                .addPath("v1").addPath("authorization")
                .addHeader("User-Agent", "ShooterGame/11 rso-auth (Windows;10;;Professional, x64)")
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
                .addHeader("User-Agent", "ShooterGame/11 rso-auth (Windows;10;;Professional, x64)")
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest).getAsJsonObject();
        return extractTokens(responseObject);
    }

    public AccountTokens getTokens() throws IOException {
        JsonObject bodyObject = new JsonObject();
        bodyObject.addProperty("client_id", "riot-client");
        bodyObject.addProperty("nonce", "HqDjhMCk-gwcA7vNoG-EsA");
        bodyObject.addProperty("redirect_uri", "http://localhost/redirect");
        bodyObject.addProperty("response_type", "token id_token");
        bodyObject.addProperty("scope", "account openid offline_access link id offline");

        RestRequest restRequest = new PostRequestBuilder(gson.toJson(bodyObject), ContentType.JSON).addPath("api")
                .addPath("v1").addPath("authorization")
                .addHeader("User-Agent", "ShooterGame/11 rso-auth (Windows;10;;Professional, x64)")
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest).getAsJsonObject();
        return extractTokens(responseObject);
    }

    private AccountTokens extractTokens(JsonObject responseObject) throws IOException {
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

    public TokenSet getTokenSetByCode(String code, String rsoClientId, String rsoClientSecret, String redirectUrl) throws IOException {
        HashMap<Object, Object> bodyMap = new HashMap<>();
        bodyMap.put("grant_type", "authorization_code");
        bodyMap.put("code", code);
        bodyMap.put("redirect_uri", redirectUrl);
        String body = bodyMap.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));
        return getTokenSet(body, rsoClientId, rsoClientSecret);
    }

    public TokenSet getTokenSetByRefreshToken(String refreshToken, String rsoClientId, String rsoClientSecret) throws IOException {
        HashMap<Object, Object> bodyMap = new HashMap<>();
        bodyMap.put("grant_type", "refresh_token");
        bodyMap.put("refresh_token", refreshToken);
        String body = bodyMap.entrySet().stream()
                .map(entry -> entry.getKey() + "=" + entry.getValue())
                .collect(Collectors.joining("&"));
        return getTokenSet(body, rsoClientId, rsoClientSecret);
    }

    private TokenSet getTokenSet(String body, String rsoClientId, String rsoClientSecret) throws IOException {
        RestRequest restRequest = new PostRequestBuilder(body, ContentType.FORM)
                .addPath("token")
                .addHeader("Authorization", "Basic " + Base64.getEncoder().encodeToString((rsoClientId + ":" + rsoClientSecret).getBytes()))
                .build();
        JsonObject responseObject = restClient.sendRequest(restRequest).getAsJsonObject();
        return new TokenSet(responseObject.get("access_token").getAsString(), responseObject.get("refresh_token").getAsString());
    }

    public UserInfo getUserInfo(String accessToken) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("userinfo")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest).getAsJsonObject();
        return gson.fromJson(responseObject, UserInfo.class);
    }

    public List<HttpCookie> getCookies() {
        return restClient.getCookieManager().getCookieStore().get(URI.create("https://auth.riotgames.com"));
    }

}