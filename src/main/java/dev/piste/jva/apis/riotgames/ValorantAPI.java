package dev.piste.jva.apis.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.jva.apis.riotgames.enums.RiotShard;
import dev.piste.jva.apis.riotgames.models.Content;
import dev.piste.jva.apis.riotgames.models.Leaderboard;
import dev.piste.jva.apis.riotgames.models.MatchListEntry;
import dev.piste.jva.apis.riotgames.models.ShardStatus;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.requests.GetRequest;
import dev.piste.jva.http.requests.RestRequest;
import dev.piste.jva.util.Language;

import java.io.IOException;

/**
 * @author Piste | https://github.com/PisteDev
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

    public Content getContent(Language language) throws IOException {
        RestRequest request = new GetRequest().addPath("content").addPath("v1")
                .addPath("contents")
                .addParameter("locale", language.getLocale())
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request), Content.class);
    }

    public ShardStatus getStatus() throws IOException {
        RestRequest request = new GetRequest().addPath("status").addPath("v1")
                .addPath("platform-data")
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request), ShardStatus.class);
    }

    public Leaderboard getLeaderboard(String actUuid) throws IOException {
        return getLeaderboard(actUuid, 0, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size) throws IOException {
        return getLeaderboard(actUuid, size, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size, int startIndex) throws IOException {
        RestRequest request = new GetRequest().addPath("ranked").addPath("v1")
                .addPath("leaderboards").addPath("by-act").addPath(actUuid)
                .addHeader(API_KEY_HEADER, apiKey);
        if(size != 0) request.addParameter("size", String.valueOf(size));
        if(startIndex != 0) request.addParameter("startIndex", String.valueOf(startIndex));
        return gson.fromJson(restClient.sendRequest(request), Leaderboard.class);
    }

    public String[] getRecentMatchUUIDs(String queueId) throws IOException {
        RestRequest request = new GetRequest().addPath("match").addPath("v1")
                .addPath("recent-matches").addPath("by-queue").addPath(queueId)
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request).get("matchIds").getAsJsonArray(), String[].class);
    }

    public MatchListEntry[] getMatchList(String puuid) throws IOException {
        RestRequest request = new GetRequest().addPath("match").addPath("v1")
                .addPath("matchlist").addPath("by-puuid").addPath(puuid)
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request).get("history").getAsJsonArray(), MatchListEntry[].class);
    }

}