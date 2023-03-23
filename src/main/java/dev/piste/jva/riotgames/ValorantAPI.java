package dev.piste.jva.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.requests.GetRequest;
import dev.piste.jva.http.requests.RestRequest;
import dev.piste.jva.riotgames.enums.RiotShard;
import dev.piste.jva.riotgames.models.Content;
import dev.piste.jva.riotgames.models.Leaderboard;
import dev.piste.jva.riotgames.models.MatchListEntry;
import dev.piste.jva.riotgames.models.ShardStatus;
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
        RestRequest request = new GetRequest(String.format("/content/v1/contents?locale=%s", language.getLocale()))
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request), Content.class);
    }

    public ShardStatus getStatus() throws IOException {
        RestRequest request = new GetRequest("/status/v1/platform-data")
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
        RestRequest request = new GetRequest(String.format("/ranked/v1/leaderboards/by-act/%s", actUuid)
                + (size != 0 ? "?size=" + size : "")
                + (startIndex != 0 ? "?startIndex=" + startIndex : ""))
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request), Leaderboard.class);
    }

    public String[] getRecentMatchUUIDs(String queueId) throws IOException {
        RestRequest request = new GetRequest(String.format("/match/v1/recent-matches/by-queue/%s", queueId))
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request).get("matchIds").getAsJsonArray(), String[].class);
    }

    public MatchListEntry[] getMatchList(String puuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/match/v1/matchlists/by-puuid/%s", puuid))
                .addHeader(API_KEY_HEADER, apiKey);
        return gson.fromJson(restClient.sendRequest(request).get("history").getAsJsonArray(), MatchListEntry[].class);
    }



}