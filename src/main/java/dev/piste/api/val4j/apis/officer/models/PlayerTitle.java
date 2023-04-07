package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
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

    public String getUuid() {
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