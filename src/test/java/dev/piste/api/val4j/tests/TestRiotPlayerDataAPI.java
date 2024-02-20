package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.internal.RiotPlayerDataAPI;
import dev.piste.api.val4j.apis.riotgames.internal.models.*;
import dev.piste.api.val4j.apis.riotgames.official.RiotAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.RiotEntitlementsAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.ValorantAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotRegion;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.tests.util.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Internal Player Data API")
public class TestRiotPlayerDataAPI {

    private final RiotPlayerDataAPI api;
    private final String playerUUID;

    private static final String ACTIVE_PLAYER_UUID = "7f9699ce-6829-5a4b-ba8e-8a0a47efdab8";

    public TestRiotPlayerDataAPI() throws IOException {
        RiotAuthAPI authAPI = new RiotAuthAPI();
        String accessToken = TestRiotAuthAPI.getTokens().getAccessToken();
        String entitlementsToken = new RiotEntitlementsAuthAPI().getEntitlementsToken(accessToken);
        api = new RiotPlayerDataAPI(RiotShard.EUROPE, accessToken, entitlementsToken);
        playerUUID = authAPI.getUserInfo(accessToken).getPUUID();
    }

    @Test
    public void testGetMMR() throws IOException {
        MMR mmr = api.getMMR(ACTIVE_PLAYER_UUID);
        assertTrue(mmr != null && mmr.getPlayerUUID() != null && mmr.getQueueStats() != null);
    }

    @Test
    public void testGetCompetitiveUpdates() throws IOException {
        CompetitiveUpdates competitiveUpdates = api.getCompetitiveUpdates(ACTIVE_PLAYER_UUID, 0, 1, "competitive");
        assertNotNull(competitiveUpdates.getMatches());
        assertNotNull(competitiveUpdates.getMatches()[0].getUUID());
    }

    @Test
    public void testGetMatch() throws IOException {
        String matchUUID = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE).getRecentMatchUUIDs("competitive")[10];
        Match match = api.getMatch(matchUUID);
        assertTrue(match != null && match.getPlayers() != null);
    }

    @Test
    public void testGetNameInfos() throws IOException {
        NameInfo[] nameInfos = api.getNameInfo(playerUUID, ACTIVE_PLAYER_UUID);
        assertNotNull(nameInfos);
        assertEquals(nameInfos.length, 2);
    }

    @Test
    public void testGetStorefront() throws IOException {
        Storefront storefront = api.getStorefront(playerUUID);
        assertNotEquals(0, storefront.getFeaturedBundle().getBundles().length);
        assertNotNull(storefront.getFeaturedBundle().getBundles()[0].getItems());
    }

}