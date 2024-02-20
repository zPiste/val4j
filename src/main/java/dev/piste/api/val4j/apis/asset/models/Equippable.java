package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Equippable {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("killStreamIcon")
    private String killStreamIconURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getKillStreamIconURL() {
        return killStreamIconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}