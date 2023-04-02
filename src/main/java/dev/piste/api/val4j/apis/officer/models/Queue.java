package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Queue {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("queueId")
    private String id;
    @SerializedName("displayName")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("dropdownText")
    private String dropdownText;
    @SerializedName("selectedText")
    private String selectedText;
    @SerializedName("isBeta")
    private boolean beta;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getID() {
        return id;
    }

    public String getName() {
        return name;
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

    public String getIconUrl() {
        return iconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}