package dev.piste.api.val4j.tests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.RiotAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.RiotEntitlementsAuthAPI;
import dev.piste.api.val4j.apis.riotgames.unofficial.RiotPlayerDataAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.unofficial.models.MMR;
import dev.piste.api.val4j.apis.riotgames.unofficial.models.Match;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestRiotPlayerDataAPI {

    @Test
    public void testGetMmr() throws IOException {
        String accessToken = new RiotAuthAPI().getTokens(getAccountUsername(), getAccountPassword()).getAccessToken();
        String entitlementsToken = new RiotEntitlementsAuthAPI().getEntitlementsToken(accessToken);

        MMR MMR = new RiotPlayerDataAPI(RiotShard.EUROPE).getMMR("7f9699ce-6829-5a4b-ba8e-8a0a47efdab8", accessToken, entitlementsToken);

        assertTrue(MMR != null && MMR.getPuuid() != null && MMR.getQueueStats() != null);
    }

    @Test
    public void testGetMatch() throws IOException {
        String accessToken = new RiotAuthAPI().getTokens(getAccountUsername(), getAccountPassword()).getAccessToken();
        String entitlementsToken = new RiotEntitlementsAuthAPI().getEntitlementsToken(accessToken);

        Match match = new RiotPlayerDataAPI(RiotShard.EUROPE).getMatch("2a8c5db6-23b7-4110-a541-1a2bd3acbaa6", accessToken, entitlementsToken);

        assertTrue(match != null && match.getPlayers() != null);
    }

    private String getAccountUsername() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("username").getAsString();
    }

    private String getAccountPassword() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("password").getAsString();
    }

}