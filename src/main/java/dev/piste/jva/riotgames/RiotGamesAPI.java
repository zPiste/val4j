package dev.piste.jva.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.exceptions.HttpStatusException;
import dev.piste.jva.riotgames.enums.RiotShard;
import dev.piste.jva.riotgames.models.RiotAccount;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class RiotGamesAPI {

    private final RestClient restClient;
    private final Gson gson;

    public RiotGamesAPI(String apiKey, Cluster cluster) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/riot", cluster.getId());
        restClient = new RestClient(BASE_URL)
                .addHeader("Content-Type", "application/json")
                .addHeader("X-Riot-Token", apiKey);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public RiotAccount getAccount(String name, String tag) throws HttpStatusException {
        final String encodedName = URLEncoder.encode(name, StandardCharsets.UTF_8);
        final String encodedTag = URLEncoder.encode(tag, StandardCharsets.UTF_8);
        JsonObject jsonObject = restClient.doGet(String.format("/account/v1/accounts/by-riot-id/%s/%s", encodedName, encodedTag));
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotAccount getAccount(String puuid) throws HttpStatusException {
        JsonObject jsonObject = restClient.doGet(String.format("/account/v1/accounts/by-puuid/%s", puuid));
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotAccount getAccountByToken(String accessToken) throws HttpStatusException {
        JsonObject jsonObject = restClient
                .addHeader("Authorization", "Bearer " + accessToken)
                .doGet("/account/v1/accounts/me");
        restClient.removeHeader("Authorization");
        return gson.fromJson(jsonObject, RiotAccount.class);
    }

    public RiotShard getActiveShard(String puuid) throws HttpStatusException {
        JsonObject jsonObject = restClient.doGet(String.format("/account/v1/active-shards/by-game/val/by-puuid/%s", puuid));
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