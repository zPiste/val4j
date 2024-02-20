package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class CompetitiveUpdates {

    @SerializedName("Version")
    private int version;
    @SerializedName("Subject")
    private String playerUUID;
    @SerializedName("Matches")
    private Match[] matches;

    public int getVersion() {
        return version;
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public Match[] getMatches() {
        return matches;
    }

    public static class Match {

        @SerializedName("MatchID")
        private String uuid;
        @SerializedName("MapID")
        private String mapURL;
        @SerializedName("SeasonID")
        private String seasonUUID;
        @SerializedName("MatchStartTime")
        private long matchStartTimeInMillis;
        @SerializedName("TierAfterUpdate")
        private int tierIdAfterUpdate;
        @SerializedName("TierBeforeUpdate")
        private int tierIdBeforeUpdate;
        @SerializedName("RankedRatingAfterUpdate")
        private int rankedRatingAfterUpdate;
        @SerializedName("RankedRatingBeforeUpdate")
        private int rankedRatingBeforeUpdate;
        @SerializedName("RankedRatingEarned")
        private int earnedRankedRating;
        @SerializedName("RankedRatingPerformanceBonus")
        private int performanceBonus;
        @SerializedName("CompetitiveMovement")
        private String competitiveMovement;
        @SerializedName("AFKPenalty")
        private int afkPenalty;

        public String getUUID() {
            return uuid;
        }

        public String getMapURL() {
            return mapURL;
        }

        public String getSeasonUUID() {
            return seasonUUID;
        }

        public LocalDateTime getMatchStartTime() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(matchStartTimeInMillis), ZoneId.systemDefault());
        }

        public int getTierIdAfterUpdate() {
            return tierIdAfterUpdate;
        }

        public int getTierIdBeforeUpdate() {
            return tierIdBeforeUpdate;
        }

        public int getRankedRatingAfterUpdate() {
            return rankedRatingAfterUpdate;
        }

        public int getRankedRatingBeforeUpdate() {
            return rankedRatingBeforeUpdate;
        }

        public int getEarnedRankedRating() {
            return earnedRankedRating;
        }

        public int getPerformanceBonus() {
            return performanceBonus;
        }

        public String getCompetitiveMovement() {
            return competitiveMovement;
        }

        public int getAFKPenalty() {
            return afkPenalty;
        }

    }

}