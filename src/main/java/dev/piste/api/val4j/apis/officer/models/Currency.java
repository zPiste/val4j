package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Currency {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String pluralName;
    @SerializedName("displayNameSingular")
    private String singularName;
    @SerializedName("displayIcon")
    private String smallIconUrl;
    @SerializedName("largeIcon")
    private String largeIconUrl;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getPluralName() {
        return pluralName;
    }

    public String getSingularName() {
        return singularName;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public String getLargeIconUrl() {
        return largeIconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}