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

    public String getUuid() {
        return uuid;
    }

    public String getId() {
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

    public String getParentGameModeUuid() {
        return switch (id) {
            case "competitive", "custom", "unrated" -> "96bd3920-4f36-d026-2b28-c683eb0bcac5";
            case "deathmatch" -> "a8790ec5-4237-f2f0-e93b-08a8e89865b2";
            case "ggteam" -> "a4ed6518-4741-6dcb-35bd-f884aecdc859";
            case "newmap", "swiftplay" -> "5d0f264b-4ebe-cc63-c147-809e1374484b";
            case "onefa" -> "4744698a-4513-dc96-9c22-a9aa437e4a58";
            case "snowball" -> "57038d6d-49b1-3a74-c5ef-3395d9f23a97";
            case "spikerush" -> "e921d1e6-416b-c31f-1291-74930c330b7b";
            default -> "unknown";
        };
    }

}