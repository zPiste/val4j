package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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
    private String minimapImageURL;
    @SerializedName("listViewIcon")
    private String listImageURL;
    @SerializedName("splash")
    private String largeImageURL;
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

    public String getMinimapImageURL() {
        return minimapImageURL;
    }

    public String getListImageURL() {
        return listImageURL;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getURL() {
        return url;
    }

    public double getXMultiplier() {
        return xMultiplier;
    }

    public double getYMultiplier() {
        return yMultiplier;
    }

    public double getXScalarToAdd() {
        return xScalarToAdd;
    }

    public double getYScalarToAdd() {
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