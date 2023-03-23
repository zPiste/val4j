package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Queue {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("queueId")
    private String id;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("description")
    private String description;
    @SerializedName("dropdownText")
    private String dropdownText;
    @SerializedName("selectedText")
    private String selectedText;
    @SerializedName("isBeta")
    private boolean beta;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getID() {
        return id;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public String getDropdownText() {
        return dropdownText;
    }

    public String getSelectedText() {
        return selectedText;
    }

    public boolean isBeta() {
        return beta;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

}