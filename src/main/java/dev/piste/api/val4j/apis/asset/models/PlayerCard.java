package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class PlayerCard {

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
    @SerializedName("smallArt")
    private String smallIconURL;
    @SerializedName("wideArt")
    private String wideImageURL;
    @SerializedName("largeArt")
    private String largeImageURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUuid() {
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

    public String getSmallIconURL() {
        return smallIconURL;
    }

    public String getWideImageURL() {
        return wideImageURL;
    }

    public String getLargeImageURL() {
        return largeImageURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}