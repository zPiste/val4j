package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class LevelBorder {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("startingLevel")
    private int startingLevel;
    @SerializedName("levelNumberAppearance")
    private String levelNumberAppearance;
    @SerializedName("smallPlayerCardAppearance")
    private String smallPlayerCardAppearance;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public int getStartingLevel() {
        return startingLevel;
    }

    public String getLevelNumberAppearance() {
        return levelNumberAppearance;
    }

    public String getSmallPlayerCardAppearance() {
        return smallPlayerCardAppearance;
    }

    public String getAssetPath() {
        return assetPath;
    }

}