package dev.piste.api.val4j.apis.riotgames.internal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.api.val4j.apis.asset.ValorantAssetAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.internal.models.*;
import dev.piste.api.val4j.apis.riotgames.internal.models.deserializer.*;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.PutRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.http.requests.RestRequestBuilder;
import dev.piste.api.val4j.util.ClientPlatform;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class RiotPlayerDataAPI {

    private final RestClient restClient;
    private final String accessToken;
    private final String entitlementsToken;
    private final Gson gson;
    private final String clientVersion;

    public RiotPlayerDataAPI(RiotShard shard, String accessToken, String entitlementsToken) throws IOException {
        this.restClient = new RestClient(String.format("https://pd.%s.a.pvp.net", shard.getID())).enableSSL();
        this.accessToken = accessToken;
        this.entitlementsToken = entitlementsToken;
        this.gson = new GsonBuilder()
                .registerTypeAdapter(MMR.QueueStats.SeasonalInfo[].class, new SeasonalInfoDeserializer())
                .registerTypeAdapter(MMR.QueueStats.SeasonalInfo.WinsByTier[].class, new WinsByTierDeserializer())
                .registerTypeAdapter(MMR.QueueStats[].class, new QueueStatsDeserializer())
                .create();
        this.clientVersion = new ValorantAssetAPI().getVersion().getRiotClientVersion();
    }

    public MMR getMMR(String playerUUID) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("mmr").addPath("v1")
                .addPath("players").addPath(playerUUID)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .addHeader("X-Riot-ClientPlatform", ClientPlatform.getAsBase64Encoded())
                .addHeader("X-Riot-ClientVersion", clientVersion)
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), MMR.class);
    }

    public CompetitiveUpdates getCompetitiveUpdates(String playerUUID, int startIndex, int endIndex, String queueID) throws IOException {
        RestRequestBuilder restRequestBuilder = new GetRequestBuilder().addPath("mmr").addPath("v1")
                .addPath("players").addPath(playerUUID).addPath("competitiveupdates")
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .addHeader("X-Riot-ClientPlatform", ClientPlatform.getAsBase64Encoded());
        if(startIndex != 0) restRequestBuilder.addParameter("startIndex", String.valueOf(startIndex));
        if(endIndex != 0) restRequestBuilder.addParameter("endIndex", String.valueOf(endIndex));
        if(queueID != null) restRequestBuilder.addParameter("queue", queueID);

        return gson.fromJson(restClient.sendRequest(restRequestBuilder.build()), CompetitiveUpdates.class);
    }

    public CompetitiveUpdates getCompetitiveUpdates(String playerUUID) throws IOException {
        return getCompetitiveUpdates(playerUUID, 0, 0, null);
    }

    public CompetitiveUpdates getCompetitiveUpdates(String playerUUID, int startIndex, int endIndex) throws IOException {
        return getCompetitiveUpdates(playerUUID, startIndex, endIndex, null);
    }

    public CompetitiveUpdates getCompetitiveUpdates(String playerUUID, String queueID) throws IOException {
        return getCompetitiveUpdates(playerUUID, 0, 0, queueID);
    }

    public MatchHistory getMatchHistory(String playerUUID, int startIndex, int endIndex, String queueID) throws IOException {
        RestRequestBuilder restRequestBuilder = new GetRequestBuilder().addPath("match-history").addPath("v1")
                .addPath("history").addPath(playerUUID)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken);
        if(startIndex != 0) restRequestBuilder.addParameter("startIndex", String.valueOf(startIndex));
        if(endIndex != 0) restRequestBuilder.addParameter("endIndex", String.valueOf(endIndex));
        if(queueID != null) restRequestBuilder.addParameter("queue", queueID);

        return gson.fromJson(restClient.sendRequest(restRequestBuilder.build()), MatchHistory.class);
    }

    public MatchHistory getMatchHistory(String playerUUID) throws IOException {
        return getMatchHistory(playerUUID, 0, 0, null);
    }

    public MatchHistory getMatchHistory(String playerUUID, int startIndex, int endIndex) throws IOException {
        return getMatchHistory(playerUUID, startIndex, endIndex, null);
    }

    public MatchHistory getMatchHistory(String playerUUID, String queueID) throws IOException {
        return getMatchHistory(playerUUID, 0, 0, queueID);
    }

    public Match getMatch(String uuid) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("match-details").addPath("v1")
                .addPath("matches").addPath(uuid)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), Match.class);
    }

    public NameInfo[] getNameInfo(String... playerUUIDs) throws IOException {
        RestRequest restRequest = new PutRequestBuilder(gson.toJson(playerUUIDs), ContentType.JSON)
                .addPath("name-service").addPath("v2")
                .addPath("players")
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), NameInfo[].class);
    }

    public Storefront getStorefront(String playerUUID) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("store").addPath("v2")
                .addPath("storefront").addPath(playerUUID)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), Storefront.class);
    }

}