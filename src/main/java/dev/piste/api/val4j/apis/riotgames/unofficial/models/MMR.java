package dev.piste.api.val4j.apis.riotgames.unofficial.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class MMR {

    @SerializedName("Version")
    private long versionDateInMillis;
    @SerializedName("Subject")
    private String puuid;
    @SerializedName("NewPlayerExperienceFinished")
    private boolean onboardingFinished;
    @SerializedName("QueueSkills")
    private QueueStats queueStats;
    @SerializedName("LatestCompetitiveUpdate")
    private CompetitiveUpdate latestCompetitiveUpdate;
    @SerializedName("IsLeaderboardAnonymized")
    private boolean leaderboardAnonymized;
    @SerializedName("IsActRankBadgeHidden")
    private boolean actRankBadgeHidden;

    public LocalDateTime getVersionDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(versionDateInMillis), ZoneId.systemDefault());
    }

    public String getPuuid() {
        return puuid;
    }

    public boolean isOnboardingFinished() {
        return onboardingFinished;
    }

    public QueueStats getQueueStats() {
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

        @SerializedName("competitive")
        private Stats competitiveStats;
        @SerializedName("deathmatch")
        private Stats deathmatchStats;
        @SerializedName("ggteam")
        private Stats escalationStats;
        @SerializedName("newmap")
        private Stats newMapStats;
        @SerializedName("onefa")
        private Stats replicationStats;
        @SerializedName("snowball")
        private Stats snowballFightStats;
        @SerializedName("spikerush")
        private Stats spikeRushStats;
        @SerializedName("swiftplay")
        private Stats swiftPlayStats;
        @SerializedName("unrated")
        private Stats unratedStats;

        public Stats getCompetitiveStats() {
            return competitiveStats;
        }

        public Stats getDeathmatchStats() {
            return deathmatchStats;
        }

        public Stats getEscalationStats() {
            return escalationStats;
        }

        public Stats getNewMapStats() {
            return newMapStats;
        }

        public Stats getReplicationStats() {
            return replicationStats;
        }

        public Stats getSnowballFightStats() {
            return snowballFightStats;
        }

        public Stats getSpikeRushStats() {
            return spikeRushStats;
        }

        public Stats getSwiftPlayStats() {
            return swiftPlayStats;
        }

        public Stats getUnratedStats() {
            return unratedStats;
        }

        public static class Stats {

            @SerializedName("TotalGamesNeededForRating")
            private int totalGamesNeededForRating;
            @SerializedName("TotalGamesNeededForLeaderboard")
            private int totalGamesNeededForLeaderboard;
            @SerializedName("CurrentSeasonGamesNeededForRating")
            private int currentSeasonGamesNeededForRating;
            @SerializedName("SeasonalInfoBySeasonID")
            private SeasonalInfo seasonalInfo;

            public int getTotalGamesNeededForRating() {
                return totalGamesNeededForRating;
            }

            public int getTotalGamesNeededForLeaderboard() {
                return totalGamesNeededForLeaderboard;
            }

            public int getCurrentSeasonGamesNeededForRating() {
                return currentSeasonGamesNeededForRating;
            }

            public SeasonalInfo getSeasonalInfo() {
                return seasonalInfo;
            }

            public static class SeasonalInfo {

                @SerializedName("3f61c772-4560-cd3f-5d3f-a7ab5abda6b3")
                private Data episode1act1;
                @SerializedName("0530b9c4-4980-f2ee-df5d-09864cd00542")
                private Data episode1act2;
                @SerializedName("46ea6166-4573-1128-9cea-60a15640059b")
                private Data episode1act3;
                @SerializedName("97b6e739-44cc-ffa7-49ad-398ba502ceb0")
                private Data episode2act1;
                @SerializedName("ab57ef51-4e59-da91-cc8d-51a5a2b9b8ff")
                private Data episode2act2;
                @SerializedName("52e9749a-429b-7060-99fe-4595426a0cf7")
                private Data episode2act3;
                @SerializedName("2a27e5d2-4d30-c9e2-b15a-93b8909a442c")
                private Data episode3act1;
                @SerializedName("4cb622e1-4244-6da3-7276-8daaf1c01be2")
                private Data episode3act2;
                @SerializedName("a16955a5-4ad0-f761-5e9e-389df1c892fb")
                private Data episode3act3;
                @SerializedName("573f53ac-41a5-3a7d-d9ce-d6a6298e5704")
                private Data episode4act1;
                @SerializedName("d929bc38-4ab6-7da4-94f0-ee84f8ac141e")
                private Data episode4act2;
                @SerializedName("3e47230a-463c-a301-eb7d-67bb60357d4f")
                private Data episode4act3;
                @SerializedName("67e373c7-48f7-b422-641b-079ace30b427")
                private Data episode5act1;
                @SerializedName("7a85de9a-4032-61a9-61d8-f4aa2b4a84b6")
                private Data episode5act2;
                @SerializedName("aca29595-40e4-01f5-3f35-b1b3d304c96e")
                private Data episode5act3;
                @SerializedName("9c91a445-4f78-1baa-a3ea-8f8aadf4914d")
                private Data episode6act1;
                @SerializedName("34093c29-4306-43de-452f-3f944bde22be")
                private Data episode6act2;
                @SerializedName("2de5423b-4aad-02ad-8d9b-c0a931958861")
                private Data episode6act3;

                public Data getEpisode1Act1() {
                    return episode1act1;
                }

                public Data getEpisode1Act2() {
                    return episode1act2;
                }

                public Data getEpisode1Act3() {
                    return episode1act3;
                }

                public Data getEpisode2Act1() {
                    return episode2act1;
                }

                public Data getEpisode2Act2() {
                    return episode2act2;
                }

                public Data getEpisode2Act3() {
                    return episode2act3;
                }

                public Data getEpisode3Act1() {
                    return episode3act1;
                }

                public Data getEpisode3Act2() {
                    return episode3act2;
                }

                public Data getEpisode3Act3() {
                    return episode3act3;
                }

                public Data getEpisode4Act1() {
                    return episode4act1;
                }

                public Data getEpisode4Act2() {
                    return episode4act2;
                }

                public Data getEpisode4Act3() {
                    return episode4act3;
                }

                public Data getEpisode5Act1() {
                    return episode5act1;
                }

                public Data getEpisode5Act2() {
                    return episode5act2;
                }

                public Data getEpisode5Act3() {
                    return episode5act3;
                }

                public Data getEpisode6Act1() {
                    return episode6act1;
                }

                public Data getEpisode6Act2() {
                    return episode6act2;
                }

                public Data getEpisode6Act3() {
                    return episode6act3;
                }

                public Data[] getAll() {
                    return new Data[] {
                            episode1act1,
                            episode1act2,
                            episode1act3,
                            episode2act1,
                            episode2act2,
                            episode2act3,
                            episode3act1,
                            episode3act2,
                            episode3act3,
                            episode4act1,
                            episode4act2,
                            episode4act3,
                            episode5act1,
                            episode5act2,
                            episode5act3,
                            episode6act1,
                            episode6act2,
                            episode6act3
                    };
                }

                public Data getByUuid(String uuid) {
                    for (Data data : getAll()) {
                        if (data.getSeasonUuid().equals(uuid)) {
                            return data;
                        }
                    }
                    return null;
                }

                public static class Data {

                    @SerializedName("SeasonID")
                    private String seasonUuid;
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
                    private int competitiveTierId;
                    @SerializedName("RankedRating")
                    private int rankedRating;
                    @SerializedName("WinsByTier")
                    private WinsByTier winsByTier;
                    @SerializedName("GamesNeededForRating")
                    private int gamesNeededForRating;
                    @SerializedName("TotalWinsNeededForRank")
                    private int totalWinsNeededForRank;

                    public String getSeasonUuid() {
                        return seasonUuid;
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

                    public int getCompetitiveTierId() {
                        return competitiveTierId;
                    }

                    public int getRankedRating() {
                        return rankedRating;
                    }

                    public WinsByTier getWinsByTier() {
                        return winsByTier;
                    }

                    public int getGamesNeededForRating() {
                        return gamesNeededForRating;
                    }

                    public int getTotalWinsNeededForRank() {
                        return totalWinsNeededForRank;
                    }

                    public static class WinsByTier {

                        @SerializedName("0")
                        private int unrankedWinCount;
                        @SerializedName("3")
                        private int iron1WinCount;
                        @SerializedName("4")
                        private int iron2WinCount;
                        @SerializedName("5")
                        private int iron3WinCount;
                        @SerializedName("6")
                        private int bronze1WinCount;
                        @SerializedName("7")
                        private int bronze2WinCount;
                        @SerializedName("8")
                        private int bronze3WinCount;
                        @SerializedName("9")
                        private int silver1WinCount;
                        @SerializedName("10")
                        private int silver2WinCount;
                        @SerializedName("11")
                        private int silver3WinCount;
                        @SerializedName("12")
                        private int gold1WinCount;
                        @SerializedName("13")
                        private int gold2WinCount;
                        @SerializedName("14")
                        private int gold3WinCount;
                        @SerializedName("15")
                        private int platinum1WinCount;
                        @SerializedName("16")
                        private int platinum2WinCount;
                        @SerializedName("17")
                        private int platinum3WinCount;
                        @SerializedName("18")
                        private int diamond1WinCount;
                        @SerializedName("19")
                        private int diamond2WinCount;
                        @SerializedName("20")
                        private int diamond3WinCount;
                        @SerializedName("21")
                        private int ascendant1WinCount;
                        @SerializedName("22")
                        private int ascendant2WinCount;
                        @SerializedName("23")
                        private int ascendant3WinCount;
                        @SerializedName("24")
                        private int immortal1WinCount;
                        @SerializedName("25")
                        private int immortal2WinCount;
                        @SerializedName("26")
                        private int immortal3WinCount;
                        @SerializedName("27")
                        private int radiantWinCount;

                        public int getUnrankedWinCount() {
                            return unrankedWinCount;
                        }

                        public int getIron1WinCount() {
                            return iron1WinCount;
                        }

                        public int getIron2WinCount() {
                            return iron2WinCount;
                        }

                        public int getIron3WinCount() {
                            return iron3WinCount;
                        }

                        public int getBronze1WinCount() {
                            return bronze1WinCount;
                        }

                        public int getBronze2WinCount() {
                            return bronze2WinCount;
                        }

                        public int getBronze3WinCount() {
                            return bronze3WinCount;
                        }

                        public int getSilver1WinCount() {
                            return silver1WinCount;
                        }

                        public int getSilver2WinCount() {
                            return silver2WinCount;
                        }

                        public int getSilver3WinCount() {
                            return silver3WinCount;
                        }

                        public int getGold1WinCount() {
                            return gold1WinCount;
                        }

                        public int getGold2WinCount() {
                            return gold2WinCount;
                        }

                        public int getGold3WinCount() {
                            return gold3WinCount;
                        }

                        public int getPlatinum1WinCount() {
                            return platinum1WinCount;
                        }

                        public int getPlatinum2WinCount() {
                            return platinum2WinCount;
                        }

                        public int getPlatinum3WinCount() {
                            return platinum3WinCount;
                        }

                        public int getDiamond1WinCount() {
                            return diamond1WinCount;
                        }

                        public int getDiamond2WinCount() {
                            return diamond2WinCount;
                        }

                        public int getDiamond3WinCount() {
                            return diamond3WinCount;
                        }

                        public int getAscendant1WinCount() {
                            return ascendant1WinCount;
                        }

                        public int getAscendant2WinCount() {
                            return ascendant2WinCount;
                        }

                        public int getAscendant3WinCount() {
                            return ascendant3WinCount;
                        }

                        public int getImmortal1WinCount() {
                            return immortal1WinCount;
                        }

                        public int getImmortal2WinCount() {
                            return immortal2WinCount;
                        }

                        public int getImmortal3WinCount() {
                            return immortal3WinCount;
                        }

                        public int getRadiantWinCount() {
                            return radiantWinCount;
                        }

                    }

                }

            }

        }

    }

    public static class CompetitiveUpdate {

        @SerializedName("MatchID")
        private String matchUuid;
        @SerializedName("MapID")
        private String mapUrl;
        @SerializedName("SeasonID")
        private String seasonUuid;
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

        public String getMatchUuid() {
            return matchUuid;
        }

        public String getMapUrl() {
            return mapUrl;
        }

        public String getSeasonUuid() {
            return seasonUuid;
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

        public int getAfkPenalty() {
            return afkPenalty;
        }

    }

}