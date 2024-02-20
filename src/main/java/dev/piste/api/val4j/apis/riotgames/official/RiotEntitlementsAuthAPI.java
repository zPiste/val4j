package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.JsonObject;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.PostRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class RiotEntitlementsAuthAPI {

    private final RestClient restClient;

    public RiotEntitlementsAuthAPI() {
        this.restClient = new RestClient("https://entitlements.auth.riotgames.com/api").enableSSL();
    }

    public String getEntitlementsToken(String accessToken) throws IOException {
        RestRequest restRequest = new PostRequestBuilder("", ContentType.JSON)
                .addPath("token").addPath("v1")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest).getAsJsonObject();

        return responseObject.get("entitlements_token").getAsString();
    }

}