package dev.piste.jva.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.exceptions.HttpStatusException;
import dev.piste.jva.http.requests.GetRequest;
import dev.piste.jva.http.requests.RestRequest;
import dev.piste.jva.riotgames.enums.RiotShard;
import dev.piste.jva.riotgames.exceptions.InvalidParameterException;
import dev.piste.jva.riotgames.models.RiotAccount;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

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
        final String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8);
        final String encodedTag = URLEncoder.encode(tag, StandardCharsets.UTF_8);
        try {
            RestRequest request = new GetRequest(String.format("/account/v1/accounts/by-riot-id/%s/%s", encodedName, encodedTag))
                    .addHeader(API_KEY_HEADER, apiKey);
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
            RestRequest request = new GetRequest(String.format("/account/v1/accounts/by-puuid/%s", puuid))
                    .addHeader(API_KEY_HEADER, apiKey);
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
        RestRequest request = new GetRequest("/account/v1/accounts/me")
                .addHeader("Authorization", "Bearer " + accessToken);
        JsonObject jsonObject = restClient.sendRequest(request);
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotShard getActiveShard(String puuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/account/v1/active-shards/by-game/val/by-puuid/%s", puuid))
                .addHeader(API_KEY_HEADER, apiKey);
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