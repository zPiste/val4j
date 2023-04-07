package dev.piste.api.val4j.apis.riotgames.unofficial;

import com.google.gson.Gson;
import dev.piste.api.val4j.apis.officer.OfficerAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.unofficial.models.MMR;
import dev.piste.api.val4j.apis.riotgames.unofficial.models.Match;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.util.ClientPlatform;

import java.io.IOException;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class RiotPlayerDataAPI {

    private final RestClient restClient;
    private final Gson gson;

    public RiotPlayerDataAPI(RiotShard shard) {
        this.restClient = new RestClient(String.format("https://pd.%s.a.pvp.net", shard.getId())).enableSSL();
        this.gson = new Gson();
    }

    public MMR getMMR(String puuid, String accessToken, String entitlementsToken) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("mmr").addPath("v1")
                .addPath("players").addPath(puuid)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .addHeader("X-Riot-ClientPlatform", ClientPlatform.getAsBase64())
                .addHeader("X-Riot-ClientVersion", new OfficerAPI().getVersion().getRiotClientVersion())
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), MMR.class);
    }

    public Match getMatch(String uuid, String accessToken, String entitlementsToken) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath("match-details").addPath("v1")
                .addPath("matches").addPath(uuid)
                .addHeader("Authorization", "Bearer " + accessToken)
                .addHeader("X-Riot-Entitlements-JWT", entitlementsToken)
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest), Match.class);
    }

}