package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Event {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("shortDisplayName")
    private String shortName;
    @SerializedName("startTime")
    private String startTimeAsString;
    @SerializedName("endTime")
    private String endTimeAsString;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getShortName() {
        return shortName;
    }

    public LocalDateTime getStartTime() {
        return LocalDateTime.parse(startTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public LocalDateTime getEndTime() {
        return LocalDateTime.parse(endTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public String getAssetPath() {
        return assetPath;
    }

}