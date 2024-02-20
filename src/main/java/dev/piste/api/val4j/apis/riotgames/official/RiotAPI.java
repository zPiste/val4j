package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotCluster;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotRegion;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.InvalidParameterException;
import dev.piste.api.val4j.apis.riotgames.official.exceptions.ParameterType;
import dev.piste.api.val4j.apis.riotgames.official.models.RiotAccount;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.exceptions.HTTPStatusException;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class RiotAPI {

    private static final String API_KEY_HEADER = "X-Riot-Token";

    private final RestClient restClient;
    private final String apiKey;
    private final Gson gson;

    public RiotAPI(String apiKey, RiotCluster cluster) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/riot", cluster.getID());
        restClient = new RestClient(BASE_URL);
        this.apiKey = apiKey;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public RiotAccount getAccount(String name, String tag) throws IOException {
        try {
            RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                    .addPath("accounts").addPath("by-riot-id").addPath(name).addPath(tag)
                    .addHeader(API_KEY_HEADER, apiKey)
                    .build();

            JsonObject jsonObject = restClient.sendRequest(request).getAsJsonObject();
            return gson.fromJson(jsonObject, RiotAccount.class);
        } catch (HTTPStatusException e) {
            if (e.getStatus().getCode() == 404 || e.getStatus().getCode() == 400) {
                throw new InvalidParameterException(ParameterType.RIOT_ID, name + "#" + tag);
            }
            throw e;
        }
    }

    public RiotAccount getAccount(String puuid) throws IOException {
        try {
            RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                    .addPath("accounts").addPath("by-puuid").addPath(puuid)
                    .addHeader(API_KEY_HEADER, apiKey)
                    .build();
            JsonObject jsonObject = restClient.sendRequest(request).getAsJsonObject();
            return gson.fromJson(jsonObject, RiotAccount.class);
        } catch (HTTPStatusException e) {
            if (e.getStatus().getCode() == 404 || e.getStatus().getCode() == 400) {
                throw new InvalidParameterException(ParameterType.PUUID, puuid);
            }
            throw e;
        }
    }

    public RiotAccount getAccountByToken(String accessToken) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                .addPath("accounts").addPath("me")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();
        JsonObject jsonObject = restClient.sendRequest(request).getAsJsonObject();
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotRegion getActiveRegion(String puuid) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                .addPath("active-shards").addPath("by-game").addPath("val").addPath("by-puuid").addPath(puuid)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        JsonObject jsonObject = restClient.sendRequest(request).getAsJsonObject();
        return RiotRegion.ofID(jsonObject.get("activeShard").getAsString());
    }

}