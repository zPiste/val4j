package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Map {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("coordinates")
    private String coordinates;
    @SerializedName("displayIcon")
    private String minimapImageUrl;
    @SerializedName("listViewIcon")
    private String listImageUrl;
    @SerializedName("splash")
    private String largeImageUrl;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("mapUrl")
    private String url;
    @SerializedName("xMultiplier")
    private double xMultiplier;
    @SerializedName("yMultiplier")
    private double yMultiplier;
    @SerializedName("xScalarToAdd")
    private double xScalarToAdd;
    @SerializedName("yScalarToAdd")
    private double yScalarToAdd;
    @SerializedName("callouts")
    private Callout[] callouts;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public String getMinimapImageUrl() {
        return minimapImageUrl;
    }

    public String getListImageUrl() {
        return listImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getUrl() {
        return url;
    }

    public double getxMultiplier() {
        return xMultiplier;
    }

    public double getyMultiplier() {
        return yMultiplier;
    }

    public double getxScalarToAdd() {
        return xScalarToAdd;
    }

    public double getyScalarToAdd() {
        return yScalarToAdd;
    }

    public Callout[] getCallouts() {
        return callouts;
    }

    public static class Callout {

        @SerializedName("regionName")
        private String regionName;
        @SerializedName("superRegionName")
        private String superRegionName;
        @SerializedName("location")
        private Location location;

        public String getRegionName() {
            return regionName;
        }

        public String getSuperRegionName() {
            return superRegionName;
        }

        public Location getLocation() {
            return location;
        }

        public static class Location {

            @SerializedName("x")
            private double x;
            @SerializedName("y")
            private double y;

            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }

        }

    }

}