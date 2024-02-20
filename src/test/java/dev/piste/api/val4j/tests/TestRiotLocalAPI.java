package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.internal.RiotLocalAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyAccessibility;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyState;
import dev.piste.api.val4j.apis.riotgames.official.enums.PresenceState;
import dev.piste.api.val4j.apis.riotgames.official.enums.SessionState;
import dev.piste.api.val4j.apis.riotgames.internal.models.OwnPresence;
import dev.piste.api.val4j.apis.riotgames.official.models.StatusData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Instant;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("RiotGames Internal Local API")
public class TestRiotLocalAPI {

    private final RiotLocalAPI api;

    public TestRiotLocalAPI() throws IOException {
        this.api = new RiotLocalAPI();
    }

    @Test
    public void testSetOwnPresence() throws IOException {
        StatusData statusData = new StatusData()
                .setValid(true)
                .setSessionState(SessionState.INGAME)
                .setPartyOwnerProvisioningFlowID("Matchmaking")
                .setProvisioningFlowID("Matchmaking")
                .setPartyOwner(true)
                .setPartyState(PartyState.DEFAULT)
                .setPartyAccessibility(PartyAccessibility.CLOSED)
                .setMaxPartySize(5)
                .setPartySize(5)
                .setQueueID("competitive")
                .setPartyVersion(Instant.now().toEpochMilli())
                .setPartyClientVersion("release-06.06-shipping-15-851458")
                .setCompetitiveTierID(23);

        OwnPresence ownPresence = new OwnPresence()
                .setState(PresenceState.CHAT)
                .setStatusData(statusData);

        api.setOwnPresence(ownPresence);
    }

}