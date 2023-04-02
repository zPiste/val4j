package dev.piste.api.val4j.apis.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.api.val4j.apis.riotgames.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.models.*;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.http.requests.RestRequestBuilder;
import dev.piste.api.val4j.util.APILanguage;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class ValorantAPI {

    private static final String API_KEY_HEADER = "X-Riot-Token";

    private final RestClient restClient;
    private final String apiKey;
    private final Gson gson;

    public ValorantAPI(String apiKey, RiotShard shard) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/val", shard.getId());
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

    public ShardStatus getStatus() throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("status").addPath("v1")
                .addPath("platform-data")
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request), ShardStatus.class);
    }

    public Leaderboard getLeaderboard(String actUuid) throws IOException {
        return getLeaderboard(actUuid, 0, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size) throws IOException {
        return getLeaderboard(actUuid, size, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size, int startIndex) throws IOException {
        RestRequestBuilder requestBuilder = new GetRequestBuilder().addPath("ranked").addPath("v1")
                .addPath("leaderboards").addPath("by-act").addPath(actUuid)
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

    public String[] getRecentMatchUUIDs(String queueId) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("match").addPath("v1")
                .addPath("recent-matches").addPath("by-queue").addPath(queueId)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request).get("matchIds").getAsJsonArray(), String[].class);
    }

    public MatchListEntry[] getMatchList(String puuid) throws IOException {
        RestRequest request = new GetRequestBuilder().addPath("match").addPath("v1")
                .addPath("matchlists").addPath("by-puuid").addPath(puuid)
                .addHeader(API_KEY_HEADER, apiKey)
                .build();
        return gson.fromJson(restClient.sendRequest(request).get("history").getAsJsonArray(), MatchListEntry[].class);
    }

}