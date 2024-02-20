package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class Bundle {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("displayNameSubText")
    private String subText;
    @SerializedName("description")
    private String description;
    @SerializedName("extraDescription")
    private String extraDescription;
    @SerializedName("promoDescription")
    private String promoDescription;
    @SerializedName("useAdditionalContext")
    private boolean usingAdditionalContext;
    @SerializedName("displayIcon")
    private String horizontalImageURL;
    @SerializedName("verticalPromoImage")
    private String verticalImageURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getSubText() {
        return subText;
    }

    public String getDescription() {
        return description;
    }

    public String getExtraDescription() {
        return extraDescription;
    }

    public String getPromoDescription() {
        return promoDescription;
    }

    public boolean isUsingAdditionalContext() {
        return usingAdditionalContext;
    }

    public String getHorizontalImageURL() {
        return horizontalImageURL;
    }

    public String getVerticalImageURL() {
        return verticalImageURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}