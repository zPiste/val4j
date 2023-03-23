package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Currency {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("displayNameSingular")
    private String displayNameSingular;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("largeIcon")
    private String largeIcon;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayNameSingular() {
        return displayNameSingular;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getLargeIcon() {
        return largeIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

}