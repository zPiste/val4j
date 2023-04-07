package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.unofficial.RiotLocalAPI;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyAccessibility;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyState;
import dev.piste.api.val4j.apis.riotgames.official.enums.PresenceState;
import dev.piste.api.val4j.apis.riotgames.official.enums.SessionState;
import dev.piste.api.val4j.apis.riotgames.unofficial.models.OwnPresence;
import dev.piste.api.val4j.apis.riotgames.official.models.StatusData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.Instant;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestRiotLocalAPI {

    @Test
    public void testSetOwnPresence() throws IOException {
        RiotLocalAPI localAPI = new RiotLocalAPI();

        StatusData statusData = new StatusData()
                .setValid(true)
                .setSessionState(SessionState.INGAME)
                .setPartyOwnerProvisioningFlowId("Matchmaking")
                .setProvisioningFlowId("Matchmaking")
                .setPartyOwner(true)
                .setPartyState(PartyState.DEFAULT)
                .setPartyAccessibility(PartyAccessibility.CLOSED)
                .setMaxPartySize(5)
                .setPartySize(5)
                .setQueueId("competitive")
                .setPartyVersion(Instant.now().toEpochMilli())
                .setPartyClientVersion("release-06.06-shipping-15-851458")
                .setCompetitiveTierId(23);

        OwnPresence ownPresence = new OwnPresence()
                .setState(PresenceState.CHAT)
                .setStatusData(statusData);

        localAPI.setOwnPresence(ownPresence);
    }

}