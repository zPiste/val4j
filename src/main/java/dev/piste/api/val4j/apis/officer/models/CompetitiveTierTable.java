package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class CompetitiveTierTable {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("assetObjectName")
    private String assetName;
    @SerializedName("tiers")
    private Tier[] tiers;

    public String getUuid() {
        return uuid;
    }

    public String getAssetName() {
        return assetName;
    }

    public Tier[] getTiers() {
        return tiers;
    }

    public static class Tier {

        @SerializedName("tier")
        private int id;
        @SerializedName("tierName")
        private String name;
        @SerializedName("division")
        private String divisionObjectName;
        @SerializedName("divisionName")
        private String divisionName;
        @SerializedName("color")
        private String primaryColor;
        @SerializedName("backgroundColor")
        private String backgroundColor;
        @SerializedName("smallIcon")
        private String smallIconUrl;
        @SerializedName("largeIcon")
        private String largeIconUrl;
        @SerializedName("rankTriangleDownIcon")
        private String triangleDownIconUrl;
        @SerializedName("rankTriangleUpIcon")
        private String triangleUpIconUrl;

        public int getId() {
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

        public String getPrimaryColor() {
            return primaryColor;
        }

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public String getSmallIconUrl() {
            return smallIconUrl;
        }

        public String getLargeIconUrl() {
            return largeIconUrl;
        }

        public String getTriangleDownIconUrl() {
            return triangleDownIconUrl;
        }

        public String getTriangleUpIconUrl() {
            return triangleUpIconUrl;
        }

    }

}