package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Theme {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("storeFeaturedImage")
    private String storeImage;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getStoreImage() {
        return storeImage;
    }

    public String getAssetPath() {
        return assetPath;
    }

}