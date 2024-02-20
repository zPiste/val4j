package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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
    private String smallIconURL;
    @SerializedName("largeIcon")
    private String largeIconURL;
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

    public String getSmallIconURL() {
        return smallIconURL;
    }

    public String getLargeIconURL() {
        return largeIconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

}