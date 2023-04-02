package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class PlayerCard {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("isHiddenIfNotOwned")
    private boolean hiddenIfNotOwned;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("smallArt")
    private String smallIconUrl;
    @SerializedName("wideArt")
    private String wideImageUrl;
    @SerializedName("largeArt")
    private String largeImageUrl;
    @SerializedName("assetPath")
    private String assetPath;

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
        return themeUuid;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public String getWideImageUrl() {
        return wideImageUrl;
    }

    public String getLargeImageUrl() {
        return largeImageUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}