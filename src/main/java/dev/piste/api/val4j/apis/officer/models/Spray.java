package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Spray {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("fullIcon")
    private String fullIconUrl;
    @SerializedName("fullTransparentIcon")
    private String fullTransparentIconUrl;
    @SerializedName("animationPng")
    private String animationPng;
    @SerializedName("animationGif")
    private String animationGif;
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
        return themeUuid;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getFullIconUrl() {
        return fullIconUrl;
    }

    public String getFullTransparentIconUrl() {
        return fullTransparentIconUrl;
    }

    public String getAnimationPng() {
        return animationPng;
    }

    public String getAnimationGif() {
        return animationGif;
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
        private String iconUrl;
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

        public String getIconUrl() {
            return iconUrl;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}