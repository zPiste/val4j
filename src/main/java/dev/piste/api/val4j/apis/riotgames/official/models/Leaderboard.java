package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Leaderboard {

    @SerializedName("actId")
    private String actUuid;
    @SerializedName("players")
    private Player[] players;
    @SerializedName("totalPlayers")
    private int totalPlayerCount;
    @SerializedName("immortalStartingPage")
    private int immortalStartingPage;
    @SerializedName("immortalStartingIndex")
    private int immortalStartingIndex;
    @SerializedName("topTierRRThreshold")
    private int topTierRankRatingThreshold;
    @SerializedName("tierDetails")
    private TierDetails tierDetails;

    public String getActUuid() {
        return actUuid;
    }

    public Player[] getPlayers() {
        return players;
    }

    public int getTotalPlayerCount() {
        return totalPlayerCount;
    }

    public int getImmortalStartingPage() {
        return immortalStartingPage;
    }

    public int getImmortalStartingIndex() {
        return immortalStartingIndex;
    }

    public int getTopTierRankRatingThreshold() {
        return topTierRankRatingThreshold;
    }

    public TierDetails getTierDetails() {
        return tierDetails;
    }

    public static class Player {

        @SerializedName("puuid")
        private String puuid;
        @SerializedName("gameName")
        private String name;
        @SerializedName("tagLine")
        private String tag;
        @SerializedName("leaderboardRank")
        private int leaderboardRank;
        @SerializedName("rankedRating")
        private int rankRating;
        @SerializedName("numberOfWins")
        private int winCount;
        @SerializedName("competitiveTier")
        private int competitiveTierId;

        public String getPuuid() {
            return puuid;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public int getLeaderboardRank() {
            return leaderboardRank;
        }

        public int getRankRating() {
            return rankRating;
        }

        public int getWinCount() {
            return winCount;
        }

        public int getCompetitiveTierId() {
            return competitiveTierId;
        }
    }

    public static class TierDetails {

        @SerializedName("24")
        private Tier immortal1;
        @SerializedName("25")
        private Tier immortal2;
        @SerializedName("26")
        private Tier immortal3;
        @SerializedName("27")
        private Tier radiant;

        public Tier getImmortal1() {
            return immortal1;
        }

        public Tier getImmortal2() {
            return immortal2;
        }

        public Tier getImmortal3() {
            return immortal3;
        }

        public Tier getRadiant() {
            return radiant;
        }

        public static class Tier {

            @SerializedName("rankedRatingThreshold")
            private int neededRankRating;
            @SerializedName("startingPage")
            private int startingPage;
            @SerializedName("startingIndex")
            private int startingIndex;

            public int getNeededRankRating() {
                return neededRankRating;
            }

            public int getStartingPage() {
                return startingPage;
            }

            public int getStartingIndex() {
                return startingIndex;
            }

        }

    }

}