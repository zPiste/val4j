package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class PlayerTitle {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("titleText")
    private String text;
    @SerializedName("isHiddenIfNotOwned")
    private boolean hiddenIfNotOwned;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }

    public boolean isHiddenIfNotOwned() {
        return hiddenIfNotOwned;
    }

    public String getAssetPath() {
        return assetPath;
    }

}