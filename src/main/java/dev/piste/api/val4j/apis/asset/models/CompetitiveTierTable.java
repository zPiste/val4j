package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class CompetitiveTierTable {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("assetObjectName")
    private String assetName;
    @SerializedName("tiers")
    private Tier[] tiers;

    public String getUUID() {
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
        private String smallIconURL;
        @SerializedName("largeIcon")
        private String largeIconURL;
        @SerializedName("rankTriangleDownIcon")
        private String triangleDownIconURL;
        @SerializedName("rankTriangleUpIcon")
        private String triangleUpIconURL;

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

        public String getPrimaryColor() {
            return primaryColor;
        }

        public String getBackgroundColor() {
            return backgroundColor;
        }

        public String getSmallIconURL() {
            return smallIconURL;
        }

        public String getLargeIconURL() {
            return largeIconURL;
        }

        public String getTriangleDownIconURL() {
            return triangleDownIconURL;
        }

        public String getTriangleUpIconURL() {
            return triangleUpIconURL;
        }

    }

}