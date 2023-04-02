package dev.piste.api.val4j.apis.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.exceptions.InvalidParameterException;
import dev.piste.api.val4j.apis.riotgames.models.RiotAccount;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.exceptions.HttpStatusException;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;

import java.io.IOException;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class RiotGamesAPI {

    private static final String API_KEY_HEADER = "X-Riot-Token";

    private final RestClient restClient;
    private final String apiKey;
    private final Gson gson;

    public RiotGamesAPI(String apiKey, Cluster cluster) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/riot", cluster.getId());
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
            JsonObject jsonObject = restClient.sendRequest(request);
            return gson.fromJson(jsonObject, RiotAccount.class);
        } catch (HttpStatusException e) {
            if (e.getStatus().getCode() == 404 || e.getStatus().getCode() == 400) {
                throw new InvalidParameterException("Riot ID", name + "#" + tag);
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
            JsonObject jsonObject = restClient.sendRequest(request);
            return gson.fromJson(jsonObject, RiotAccount.class);
        } catch (HttpStatusException e) {
            if (e.getStatus().getCode() == 404 || e.getStatus().getCode() == 400) {
                throw new InvalidParameterException("PUUID", puuid);
            }
            throw e;
        }
    }

    public RiotAccount getAccountByToken(String accessToken) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                .addPath("accounts").addPath("me")
                .addHeader("Authorization", "Bearer " + accessToken)
                .build();
        JsonObject jsonObject = restClient.sendRequest(request);
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotShard getActiveShard(String puuid) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("account").addPath("v1")
                .addPath("active-shards").addPath("by-game").addPath("val").addPath("by-puuid").addPath(puuid)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        JsonObject jsonObject = restClient.sendRequest(request);
        return RiotShard.getRiotShard(jsonObject.get("activeShard").getAsString());
    }

    public enum Cluster {

        AMERICAS("americas"),
        ASIA("asia"),
        ESPORTS("esports"),
        EUROPE("europe");

        private final String id;

        Cluster(String id) {
            this.id = id;
        }

        public String getId() {
            return id;
        }

    }

}