package dev.piste.api.val4j.tests;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import dev.piste.api.val4j.apis.riotgames.official.RiotAuthAPI;
import dev.piste.api.val4j.apis.riotgames.official.models.AccountTokens;
import dev.piste.api.val4j.apis.riotgames.official.models.UserInfo;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestRiotAuthAPI {

    @Test
    public void testGetAccountTokens() throws IOException {
        AccountTokens accountTokens = new RiotAuthAPI().getTokens(getAccountUsername(), getAccountPassword());
        assertTrue(accountTokens != null && accountTokens.getAccessToken() != null && accountTokens.getIdToken() != null);
    }

    @Test
    public void testGetUserInfo() throws IOException {
        RiotAuthAPI riotAuthAPI = new RiotAuthAPI();
        String accessToken = riotAuthAPI.getTokens(getAccountUsername(), getAccountPassword()).getAccessToken();
        UserInfo userInfo = riotAuthAPI.getUserInfo(accessToken);
        assertTrue(userInfo != null && userInfo.getPuuid() != null && userInfo.getJwtId() != null);
    }

    private String getAccountUsername() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("username").getAsString();
    }

    private String getAccountPassword() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonObject.class).getAsJsonObject("riotAccount").get("password").getAsString();
    }

}