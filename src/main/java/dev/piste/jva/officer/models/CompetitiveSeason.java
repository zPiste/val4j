package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class CompetitiveSeason {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("startTime")
    private String startTimeAsString;
    @SerializedName("endTime")
    private String endTimeAsString;
    @SerializedName("seasonUuid")
    private String seasonUuid;
    @SerializedName("competitiveTiersUuid")
    private String competitiveTierUuid;
    @SerializedName("borders")
    private Border[] borders;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public LocalDateTime getStartDateTime() {
        return LocalDateTime.parse(startTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public LocalDateTime getEndDateTime() {
        return LocalDateTime.parse(endTimeAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
    }

    public String getSeasonUUID() {
        return seasonUuid;
    }

    public String getCompetitiveTierUUID() {
        return competitiveTierUuid;
    }

    public Border[] getBorders() {
        return borders;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public static class Border {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("level")
        private int level;
        @SerializedName("winsRequired")
        private int requiredWins;
        @SerializedName("displayIcon")
        private String displayIcon;
        @SerializedName("smallIcon")
        private String smallIcon;
        @SerializedName("assetPath")
        private String assetPath;

        public String getUUID() {
            return uuid;
        }

        public int getLevel() {
            return level;
        }

        public int getRequiredWins() {
            return requiredWins;
        }

        public String getDisplayIcon() {
            return displayIcon;
        }

        public String getSmallIcon() {
            return smallIcon;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}