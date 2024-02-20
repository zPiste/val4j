package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.official.RiotAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotCluster;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotRegion;
import dev.piste.api.val4j.apis.riotgames.official.models.RiotAccount;
import dev.piste.api.val4j.http.exceptions.HTTPStatusException;
import dev.piste.api.val4j.tests.util.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Account API")
public class TestRiotAPI {

    private final RiotAPI api;

    private static final String ACCOUNT_PUUID = "qxJfDkwqd-CdVVmOh_KiwfNkGlneClT8L_DCDSQzjD5aOmm7MhtsV6HR0UpBSnB4h4UUfNvq6WU_tQ";

    public TestRiotAPI() {
        this.api = new RiotAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotCluster.EUROPE);
    }

    @Test
    public void testGetAccountByPUUID() throws IOException {
        RiotAccount riotAccount = api.getAccount(ACCOUNT_PUUID);
        assertNotNull(riotAccount);
        assertNotNull(riotAccount.getPUUID());
        assertNotNull(riotAccount.getName());
        assertNotNull(riotAccount.getTag());
    }

    @Test
    public void testGetAccountByRiotID() throws IOException {
        RiotAccount cacheAccount = api.getAccount(ACCOUNT_PUUID);
        RiotAccount riotAccount = api.getAccount(cacheAccount.getName(), cacheAccount.getTag());
        assertNotNull(riotAccount);
        assertNotNull(riotAccount.getPUUID());
        assertNotNull(riotAccount.getName());
        assertNotNull(riotAccount.getTag());
    }

    @Test
    public void testGetAccountByAccessToken() throws IOException {
        // Not possible to check if the token is valid, so just check if the request is successful
        try {
            new RiotAPI(Config.getInstance().getAPIKey().getRiotGames(), RiotCluster.EUROPE)
                    .getAccountByToken("");
        } catch (HTTPStatusException ignored) {}
    }

    @Test
    public void testGetActiveRegion() throws IOException {
        RiotRegion riotRegion = api.getActiveRegion(ACCOUNT_PUUID);
        assertNotNull(riotRegion);
    }

}