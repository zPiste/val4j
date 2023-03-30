package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
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
    private String iconUrl;
    @SerializedName("killStreamIcon")
    private String killfeedIconUrl;
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

    public String getIconUrl() {
        return iconUrl;
    }

    public String getKillfeedIconUrl() {
        return killfeedIconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

}