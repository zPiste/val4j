package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class MMR {

    @SerializedName("Version")
    private long versionDateInMillis;
    @SerializedName("Subject")
    private String playerUUID;
    @SerializedName("NewPlayerExperienceFinished")
    private boolean onboardingFinished;
    @SerializedName("QueueSkills")
    private QueueStats[] queueStats;
    @SerializedName("LatestCompetitiveUpdate")
    private CompetitiveUpdate latestCompetitiveUpdate;
    @SerializedName("IsLeaderboardAnonymized")
    private boolean leaderboardAnonymized;
    @SerializedName("IsActRankBadgeHidden")
    private boolean actRankBadgeHidden;

    public LocalDateTime getVersionDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(versionDateInMillis), ZoneId.systemDefault());
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public boolean isOnboardingFinished() {
        return onboardingFinished;
    }

    public QueueStats[] getQueueStats() {
        return queueStats;
    }

    public CompetitiveUpdate getLatestCompetitiveUpdate() {
        return latestCompetitiveUpdate;
    }

    public boolean isLeaderboardAnonymized() {
        return leaderboardAnonymized;
    }

    public boolean isActRankBadgeHidden() {
        return actRankBadgeHidden;
    }

    public static class QueueStats {

        @SerializedName("queueId")
        private String queueID;
        @SerializedName("TotalGamesNeededForRating")
        private int totalGamesNeededForRating;
        @SerializedName("TotalGamesNeededForLeaderboard")
        private int totalGamesNeededForLeaderboard;
        @SerializedName("CurrentSeasonGamesNeededForRating")
        private int currentSeasonGamesNeededForRating;
        @SerializedName("SeasonalInfoBySeasonID")
        private SeasonalInfo[] seasonalInfo;

        public String getQueueID() {
            return queueID;
        }

        public int getTotalGamesNeededForRating() {
            return totalGamesNeededForRating;
        }

        public int getTotalGamesNeededForLeaderboard() {
            return totalGamesNeededForLeaderboard;
        }

        public int getCurrentSeasonGamesNeededForRating() {
            return currentSeasonGamesNeededForRating;
        }

        public SeasonalInfo[] getSeasonalInfo() {
            return seasonalInfo;
        }

        public static class SeasonalInfo {

            @SerializedName("SeasonID")
            private String seasonUUID;
            @SerializedName("NumberOfWins")
            private int winCount;
            @SerializedName("NumberOfWinsWithPlacements")
            private int winCountWithPlacements;
            @SerializedName("NumberOfGames")
            private int gameCount;
            @SerializedName("Rank")
            private int rank;
            @SerializedName("CapstoneWins")
            private int capstoneWins;
            @SerializedName("LeaderboardRank")
            private int leaderboardRank;
            @SerializedName("CompetitiveTier")
            private int competitiveTierID;
            @SerializedName("RankedRating")
            private int rankedRating;
            @SerializedName("WinsByTier")
            private WinsByTier[] winsByTiers;
            @SerializedName("GamesNeededForRating")
            private int gamesNeededForRating;
            @SerializedName("TotalWinsNeededForRank")
            private int totalWinsNeededForRank;

            public String getSeasonUUID() {
                return seasonUUID;
            }

            public int getWinCount() {
                return winCount;
            }

            public int getWinCountWithPlacements() {
                return winCountWithPlacements;
            }

            public int getGameCount() {
                return gameCount;
            }

            public int getRank() {
                return rank;
            }

            public int getCapstoneWins() {
                return capstoneWins;
            }

            public int getLeaderboardRank() {
                return leaderboardRank;
            }

            public int getCompetitiveTierID() {
                return competitiveTierID;
            }

            public int getRankedRating() {
                return rankedRating;
            }

            public WinsByTier[] getWinsByTiers() {
                return winsByTiers;
            }

            public int getGamesNeededForRating() {
                return gamesNeededForRating;
            }

            public int getTotalWinsNeededForRank() {
                return totalWinsNeededForRank;
            }

            public static class WinsByTier {

                @SerializedName("tierId")
                private int tierID;
                @SerializedName("winCount")
                private int winCount;

                public int getTierID() {
                    return tierID;
                }

                public int getWinCount() {
                    return winCount;
                }

            }

        }

    }

    public static class CompetitiveUpdate {

        @SerializedName("MatchID")
        private String matchUUID;
        @SerializedName("MapID")
        private String mapURL;
        @SerializedName("SeasonID")
        private String seasonUUID;
        @SerializedName("MatchStartTime")
        private long matchStartDateInMillis;
        @SerializedName("TierAfterUpdate")
        private int competitiveTierIdAfterUpdate;
        @SerializedName("TierBeforeUpdate")
        private int competitiveTierIdBeforeUpdate;
        @SerializedName("RankedRatingAfterUpdate")
        private int rankedRatingAfterUpdate;
        @SerializedName("RankedRatingBeforeUpdate")
        private int rankedRatingBeforeUpdate;
        @SerializedName("RankedRatingEarned")
        private int rankedRatingEarned;
        @SerializedName("RankedRatingPerformanceBonus")
        private int rankedRatingPerformanceBonus;
        @SerializedName("CompetitiveMovement")
        private String competitiveMovement;
        @SerializedName("AFKPenalty")
        private int afkPenalty;

        public String getMatchUUID() {
            return matchUUID;
        }

        public String getMapURL() {
            return mapURL;
        }

        public String getSeasonUUID() {
            return seasonUUID;
        }

        public LocalDateTime getMatchStartDate() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(matchStartDateInMillis), ZoneId.systemDefault());
        }

        public int getCompetitiveTierIdAfterUpdate() {
            return competitiveTierIdAfterUpdate;
        }

        public int getCompetitiveTierIdBeforeUpdate() {
            return competitiveTierIdBeforeUpdate;
        }

        public int getRankedRatingAfterUpdate() {
            return rankedRatingAfterUpdate;
        }

        public int getRankedRatingBeforeUpdate() {
            return rankedRatingBeforeUpdate;
        }

        public int getRankedRatingEarned() {
            return rankedRatingEarned;
        }

        public int getRankedRatingPerformanceBonus() {
            return rankedRatingPerformanceBonus;
        }

        public String getCompetitiveMovement() {
            return competitiveMovement;
        }

        public int getAFKPenalty() {
            return afkPenalty;
        }

    }

}