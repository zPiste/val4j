package dev.piste.api.val4j.apis.riotgames.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class ShardStatus {

    @SerializedName("id")
    private String shardId;
    @SerializedName("name")
    private String shardName;
    @SerializedName("locales")
    private String[] locales;
    @SerializedName("maintenances")
    private Maintenance[] maintenances;

    public String getShardID() {
        return shardId;
    }

    public String getShardName() {
        return shardName;
    }

    public String[] getLocales() {
        return locales;
    }

    public Maintenance[] getMaintenances() {
        return maintenances;
    }

    public static class Maintenance {

        @SerializedName("id")
        private int id;
        @SerializedName("maintenance_status")
        private String statusAsString;
        @SerializedName("titles")
        private Translation[] titles;
        @SerializedName("updates")
        private Update[] updates;
        @SerializedName("created_at")
        private String creationDateAsString;
        @SerializedName("archive_at")
        private String archivationDateAsString;
        @SerializedName("updated_at")
        private String updationDateAsString;
        @SerializedName("platforms")
        private String[] platformsAsString;

        public int getID() {
            return id;
        }

        public Status getStatus() {
            return Status.ofID(statusAsString);
        }

        public Translation[] getTitles() {
            return titles;
        }

        public Update[] getUpdates() {
            return updates;
        }

        public LocalDateTime getCreationDate() {
            return LocalDateTime.parse(creationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public LocalDateTime getArchivationDate() {
            return LocalDateTime.parse(archivationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public LocalDateTime getUpdationDate() {
            return LocalDateTime.parse(updationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public Platform[] getPlatforms() {
            Platform[] platforms = new Platform[platformsAsString.length];
            for(int i = 0; i < platformsAsString.length; i++) {
                platforms[i] = Platform.ofID(platformsAsString[i]);
            }
            return platforms;
        }

        public enum Status {

            SCHEDULED("scheduled"),
            IN_PROGRESS("in_progress"),
            COMPLETED("complete");

            private final String id;

            Status(String id) {
                this.id = id;
            }

            public String getID() {
                return id;
            }

            public static Status ofID(String id) {
                for (Status status : values()) {
                    if (status.getID().equals(id)) {
                        return status;
                    }
                }
                return null;
            }

        }

    }

    public static class Incident {

        @SerializedName("id")
        private int id;
        @SerializedName("incident_severity")
        private String severityAsString;
        @SerializedName("titles")
        private Translation[] titles;
        @SerializedName("updates")
        private Update[] updates;
        @SerializedName("created_at")
        private String creationDateAsString;
        @SerializedName("archive_at")
        private String archivationDateAsString;
        @SerializedName("updated_at")
        private String updationDateAsString;
        @SerializedName("platforms")
        private String[] platformsAsString;

        public int getID() {
            return id;
        }

        public Severity getSeverity() {
            return Severity.ofID(severityAsString);
        }

        public Translation[] getTitles() {
            return titles;
        }

        public Update[] getUpdates() {
            return updates;
        }

        public LocalDateTime getCreationDate() {
            return LocalDateTime.parse(creationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public LocalDateTime getArchivationDate() {
            return LocalDateTime.parse(archivationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public LocalDateTime getUpdationDate() {
            return LocalDateTime.parse(updationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public Platform[] getPlatforms() {
            Platform[] platforms = new Platform[platformsAsString.length];
            for(int i = 0; i < platformsAsString.length; i++) {
                platforms[i] = Platform.ofID(platformsAsString[i]);
            }
            return platforms;
        }

        public enum Severity {

            INFO("info"),
            WARNING("warning"),
            CRITICAL("critical");

            private final String id;

            Severity(String id) {
                this.id = id;
            }

            public String getID() {
                return id;
            }

            public static Severity ofID(String id) {
                for (Severity severity : values()) {
                    if (severity.getID().equals(id)) {
                        return severity;
                    }
                }
                return null;
            }

        }

    }

    public static class Translation {

        @SerializedName("locale")
        private String locale;
        @SerializedName("content")
        private String text;

        public String getLocale() {
            return locale;
        }

        public String getText() {
            return text;
        }

    }

    public static class Update {

        @SerializedName("id")
        private int id;
        @SerializedName("author")
        private String author;
        @SerializedName("publish")
        private boolean published;
        @SerializedName("publish_locations")
        private String[] publishLocationsAsString;
        @SerializedName("translations")
        private Translation[] translations;
        @SerializedName("created_at")
        private String creationDateAsString;
        @SerializedName("updated_at")
        private String updationDateAsString;

        public int getID() {
            return id;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isPublished() {
            return published;
        }

        public PublishLocation[] getPublishLocations() {
            PublishLocation[] publishLocations = new PublishLocation[publishLocationsAsString.length];
            for (int i = 0; i < publishLocationsAsString.length; i++) {
                publishLocations[i] = PublishLocation.ofID(publishLocationsAsString[i]);
            }
            return publishLocations;
        }

        public Translation[] getTranslations() {
            return translations;
        }

        public LocalDateTime getCreationDate() {
            return LocalDateTime.parse(creationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public LocalDateTime getUpdationDate() {
            return LocalDateTime.parse(updationDateAsString, DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX"));
        }

        public enum PublishLocation {

            RIOT_CLIENT("riotclient"),
            RIOT_STATUS("riotstatus"),
            GAME("game");

            private final String id;

            PublishLocation(String id) {
                this.id = id;
            }

            public String getID() {
                return id;
            }

            public static PublishLocation ofID(String id) {
                for (PublishLocation location : values()) {
                    if (location.getID().equals(id)) {
                        return location;
                    }
                }
                return null;
            }

        }
    }

    public enum Platform {

        WINDOWS("windows"),
        MAC("macos"),
        ANDROID("android"),
        IOS("ios"),
        PS4("ps4"),
        XBOX("xbone"),
        SWITCH("switch");

        private final String id;

        Platform(String id) {
            this.id = id;
        }

        public String getID() {
            return id;
        }

        public static Platform ofID(String id) {
            for (Platform platform : values()) {
                if (platform.getID().equals(id)) {
                    return platform;
                }
            }
            return null;
        }

    }

}