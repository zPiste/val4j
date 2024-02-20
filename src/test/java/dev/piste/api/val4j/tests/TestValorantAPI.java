package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.official.ValorantAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotRegion;
import dev.piste.api.val4j.apis.riotgames.official.models.*;
import dev.piste.api.val4j.tests.util.Config;
import dev.piste.api.val4j.util.APILanguage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("VALORANT API")
public class TestValorantAPI {

    private final ValorantAPI api;

    private static final String E7A3_SEASON_UUID = "4401f9fd-4170-2e4c-4bc3-f3b4d7d150d1";
    private static final String ACTIVE_PLAYER_PUUID = "qxJfDkwqd-CdVVmOh_KiwfNkGlneClT8L_DCDSQzjD5aOmm7MhtsV6HR0UpBSnB4h4UUfNvq6WU_tQ";

    public TestValorantAPI() {
        this.api = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE);
    }

    @Test
    public void testGetContent() throws IOException {
        Content content = api.getContent(APILanguage.GERMAN);
        assertNotNull(content);
        assertNotNull(content.getVersion());
        assertNotNull(content.getAgents());
        assertNotNull(content.getMaps());
        assertNotNull(content.getChromas());
        assertNotNull(content.getSkins());
        assertNotNull(content.getSkinLevels());
        assertNotNull(content.getEquippables());
        assertNotNull(content.getGameModes());
        assertNotNull(content.getSprays());
        assertNotNull(content.getSprayLevels());
        assertNotNull(content.getBuddies());
        assertNotNull(content.getBuddyLevels());
        assertNotNull(content.getPlayerCards());
        assertNotNull(content.getPlayerTitles());
        assertNotNull(content.getActs());
        assertNotNull(content.getCeremonies());
    }

    @Test
    public void testGetStatus() throws IOException {
        ShardStatus shardStatus = api.getShardStatus();
        assertNotNull(shardStatus);
        assertNotNull(shardStatus.getShardID());
        assertNotNull(shardStatus.getShardName());
    }

    @Test
    public void testGetLeaderboard() throws IOException {
        testLeaderboard(api.getLeaderboard(E7A3_SEASON_UUID, 101, 0));
        testLeaderboard(api.getLeaderboard(E7A3_SEASON_UUID, 120));
        testLeaderboard(api.getLeaderboard(E7A3_SEASON_UUID));
    }

    private void testLeaderboard(Leaderboard leaderboard) {
        assertNotNull(leaderboard);
        assertEquals(E7A3_SEASON_UUID, leaderboard.getActUUID());
        assertTrue(leaderboard.getPlayers().length > 100);
        assertNotNull(leaderboard.getPlayers()[0]);
    }

    @Test
    public void testGetMatch() throws IOException {
        String matchUUID = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE).getRecentMatchUUIDs("competitive")[10];
        Match match = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE).getMatch(matchUUID);
        assertNotNull(match);
        assertEquals(matchUUID, match.getMatchInfo().getUUID());
    }

    @Test
    public void testGetRecentMatchUUIDs() throws IOException {
        String[] matchUuids = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE).getRecentMatchUUIDs("unrated");
        assertNotNull(matchUuids);
        assertTrue(matchUuids.length > 0);
    }

    @Test
    public void testGetMatchHistory() throws IOException {
        MatchHistory.Entry[] matchList = new ValorantAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotRegion.EUROPE).getMatchHistory(ACTIVE_PLAYER_PUUID).getHistory();
        assertNotNull(matchList);
        assertTrue(matchList.length > 0);
        assertNotNull(matchList[0].getMatchUUID());
        assertNotNull(matchList[0].getGameStartTime());
        assertNotNull(matchList[0].getQueueID());
    }

}