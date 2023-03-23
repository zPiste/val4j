package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class WeaponSkin {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("contentTierUuid")
    private String contentTierUuid;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("wallpaper")
    private String wallpaperImage;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("chromas")
    private Chroma[] chromas;
    @SerializedName("levels")
    private Level[] levels;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getThemeUUID() {
        return themeUuid;
    }

    public String getContentTierUUID() {
        return contentTierUuid;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getWallpaperImage() {
        return wallpaperImage;
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
        private String displayName;
        @SerializedName("displayIcon")
        private String displayIcon;
        @SerializedName("fullRender")
        private String fullRender;
        @SerializedName("swatch")
        private String swatch;
        @SerializedName("streamedVideo")
        private String streamedVideo;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getDisplayIcon() {
            return displayIcon;
        }

        public String getFullRender() {
            return fullRender;
        }

        public String getSwatch() {
            return swatch;
        }

        public String getStreamedVideo() {
            return streamedVideo;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

    public static class Level {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("displayName")
        private String displayName;
        @SerializedName("levelItem")
        private String levelItem;
        @SerializedName("displayIcon")
        private String displayIcon;
        @SerializedName("streamedVideo")
        private String streamedVideo;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getLevelItem() {
            return levelItem;
        }

        public String getDisplayIcon() {
            return displayIcon;
        }

        public String getStreamedVideo() {
            return streamedVideo;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}