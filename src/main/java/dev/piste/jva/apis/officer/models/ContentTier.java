package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class ContentTier {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("devName")
    private String developerName;
    @SerializedName("rank")
    private int rank;
    @SerializedName("juiceValue")
    private int juiceValue;
    @SerializedName("juiceCost")
    private int juiceCost;
    @SerializedName("highlightColor")
    private String highlightColor;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public int getRank() {
        return rank;
    }

    public int getJuiceValue() {
        return juiceValue;
    }

    public int getJuiceCost() {
        return juiceCost;
    }

    public String getHighlightColor() {
        return highlightColor;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

}