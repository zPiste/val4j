package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.internal.RiotGeoAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.official.models.AccountTokens;
import dev.piste.api.val4j.tests.util.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Internal Geo API")
public class TestRiotGeoAPI {

    private final RiotGeoAPI api;

    public TestRiotGeoAPI() {
        this.api = new RiotGeoAPI();
    }

    @Test
    public void testGetShard() throws IOException {
        AccountTokens accountTokens = TestRiotAuthAPI.getTokens();
        RiotShard shard = api.getShard(accountTokens.getAccessToken(), accountTokens.getIDToken());
        assertNotNull(shard);
    }

    private Config.RiotAccount getRiotAccount() {
        return Config.getInstance().getRiotAccount();
    }

}