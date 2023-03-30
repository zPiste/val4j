package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
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
    private String horizontalImageUrl;
    @SerializedName("verticalPromoImage")
    private String verticalImageUrl;
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

    public String getHorizontalImageUrl() {
        return horizontalImageUrl;
    }

    public String getVerticalImageUrl() {
        return verticalImageUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}