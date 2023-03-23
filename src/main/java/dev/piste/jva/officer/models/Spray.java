package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Spray {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("category")
    private String category;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("fullIcon")
    private String fullIcon;
    @SerializedName("fullTransparentIcon")
    private String fullTransparentIcon;
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

    public String getDisplayName() {
        return displayName;
    }

    public String getCategory() {
        return category;
    }

    public String getThemeUUID() {
        return themeUuid;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getFullIcon() {
        return fullIcon;
    }

    public String getFullTransparentIcon() {
        return fullTransparentIcon;
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
        private String displayName;
        @SerializedName("displayIcon")
        private String displayIcon;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public int getLevel() {
            return level;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getDisplayIcon() {
            return displayIcon;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}