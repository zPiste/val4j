package dev.piste.api.val4j.tests;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import dev.piste.api.val4j.apis.riotgames.official.ValorantAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.official.models.*;
import dev.piste.api.val4j.util.APILanguage;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestValorantAPI {

    @Test
    public void testGetContent() throws IOException {
        Content content = new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getContent(APILanguage.GERMAN);
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
        ShardStatus shardStatus = new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getShardStatus();
        assertNotNull(shardStatus);
        assertNotNull(shardStatus.getShardId());
        assertNotNull(shardStatus.getShardName());
    }

    @Test
    public void testGetLeaderboard() throws IOException {
        testLeaderboard(new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getLeaderboard("34093c29-4306-43de-452f-3f944bde22be", 101, 0));
        testLeaderboard(new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getLeaderboard("34093c29-4306-43de-452f-3f944bde22be", 120));
        testLeaderboard(new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getLeaderboard("34093c29-4306-43de-452f-3f944bde22be"));
    }

    private void testLeaderboard(Leaderboard leaderboard) {
        assertNotNull(leaderboard);
        assertEquals("34093c29-4306-43de-452f-3f944bde22be", leaderboard.getActUuid());
        assertTrue(leaderboard.getPlayers().length > 100);
        assertNotNull(leaderboard.getPlayers()[0].getPuuid());
    }

    @Test
    public void testGetMatch() throws IOException {
        Match match = new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getMatch("b3f93ea3-95c1-42ac-ac5c-23c2c0dc1369");
        assertNotNull(match);
        assertEquals("b3f93ea3-95c1-42ac-ac5c-23c2c0dc1369", match.getMatchInfo().getUuid());
    }

    @Test
    public void testGetRecentMatchUUIDs() throws IOException {
        String[] matchUuids = new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getRecentMatchUUIDs("unrated");
        assertNotNull(matchUuids);
        assertTrue(matchUuids.length > 0);
    }

    @Test
    public void testGetMatchList() throws IOException {
        MatchListEntry[] matchList = new ValorantAPI(getAPIKey(), RiotShard.EUROPE).getMatchList("qxJfDkwqd-CdVVmOh_KiwfNkGlneClT8L_DCDSQzjD5aOmm7MhtsV6HR0UpBSnB4h4UUfNvq6WU_tQ");
        assertNotNull(matchList);
        assertTrue(matchList.length > 0);
        assertNotNull(matchList[0].getMatchUuid());
        assertNotNull(matchList[0].getGameStartTime());
        assertNotNull(matchList[0].getQueueId());

    }

    private String getAPIKey() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonElement.class).getAsJsonObject().get("riotGamesApiKey").getAsString();
    }

}