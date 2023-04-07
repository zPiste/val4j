package dev.piste.api.val4j.tests;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import dev.piste.api.val4j.apis.riotgames.official.RiotAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotCluster;
import dev.piste.api.val4j.apis.riotgames.official.enums.RiotShard;
import dev.piste.api.val4j.apis.riotgames.official.models.RiotAccount;
import dev.piste.api.val4j.http.exceptions.HttpStatusException;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestRiotAPI {

    @Test
    public void testGetAccountByRiotID() throws IOException {
        RiotAccount riotAccount = new RiotAPI(getAPIKey(), RiotCluster.EUROPE)
                .getAccount("Piste", "DEV");
        assertNotNull(riotAccount);
        assertNotNull(riotAccount.getPuuid());
        assertNotNull(riotAccount.getName());
        assertNotNull(riotAccount.getTag());
    }

    @Test
    public void testGetAccountByPUUID() throws IOException {
        RiotAccount riotAccount = new RiotAPI(getAPIKey(), RiotCluster.EUROPE)
                .getAccount("qxJfDkwqd-CdVVmOh_KiwfNkGlneClT8L_DCDSQzjD5aOmm7MhtsV6HR0UpBSnB4h4UUfNvq6WU_tQ");
        assertNotNull(riotAccount);
        assertNotNull(riotAccount.getPuuid());
        assertNotNull(riotAccount.getName());
        assertNotNull(riotAccount.getTag());
    }

    @Test
    public void testGetAccountByAccessToken() throws IOException {
        // Not possible to check if the token is valid, so we just check if the request is successful
        try {
            new RiotAPI(getAPIKey(), RiotCluster.EUROPE)
                    .getAccountByToken("");
        } catch (HttpStatusException ignored) {}
    }

    @Test
    public void testGetActiveShard() throws IOException {
        RiotShard riotShard = new RiotAPI(getAPIKey(), RiotCluster.EUROPE)
                .getActiveShard("qxJfDkwqd-CdVVmOh_KiwfNkGlneClT8L_DCDSQzjD5aOmm7MhtsV6HR0UpBSnB4h4UUfNvq6WU_tQ");
        assertNotNull(riotShard);
    }

    private String getAPIKey() throws FileNotFoundException {
        return new Gson().fromJson(new FileReader("tokens.json"), JsonElement.class).getAsJsonObject().get("riotGamesApiKey").getAsString();
    }

}