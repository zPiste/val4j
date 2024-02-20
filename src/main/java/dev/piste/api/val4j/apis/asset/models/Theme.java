package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Theme {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("storeFeaturedImage")
    private String storeImageURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getStoreImageURL() {
        return storeImageURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}