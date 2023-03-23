package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class PlayerCard {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("isHiddenIfNotOwned")
    private boolean hiddenIfNotOwned;
    @SerializedName("themeUuid")
    private String themeUuid;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("smallArt")
    private String smallArt;
    @SerializedName("wideArt")
    private String wideArt;
    @SerializedName("largeArt")
    private String largeArt;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public boolean isHiddenIfNotOwned() {
        return hiddenIfNotOwned;
    }

    public String getThemeUUID() {
        return themeUuid;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getSmallArt() {
        return smallArt;
    }

    public String getWideArt() {
        return wideArt;
    }

    public String getLargeArt() {
        return largeArt;
    }

    public String getAssetPath() {
        return assetPath;
    }

}