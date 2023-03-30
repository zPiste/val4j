package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Theme {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("storeFeaturedImage")
    private String storeImageUrl;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getStoreImageUrl() {
        return storeImageUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}