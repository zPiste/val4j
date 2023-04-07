package dev.piste.api.val4j.apis.riotgames.unofficial.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Match {

    @SerializedName("players")
    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public static class Player {

        @SerializedName("subject")
        private String puuid;
        @SerializedName("gameName")
        private String name;
        @SerializedName("tagLine")
        private String tag;

        public String getPuuid() {
            return puuid;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

    }
}