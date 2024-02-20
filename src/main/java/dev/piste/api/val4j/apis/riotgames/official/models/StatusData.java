package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.riotgames.official.enums.MatchTeam;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyAccessibility;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyState;
import dev.piste.api.val4j.apis.riotgames.official.enums.SessionState;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class StatusData {

    @SerializedName("isValid")
    private boolean valid;
    @SerializedName("sessionLoopState")
    private String sessionState;
    @SerializedName("partyOwnerSessionLoopState")
    private String partyOwnerSessionState;
    @SerializedName("customGameName")
    private String customGameName;
    @SerializedName("customGameTeam")
    private String customGameTeam;
    @SerializedName("partyOwnerMatchMap")
    private String partyOwnerMatchMapURL;
    @SerializedName("partyOwnerMatchCurrentTeam")
    private String partyOwnerMatchCurrentTeam;
    @SerializedName("partyOwnerMatchScoreAllyTeam")
    private int partyOwnerMatchScoreAllyTeam;
    @SerializedName("partyOwnerMatchScoreEnemyTeam")
    private int partyOwnerMatchScoreEnemyTeam;
    @SerializedName("partyOwnerProvisioningFlow")
    private String partyOwnerProvisioningFlowID;
    @SerializedName("provisioningFlow")
    private String provisioningFlowID;
    @SerializedName("matchMap")
    private String matchMapURL;
    @SerializedName("partyId")
    private String partyUUID;
    @SerializedName("isPartyOwner")
    private boolean partyOwner;
    @SerializedName("partyState")
    private String partyState;
    @SerializedName("partyAccessibility")
    private String partyAccessibility;
    @SerializedName("maxPartySize")
    private int maxPartySize;
    @SerializedName("queueId")
    private String queueID;
    @SerializedName("partyLFM")
    private boolean partyLFM;
    @SerializedName("partyClientVersion")
    private String partyClientVersion;
    @SerializedName("partySize")
    private int partySize;
    @SerializedName("tournamentId")
    private String tournamentID;
    @SerializedName("rosterId")
    private String rosterID;
    @SerializedName("partyVersion")
    private long partyVersion;
    @SerializedName("queueEntryTime")
    private String queueEntryTime;
    @SerializedName("playerCardId")
    private String playerCardUUID;
    @SerializedName("playerTitleId")
    private String playerTitleUUID;
    @SerializedName("preferredLevelBorderId")
    private String preferredLevelBorderUUID;
    @SerializedName("accountLevel")
    private int accountLevel;
    @SerializedName("competitiveTier")
    private int competitiveTierID;
    @SerializedName("leaderboardPosition")
    private int leaderboardPosition;
    @SerializedName("isIdle")
    private boolean idle;

    public StatusData setValid(boolean valid) {
        this.valid = valid;
        return this;
    }

    public StatusData setSessionState(SessionState sessionState) {
        this.sessionState = sessionState.getID();
        return this;
    }

    public StatusData setPartyOwnerSessionState(SessionState partyOwnerSessionState) {
        this.partyOwnerSessionState = partyOwnerSessionState.getID();
        return this;
    }

    public StatusData setCustomGameName(String customGameName) {
        this.customGameName = customGameName;
        return this;
    }

    public StatusData setCustomGameTeam(MatchTeam matchTeam) {
        this.customGameTeam = matchTeam.getID();
        return this;
    }

    public StatusData setPartyOwnerMatchMapURL(String partyOwnerMatchMapURL) {
        this.partyOwnerMatchMapURL = partyOwnerMatchMapURL;
        return this;
    }

    public StatusData setPartyOwnerMatchCurrentTeam(MatchTeam partyOwnerMatchCurrentTeam) {
        this.partyOwnerMatchCurrentTeam = partyOwnerMatchCurrentTeam.getID();
        return this;
    }

    public StatusData setPartyOwnerMatchScoreAllyTeam(int partyOwnerMatchScoreAllyTeam) {
        this.partyOwnerMatchScoreAllyTeam = partyOwnerMatchScoreAllyTeam;
        return this;
    }

    public StatusData setPartyOwnerMatchScoreEnemyTeam(int partyOwnerMatchScoreEnemyTeam) {
        this.partyOwnerMatchScoreEnemyTeam = partyOwnerMatchScoreEnemyTeam;
        return this;
    }

    public StatusData setPartyOwnerProvisioningFlowID(String partyOwnerProvisioningFlowID) {
        this.partyOwnerProvisioningFlowID = partyOwnerProvisioningFlowID;
        return this;
    }

    public StatusData setProvisioningFlowID(String provisioningFlowID) {
        this.provisioningFlowID = provisioningFlowID;
        return this;
    }

    public StatusData setMatchMapURL(String matchMapUrl) {
        this.matchMapURL = matchMapURL;
        return this;
    }

    public StatusData setPartyUUID(String partyUuid) {
        this.partyUUID = partyUUID;
        return this;
    }

    public StatusData setPartyOwner(boolean partyOwner) {
        this.partyOwner = partyOwner;
        return this;
    }

    public StatusData setPartyState(PartyState partyState) {
        this.partyState = partyState.getID();
        return this;
    }

    public StatusData setPartyAccessibility(PartyAccessibility partyAccessibility) {
        this.partyAccessibility = partyAccessibility.getID();
        return this;
    }

    public StatusData setMaxPartySize(int maxPartySize) {
        this.maxPartySize = maxPartySize;
        return this;
    }

    public StatusData setQueueID(String queueID) {
        this.queueID = queueID;
        return this;
    }

    public StatusData setPartyLFM(boolean partyLFM) {
        this.partyLFM = partyLFM;
        return this;
    }

    public StatusData setPartyClientVersion(String partyClientVersion) {
        this.partyClientVersion = partyClientVersion;
        return this;
    }

    public StatusData setPartySize(int partySize) {
        this.partySize = partySize;
        return this;
    }

    public StatusData setTournamentID(String tournamentID) {
        this.tournamentID = tournamentID;
        return this;
    }

    public StatusData setRosterID(String rosterID) {
        this.rosterID = rosterID;
        return this;
    }

    public StatusData setPartyVersion(long partyVersion) {
        this.partyVersion = partyVersion;
        return this;
    }

    public StatusData setQueueEntryTime(String queueEntryTime) {
        this.queueEntryTime = queueEntryTime;
        return this;
    }

    public StatusData setPlayerCardUUID(String playerCardUUID) {
        this.playerCardUUID = playerCardUUID;
        return this;
    }

    public StatusData setPlayerTitleUUID(String playerTitleUUID) {
        this.playerTitleUUID = playerTitleUUID;
        return this;
    }

    public StatusData setPreferredLevelBorderUUID(String preferredLevelBorderUUID) {
        this.preferredLevelBorderUUID = preferredLevelBorderUUID;
        return this;
    }

    public StatusData setAccountLevel(int accountLevel) {
        this.accountLevel = accountLevel;
        return this;
    }

    public StatusData setCompetitiveTierID(int competitiveTierID) {
        this.competitiveTierID = competitiveTierID;
        return this;
    }

    public StatusData setLeaderboardPosition(int leaderboardPosition) {
        this.leaderboardPosition = leaderboardPosition;
        return this;
    }

    public StatusData setIdle(boolean idle) {
        this.idle = idle;
        return this;
    }

}