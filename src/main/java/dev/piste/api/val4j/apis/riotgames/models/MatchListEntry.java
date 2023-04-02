package dev.piste.api.val4j.apis.riotgames.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class MatchListEntry {

    @SerializedName("matchId")
    private String matchUuid;
    @SerializedName("gameStartTimeMillis")
    private long gameStartTimeMillis;
    @SerializedName("teamId")
    private String teamId;

    public String getMatchUUID() {
        return matchUuid;
    }

    public LocalDateTime getGameStartTime() {
        return LocalDateTime.ofEpochSecond(gameStartTimeMillis / 1000, 0, ZoneOffset.UTC);
    }

    public String getTeamId() {
        return teamId;
    }

}