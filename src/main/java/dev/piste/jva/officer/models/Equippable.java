package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Equippable {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("category")
    private String category;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("killStreamIcon")
    private String killStreamIcon;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getCategory() {
        return category;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getKillStreamIcon() {
        return killStreamIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

}