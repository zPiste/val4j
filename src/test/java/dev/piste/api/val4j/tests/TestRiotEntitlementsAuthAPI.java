package dev.piste.api.val4j.tests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.RiotAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.RiotEntitlementsAuthAPI;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestRiotEntitlementsAuthAPI {

    @Test
    public void testGetEntitlementsToken() throws IOException {
        String accessToken = new RiotAuthAPI().getTokens(getAccountUsername(), getAccountPassword()).getAccessToken();
        String entitlementsToken = new RiotEntitlementsAuthAPI().getEntitlementsToken(accessToken);

        assertTrue(entitlementsToken != null && !entitlementsToken.isEmpty());
    }

    private String getAccountUsername() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("username").getAsString();
    }

    private String getAccountPassword() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("password").getAsString();
    }

}