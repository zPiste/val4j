package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.riotgames.official.enums.MatchTeam;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyAccessibility;
import dev.piste.api.val4j.apis.riotgames.official.enums.PartyState;
import dev.piste.api.val4j.apis.riotgames.official.enums.SessionState;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
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
    private String partyOwnerMatchMapUrl;
    @SerializedName("partyOwnerMatchCurrentTeam")
    private String partyOwnerMatchCurrentTeam;
    @SerializedName("partyOwnerMatchScoreAllyTeam")
    private int partyOwnerMatchScoreAllyTeam;
    @SerializedName("partyOwnerMatchScoreEnemyTeam")
    private int partyOwnerMatchScoreEnemyTeam;
    @SerializedName("partyOwnerProvisioningFlow")
    private String partyOwnerProvisioningFlowId;
    @SerializedName("provisioningFlow")
    private String provisioningFlowId;
    @SerializedName("matchMap")
    private String matchMapUrl;
    @SerializedName("partyId")
    private String partyUuid;
    @SerializedName("isPartyOwner")
    private boolean partyOwner;
    @SerializedName("partyState")
    private String partyState;
    @SerializedName("partyAccessibility")
    private String partyAccessibility;
    @SerializedName("maxPartySize")
    private int maxPartySize;
    @SerializedName("queueId")
    private String queueId;
    @SerializedName("partyLFM")
    private boolean partyLfm;
    @SerializedName("partyClientVersion")
    private String partyClientVersion;
    @SerializedName("partySize")
    private int partySize;
    @SerializedName("tournamentId")
    private String tournamentId;
    @SerializedName("rosterId")
    private String rosterId;
    @SerializedName("partyVersion")
    private long partyVersion;
    @SerializedName("queueEntryTime")
    private String queueEntryTime;
    @SerializedName("playerCardId")
    private String playerCardUuid;
    @SerializedName("playerTitleId")
    private String playerTitleUuid;
    @SerializedName("preferredLevelBorderId")
    private String preferredLevelBorderUuid;
    @SerializedName("accountLevel")
    private int accountLevel;
    @SerializedName("competitiveTier")
    private int competitiveTierId;
    @SerializedName("leaderboardPosition")
    private int leaderboardPosition;
    @SerializedName("isIdle")
    private boolean idle;

    public StatusData setValid(boolean valid) {
        this.valid = valid;
        return this;
    }

    public StatusData setSessionState(SessionState sessionState) {
        this.sessionState = sessionState.getId();
        return this;
    }

    public StatusData setPartyOwnerSessionState(SessionState partyOwnerSessionState) {
        this.partyOwnerSessionState = partyOwnerSessionState.getId();
        return this;
    }

    public StatusData setCustomGameName(String customGameName) {
        this.customGameName = customGameName;
        return this;
    }

    public StatusData setCustomGameTeam(MatchTeam matchTeam) {
        this.customGameTeam = matchTeam.getId();
        return this;
    }

    public StatusData setPartyOwnerMatchMapUrl(String partyOwnerMatchMapUrl) {
        this.partyOwnerMatchMapUrl = partyOwnerMatchMapUrl;
        return this;
    }

    public StatusData setPartyOwnerMatchCurrentTeam(MatchTeam partyOwnerMatchCurrentTeam) {
        this.partyOwnerMatchCurrentTeam = partyOwnerMatchCurrentTeam.getId();
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

    public StatusData setPartyOwnerProvisioningFlowId(String partyOwnerProvisioningFlowId) {
        this.partyOwnerProvisioningFlowId = partyOwnerProvisioningFlowId;
        return this;
    }

    public StatusData setProvisioningFlowId(String provisioningFlowId) {
        this.provisioningFlowId = provisioningFlowId;
        return this;
    }

    public StatusData setMatchMapUrl(String matchMapUrl) {
        this.matchMapUrl = matchMapUrl;
        return this;
    }

    public StatusData setPartyUuid(String partyUuid) {
        this.partyUuid = partyUuid;
        return this;
    }

    public StatusData setPartyOwner(boolean partyOwner) {
        this.partyOwner = partyOwner;
        return this;
    }

    public StatusData setPartyState(PartyState partyState) {
        this.partyState = partyState.getId();
        return this;
    }

    public StatusData setPartyAccessibility(PartyAccessibility partyAccessibility) {
        this.partyAccessibility = partyAccessibility.getId();
        return this;
    }

    public StatusData setMaxPartySize(int maxPartySize) {
        this.maxPartySize = maxPartySize;
        return this;
    }

    public StatusData setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    public StatusData setPartyLfm(boolean partyLfm) {
        this.partyLfm = partyLfm;
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

    public StatusData setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
        return this;
    }

    public StatusData setRosterId(String rosterId) {
        this.rosterId = rosterId;
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

    public StatusData setPlayerCardUuid(String playerCardUuid) {
        this.playerCardUuid = playerCardUuid;
        return this;
    }

    public StatusData setPlayerTitleUuid(String playerTitleUuid) {
        this.playerTitleUuid = playerTitleUuid;
        return this;
    }

    public StatusData setPreferredLevelBorderUuid(String preferredLevelBorderUuid) {
        this.preferredLevelBorderUuid = preferredLevelBorderUuid;
        return this;
    }

    public StatusData setAccountLevel(int accountLevel) {
        this.accountLevel = accountLevel;
        return this;
    }

    public StatusData setCompetitiveTierId(int competitiveTierId) {
        this.competitiveTierId = competitiveTierId;
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