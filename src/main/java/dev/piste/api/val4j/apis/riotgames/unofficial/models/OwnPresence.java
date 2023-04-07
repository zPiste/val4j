package dev.piste.api.val4j.apis.riotgames.unofficial.models;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.riotgames.official.enums.PresenceState;
import dev.piste.api.val4j.apis.riotgames.official.models.StatusData;

import java.time.Instant;
import java.util.Base64;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class OwnPresence {

    @SerializedName("state")
    private String state;
    @SerializedName("private")
    private String statusData;
    @SerializedName("shared")
    private SharedData sharedData;

    public OwnPresence() {
        sharedData = new SharedData();
    }

    public OwnPresence setState(PresenceState state) {
        this.state = state.getId();
        return this;
    }

    public OwnPresence setStatusData(StatusData statusData) {
        this.statusData = Base64.getEncoder().encodeToString(new Gson().toJson(statusData).getBytes());
        return this;
    }

    public static class SharedData {

        @SerializedName("product")
        private String product;
        @SerializedName("time")
        private long timeInMillis;

        public SharedData() {
            product = "valorant";
            timeInMillis = Instant.now().toEpochMilli() + 35000;
        }

    }

}