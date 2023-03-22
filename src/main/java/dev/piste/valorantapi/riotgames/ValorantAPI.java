package dev.piste.valorantapi.riotgames;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.valorantapi.http.RestClient;
import dev.piste.valorantapi.http.exceptions.HttpStatusException;
import dev.piste.valorantapi.riotgames.enums.RiotShard;
import dev.piste.valorantapi.riotgames.models.Content;
import dev.piste.valorantapi.riotgames.models.Leaderboard;
import dev.piste.valorantapi.riotgames.models.ShardStatus;
import dev.piste.valorantapi.util.Language;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class ValorantAPI {

    private final RestClient restClient;
    private final Gson gson;

    public ValorantAPI(String apiKey, RiotShard shard) {
        String BASE_URL = String.format("https://%s.api.riotgames.com/val", shard.getId());
        restClient = new RestClient(BASE_URL)
                .addHeader("Content-Type", "application/json")
                .addHeader("X-Riot-Token", apiKey);
        gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
    }

    public Content getContent(Language language) throws HttpStatusException {
        return gson.fromJson(restClient.doGet(String.format("/content/v1/contents?locale=%s", language.getLocale())), Content.class);
    }

    public ShardStatus getStatus() throws HttpStatusException {
        return gson.fromJson(restClient.doGet("/status/v1/platform-data"), ShardStatus.class);
    }

    public Leaderboard getLeaderboard(String actUuid) throws HttpStatusException {
        return getLeaderboard(actUuid, 0, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size) throws HttpStatusException {
        return getLeaderboard(actUuid, size, 0);
    }

    public Leaderboard getLeaderboard(String actUuid, int size, int startIndex) throws HttpStatusException {
        return gson.fromJson(restClient.doGet(String.format("/ranked/v1/leaderboards/by-act/%s", actUuid) + (size != 0 ? "?size=" + size : "") + (startIndex != 0 ? "?startIndex=" + startIndex : "")), Leaderboard.class);
    }

}