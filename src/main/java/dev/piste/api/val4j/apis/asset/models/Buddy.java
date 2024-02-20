package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Buddy {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("isHiddenIfNotOwned")
    private boolean hiddenIfNotOwned;
    @SerializedName("themeUuid")
    private String themeUUID;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("levels")
    private Level[] levels;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public boolean isHiddenIfNotOwned() {
        return hiddenIfNotOwned;
    }

    public String getThemeUUID() {
        return themeUUID;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public Level[] getLevels() {
        return levels;
    }

    public static class Level {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("charmLevel")
        private int level;
        @SerializedName("displayName")
        private String name;
        @SerializedName("displayIcon")
        private String iconURL;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public int getLevel() {
            return level;
        }

        public String getName() {
            return name;
        }

        public String getIconURL() {
            return iconURL;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}