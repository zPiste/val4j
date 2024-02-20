package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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
    private String seasonUUID;
    @SerializedName("competitiveTiersUuid")
    private String competitiveTierTableUUID;
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
        return seasonUUID;
    }

    public String getCompetitiveTierTableUUID() {
        return competitiveTierTableUUID;
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
        private String iconURL;
        @SerializedName("smallIcon")
        private String smallIconURL;
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

        public String getIconURL() {
            return iconURL;
        }

        public String getSmallIconURL() {
            return smallIconURL;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}