package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.jva.officer.models.util.Location;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Map {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("coordinates")
    private String coordinates;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("listViewIcon")
    private String listIcon;
    @SerializedName("splash")
    private String splash;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("mapUrl")
    private String mapUrl;
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

    public String getDisplayName() {
        return displayName;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getListIcon() {
        return listIcon;
    }

    public String getSplash() {
        return splash;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getMapUrl() {
        return mapUrl;
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

    }

}