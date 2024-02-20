package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.official.RiotAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.models.AccountTokens;
import dev.piste.api.val4j.apis.riotgames.official.models.UserInfo;
import dev.piste.api.val4j.tests.util.Config;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Internal Authentication API")
public class TestRiotAuthAPI {

    private static AccountTokens accountTokens;

    private final RiotAuthAPI api;

    public TestRiotAuthAPI() {
        this.api = new RiotAuthAPI();
    }

    @Test
    public void testGetTokens() throws IOException {
        AccountTokens accountTokens = getTokens();
        assertTrue(accountTokens != null && accountTokens.getAccessToken() != null && accountTokens.getIDToken() != null);
    }

    @Test
    public void testGetTokensByCookieReAuth() throws IOException {
        api.getTokens(getRiotAccount().getUsername(), getRiotAccount().getPassword());
        AccountTokens accountTokens = api.getTokens();
        assertTrue(accountTokens != null && accountTokens.getAccessToken() != null && accountTokens.getIDToken() != null);
    }

    @Test
    public void testGetUserInfo() throws IOException {
        String accessToken = getTokens().getAccessToken();
        UserInfo userInfo = api.getUserInfo(accessToken);
        assertTrue(userInfo != null && userInfo.getPUUID() != null && userInfo.getJWTID() != null);
    }

    public static AccountTokens getTokens() throws IOException {
        if(accountTokens == null) {
            accountTokens = new RiotAuthAPI().getTokens(getRiotAccount().getUsername(), getRiotAccount().getPassword());
        }
        return accountTokens;
    }

    private static Config.RiotAccount getRiotAccount() {
        return Config.getInstance().getRiotAccount();
    }

}