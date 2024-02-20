package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotRegion;
import dev.piste.api.val4j.apis.riotgames.official.models.*;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.http.requests.RestRequestBuilder;
import dev.piste.api.val4j.util.APILanguage;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class ValorantAPI {

    private static final String API_KEY_HEADER = "X-Riot-Token";

    private final RestClient restClient;
    private final String apiKey;
    private final Gson gson;

    public ValorantAPI(String apiKey, RiotRegion region) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/val", region.getID());
        restClient = new RestClient(BASE_URL);
        this.apiKey = apiKey;
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public Content getContent(APILanguage language) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("content").addPath("v1")
                .addPath("contents")
                .addParameter("locale", language.getLocale())
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request), Content.class);
    }

    public ShardStatus getShardStatus() throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("status").addPath("v1")
                .addPath("platform-data")
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request), ShardStatus.class);
    }

    public Leaderboard getLeaderboard(String actUUID) throws IOException {
        return getLeaderboard(actUUID, 0, 0);
    }

    public Leaderboard getLeaderboard(String actUUID, int size) throws IOException {
        return getLeaderboard(actUUID, size, 0);
    }

    public Leaderboard getLeaderboard(String actUUID, int size, int startIndex) throws IOException {
        RestRequestBuilder requestBuilder = new GetRequestBuilder().addPath("ranked").addPath("v1")
                .addPath("leaderboards").addPath("by-act").addPath(actUUID)
                .addHeader(API_KEY_HEADER, apiKey);
        if(size != 0) requestBuilder.addParameter("size", String.valueOf(size));
        if(startIndex != 0) requestBuilder.addParameter("startIndex", String.valueOf(startIndex));
        return gson.fromJson(restClient.sendRequest(requestBuilder.build()), Leaderboard.class);
    }

    public Match getMatch(String uuid) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("match").addPath("v1")
                .addPath("matches").addPath(uuid)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request), Match.class);
    }

    public String[] getRecentMatchUUIDs(String queueID) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("match").addPath("v1")
                .addPath("recent-matches").addPath("by-queue").addPath(queueID)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject().get("matchIds").getAsJsonArray(), String[].class);
    }

    public MatchHistory getMatchHistory(String puuid) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("match").addPath("v1")
                .addPath("matchlists").addPath("by-puuid").addPath(puuid)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject(), MatchHistory.class);
    }

}