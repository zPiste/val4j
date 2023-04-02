package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class WeaponSkin {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("contentTierUuid")
    private String contentTierUuid;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("wallpaper")
    private String wallpaperImageUrl;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("chromas")
    private Chroma[] chromas;
    @SerializedName("levels")
    private Level[] levels;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getThemeUUID() {
        return themeUuid;
    }

    public String getContentTierUUID() {
        return contentTierUuid;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getWallpaperImageUrl() {
        return wallpaperImageUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public Chroma[] getChromas() {
        return chromas;
    }

    public Level[] getLevels() {
        return levels;
    }

    public static class Chroma {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("displayName")
        private String name;
        @SerializedName("displayIcon")
        private String iconUrl;
        @SerializedName("fullRender")
        private String fullImageUrl;
        @SerializedName("swatch")
        private String colorIconUrl;
        @SerializedName("streamedVideo")
        private String videoUrl;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public String getName() {
            return name;
        }

        public String getIconUrl() {
            return iconUrl;
        }

        public String getFullImageUrl() {
            return fullImageUrl;
        }

        public String getColorIconUrl() {
            return colorIconUrl;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

    public static class Level {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("displayName")
        private String name;
        @SerializedName("levelItem")
        private String levelItem;
        @SerializedName("displayIcon")
        private String iconUrl;
        @SerializedName("streamedVideo")
        private String videoUrl;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public String getName() {
            return name;
        }

        public String getLevelItem() {
            return levelItem;
        }

        public String getIconUrl() {
            return iconUrl;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}