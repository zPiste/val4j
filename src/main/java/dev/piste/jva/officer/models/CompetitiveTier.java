package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class CompetitiveTier {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("assetObjectName")
    private String assetObjectName;
    @SerializedName("tiers")
    private Rank[] ranks;

    public static class Rank {

        @SerializedName("tier")
        private int id;
        @SerializedName("tierName")
        private String name;
        @SerializedName("division")
        private String divisionObjectName;
        @SerializedName("divisionName")
        private String divisionName;
        @SerializedName("color")
        private String color;
        @SerializedName("backgroundColor")
        private String backgroundColor;
        @SerializedName("smallIcon")
        private String smallIcon;
        @SerializedName("largeIcon")
        private String largeIcon;
        @SerializedName("rankTriangleDownIcon")
        private String rankTriangleDownIcon;
        @SerializedName("rankTriangleUpIcon")
        private String rankTriangleUpIcon;

        public int getID() {
            return id;
        }

        public String getName() {
            return name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        }

        public String getDivisionObjectName() {
            return divisionObjectName;
        }

        public String getDivisionName() {
            return divisionName.substring(0, 1).toUpperCase() + divisionName.substring(1).toLowerCase();
        }

        public String getColor() {
            return color;
        }

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public String getSmallIcon() {
            return smallIcon;
        }

        public String getLargeIcon() {
            return largeIcon;
        }

        public String getRankTriangleDownIcon() {
            return rankTriangleDownIcon;
        }

        public String getRankTriangleUpIcon() {
            return rankTriangleUpIcon;
        }

    }

}