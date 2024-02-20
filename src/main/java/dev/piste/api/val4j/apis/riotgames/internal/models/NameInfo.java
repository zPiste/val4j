package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class NameInfo {

    @SerializedName("DisplayName")
    private String displayName;
    @SerializedName("Subject")
    private String playerUUID;
    @SerializedName("GameName")
    private String name;
    @SerializedName("TagLine")
    private String tag;

    public String getDisplayName() {
        return displayName;
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

}