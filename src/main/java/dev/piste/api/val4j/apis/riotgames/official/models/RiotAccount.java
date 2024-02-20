package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class RiotAccount {

    @SerializedName("puuid")
    private String puuid;
    @SerializedName("gameName")
    private String name;
    @SerializedName("tagLine")
    private String tag;

    public String getPUUID() {
        return puuid;
    }

    public String getName() {
        return name;
    }

    public String getTag() {
        return tag;
    }

    public String getRiotID() {
        return name + "#" + tag;
    }

}