package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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
    private String iconURL;
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

    public String getIconURL() {
        return iconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public String getParentGameModeUUID() {
        return switch (id) {
            case "competitive", "custom", "unrated" -> "96bd3920-4f36-d026-2b28-c683eb0bcac5";
            case "deathmatch" -> "a8790ec5-4237-f2f0-e93b-08a8e89865b2";
            case "ggteam" -> "a4ed6518-4741-6dcb-35bd-f884aecdc859";
            case "newmap", "swiftplay" -> "5d0f264b-4ebe-cc63-c147-809e1374484b";
            case "onefa" -> "4744698a-4513-dc96-9c22-a9aa437e4a58";
            case "snowball" -> "57038d6d-49b1-3a74-c5ef-3395d9f23a97";
            case "spikerush" -> "e921d1e6-416b-c31f-1291-74930c330b7b";
            case "hurm" -> "e086db66-47fd-e791-ca81-06a645ac7661";
            default -> "unknown";
        };
    }

}