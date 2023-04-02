package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class LevelBorder {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("startingLevel")
    private int startingLevel;
    @SerializedName("levelNumberAppearance")
    private String iconUrl;
    @SerializedName("smallPlayerCardAppearance")
    private String smallPlayerCardIconUrl;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public int getStartingLevel() {
        return startingLevel;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getSmallPlayerCardIconUrl() {
        return smallPlayerCardIconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}