package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class MatchHistory {

    @SerializedName("puuid")
    private String puuid;
    @SerializedName("history")
    private Entry[] history;

    public String getPUUID() {
        return puuid;
    }

    public Entry[] getHistory() {
        return history;
    }

    public static class Entry {

        @SerializedName("matchId")
        private String matchUUID;
        @SerializedName("gameStartTimeMillis")
        private long gameStartTimeInMillis;
        @SerializedName("queueId")
        private String queueID;

        public String getMatchUUID() {
            return matchUUID;
        }

        public LocalDateTime getGameStartTime() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(gameStartTimeInMillis), ZoneId.systemDefault());
        }

        public String getQueueID() {
            return queueID;
        }
    }

}