package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.official.RiotEntitlementsAuthAPI;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Internal Entitlements Authentication API")
public class TestRiotEntitlementsAuthAPI {

    private final RiotEntitlementsAuthAPI api;

    public TestRiotEntitlementsAuthAPI() {
        this.api = new RiotEntitlementsAuthAPI();
    }

    @Test
    public void testGetEntitlementsToken() throws IOException {
        String accessToken = TestRiotAuthAPI.getTokens().getAccessToken();
        String entitlementsToken = api.getEntitlementsToken(accessToken);
        assertTrue(entitlementsToken != null && !entitlementsToken.isEmpty());
    }

}