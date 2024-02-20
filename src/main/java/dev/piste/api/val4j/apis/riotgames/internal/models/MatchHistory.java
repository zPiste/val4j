package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class MatchHistory {

    @SerializedName("Subject")
    private String playerUUID;
    @SerializedName("BeginIndex")
    private int beginIndex;
    @SerializedName("EndIndex")
    private int endIndex;
    @SerializedName("Total")
    private int totalCount;
    @SerializedName("History")
    private Entry[] history;

    public String getPlayerUUID() {
        return playerUUID;
    }

    public int getBeginIndex() {
        return beginIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public Entry[] getHistory() {
        return history;
    }

    public static class Entry {

        @SerializedName("MatchID")
        private String matchUUID;
        @SerializedName("GameStartTime")
        private long gameStartTimeInMillis;
        @SerializedName("QueueID")
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