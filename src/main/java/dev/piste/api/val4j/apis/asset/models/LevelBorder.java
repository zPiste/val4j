package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class LevelBorder {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("startingLevel")
    private int startingLevel;
    @SerializedName("levelNumberAppearance")
    private String iconURL;
    @SerializedName("smallPlayerCardAppearance")
    private String smallPlayerCardIconURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public int getStartingLevel() {
        return startingLevel;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getSmallPlayerCardIconURL() {
        return smallPlayerCardIconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}