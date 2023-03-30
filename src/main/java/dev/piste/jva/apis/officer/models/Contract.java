package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Contract {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("shipIt")
    private boolean shipIt;
    @SerializedName("freeRewardScheduleUuid")
    private String freeRewardScheduleUuid;
    @SerializedName("content")
    private Content content;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public boolean isShipIt() {
        return shipIt;
    }

    public String getFreeRewardScheduleUUID() {
        return freeRewardScheduleUuid;
    }

    public Content getContent() {
        return content;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public static class Content {

        @SerializedName("relationType")
        private String relationType;
        @SerializedName("relationUuid")
        private String relationUuid;
        @SerializedName("chapters")
        private Chapter[] chapters;
        @SerializedName("premiumRewardScheduleUuid")
        private String premiumRewardScheduleUuid;
        @SerializedName("premiumVPCost")
        private int premiumVPPrice;

        public String getRelationType() {
            return relationType;
        }

        public String getRelationUUID() {
            return relationUuid;
        }

        public Chapter[] getChapters() {
            return chapters;
        }

        public String getPremiumRewardScheduleUUID() {
            return premiumRewardScheduleUuid;
        }

        public int getPremiumVPPrice() {
            return premiumVPPrice;
        }

        public static class Chapter {

            @SerializedName("isEpilogue")
            private boolean epilogue;
            @SerializedName("levels")
            private Level[] levels;
            @SerializedName("freeRewards")
            private Reward[] freeRewards;

            public boolean isEpilogue() {
                return epilogue;
            }

            public Level[] getLevels() {
                return levels;
            }

            public Reward[] getFreeRewards() {
                return freeRewards;
            }

            public static class Level {

                @SerializedName("reward")
                private Reward reward;
                @SerializedName("xp")
                private int xp;
                @SerializedName("vpCost")
                private int price;
                @SerializedName("isPurchaseable")
                private boolean purchaseable;

                public Reward getReward() {
                    return reward;
                }

                public int getXp() {
                    return xp;
                }

                public int getPrice() {
                    return price;
                }

                public boolean isPurchaseable() {
                    return purchaseable;
                }

            }

            public static class Reward {

                @SerializedName("type")
                private String type;
                @SerializedName("uuid")
                private String uuid;
                @SerializedName("amount")
                private int amount;
                @SerializedName("isHighlighted")
                private boolean highlighted;

                public String getType() {
                    return type;
                }

                public String getUUID() {
                    return uuid;
                }

                public int getAmount() {
                    return amount;
                }

                public boolean isHighlighted() {
                    return highlighted;
                }

            }

        }

    }

}