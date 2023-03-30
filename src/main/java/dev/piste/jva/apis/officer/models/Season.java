package dev.piste.jva.apis.officer.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Season {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("type")
    private String type;
    @SerializedName("startTime")
    private String startTimeAsString;
    @SerializedName("endTime")
    private String endTimeAsString;
    @SerializedName("parentUuid")
    private String parentUuid;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public LocalDateTime getStartDateTime() {
        return LocalDateTime.parse(startTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public LocalDateTime getEndDateTime() {
        return LocalDateTime.parse(endTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public String getParentUUID() {
        return parentUuid;
    }

    public String getAssetPath() {
        return assetPath;
    }

}