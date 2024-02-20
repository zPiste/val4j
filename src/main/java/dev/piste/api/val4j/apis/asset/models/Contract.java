package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Contract {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("shipIt")
    private boolean shipIt;
    @SerializedName("freeRewardScheduleUuid")
    private String freeRewardScheduleUUID;
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

    public String getIconURL() {
        return iconURL;
    }

    public boolean isShipIt() {
        return shipIt;
    }

    public String getFreeRewardScheduleUUID() {
        return freeRewardScheduleUUID;
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
        private String relationUUID;
        @SerializedName("chapters")
        private Chapter[] chapters;
        @SerializedName("premiumRewardScheduleUuid")
        private String premiumRewardScheduleUUID;
        @SerializedName("premiumVPCost")
        private int premiumVPPrice;

        public String getRelationType() {
            return relationType;
        }

        public String getRelationUUID() {
            return relationUUID;
        }

        public Chapter[] getChapters() {
            return chapters;
        }

        public String getPremiumRewardScheduleUUID() {
            return premiumRewardScheduleUUID;
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
                private int vpPrice;
                @SerializedName("doughCost")
                private int doughPrice;
                @SerializedName("isPurchasableWithVP")
                private boolean purchasableWithVP;
                @SerializedName("isPurchasableWithDough")
                private boolean purchasableWithDough;

                public Reward getReward() {
                    return reward;
                }

                public int getXP() {
                    return xp;
                }

                public int getVPPrice() {
                    return vpPrice;
                }

                public int getDoughPrice() {
                    return doughPrice;
                }

                public boolean isPurchasableWithVP() {
                    return purchasableWithVP;
                }

                public boolean isPurchasableWithDough() {
                    return purchasableWithDough;
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