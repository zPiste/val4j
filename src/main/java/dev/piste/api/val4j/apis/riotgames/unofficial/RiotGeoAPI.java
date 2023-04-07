package dev.piste.api.val4j.apis.riotgames.unofficial;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.PutRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;

/**
 * @author Piste (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class RiotGeoAPI {

    private final RestClient restClient;
    private final Gson gson;

    public RiotGeoAPI() {
        this.restClient = new RestClient("https://riot-geo.pas.si.riotgames.com").enableSSL();
        this.gson = new Gson();
    }

    public RiotShard getShard(String accessToken, String idToken) throws IOException {
        JsonObject bodyObject = new JsonObject();
        bodyObject.addProperty("id_token", idToken);
        RestRequest restRequest = new PutRequestBuilder(gson.toJson(bodyObject), ContentType.JSON)
                .addPath("pas").addPath("v1").addPath("product").addPath("valorant")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();

        JsonObject responseObject = restClient.sendRequest(restRequest);
        return RiotShard.ofId(responseObject.get("affinities").getAsJsonObject().get("live").getAsString());
    }

}