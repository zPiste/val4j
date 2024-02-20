package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class WeaponSkin {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("themeUuid")
    private String themeUUID;
    @SerializedName("contentTierUuid")
    private String contentTierUUID;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("wallpaper")
    private String wallpaperImageURL;
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
        return themeUUID;
    }

    public String getContentTierUUID() {
        return contentTierUUID;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getWallpaperImageURL() {
        return wallpaperImageURL;
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
        private String iconURL;
        @SerializedName("fullRender")
        private String fullImageURL;
        @SerializedName("swatch")
        private String colorIconURL;
        @SerializedName("streamedVideo")
        private String videoURL;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public String getName() {
            return name;
        }

        public String getIconURL() {
            return iconURL;
        }

        public String getFullImageURL() {
            return fullImageURL;
        }

        public String getColorIconURL() {
            return colorIconURL;
        }

        public String getVideoURL() {
            return videoURL;
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
        private String iconURL;
        @SerializedName("streamedVideo")
        private String videoURL;
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

        public String getIconURL() {
            return iconURL;
        }

        public String getVideoURL() {
            return videoURL;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}