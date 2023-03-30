package dev.piste.jva.apis.riotgames.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Match {

    @SerializedName("matchInfo")
    private MatchInfo matchInfo;

    public static class MatchInfo {

        @SerializedName("matchId")
        private String uuid;
        @SerializedName("mapId")
        private int mapUrl;
        @SerializedName("gameVersion")
        private String gameVersion;
        @SerializedName("gameLengthMillis")
        private long gameLengthMillis;
        @SerializedName("region")
        private String region;
        @SerializedName("gameStartMillis")
        private long gameStartMillis;
        @SerializedName("provisioningFlowId")
        private String provisioningFlowId;
        @SerializedName("isCompleted")
        private boolean completed;
        @SerializedName("customGameName")
        private String customGameName;

    }

}