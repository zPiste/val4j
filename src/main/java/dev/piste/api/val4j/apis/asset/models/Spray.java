package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class Spray {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("themeUuid")
    private String themeUUID;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("fullIcon")
    private String fullIconURL;
    @SerializedName("fullTransparentIcon")
    private String fullTransparentIconURL;
    @SerializedName("animationPng")
    private String animationPNGURL;
    @SerializedName("animationGif")
    private String animationGIFURL;
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

    public String getCategory() {
        return category;
    }

    public String getThemeUUID() {
        return themeUUID;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getFullIconURL() {
        return fullIconURL;
    }

    public String getFullTransparentIconURL() {
        return fullTransparentIconURL;
    }

    public String getAnimationPNGURL() {
        return animationPNGURL;
    }

    public String getAnimationGIFURL() {
        return animationGIFURL;
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
        @SerializedName("sprayLevel")
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