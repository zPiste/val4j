package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Article {

    @SerializedName("id")
    private String uuid;
    @SerializedName("uid")
    private String uid;
    @SerializedName("title")
    private String title;
    @SerializedName("date")
    private String dateAsString;
    @SerializedName("description")
    private String description;
    @SerializedName("article_type")
    private String type;
    @SerializedName("external_link")
    private String externalURL;
    @SerializedName("article_tags")
    private Tag[] tags;
    @SerializedName("category")
    private Category[] categories;
    @SerializedName("pathSlug")
    private String pathSlug;
    @SerializedName("publish_details")
    private PublishDetails publishDetails;
    @SerializedName("url")
    private URL url;
    @SerializedName("banner")
    private Banner banner;

    public String getUUID() {
        return uuid;
    }

    public String getUID() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public LocalDateTime getDate() {
        return LocalDateTime.parse(dateAsString,
                new DateTimeFormatterBuilder()
                        .append(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
                        .appendOffset("+HH:MM", "Z")
                        .toFormatter()
        );
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public String getExternalURL() {
        return externalURL;
    }

    public Tag[] getTags() {
        return tags;
    }

    public Category[] getCategories() {
        return categories;
    }

    public String getPathSlug() {
        return pathSlug;
    }

    public PublishDetails getPublishDetails() {
        return publishDetails;
    }

    public URL getURL() {
        return url;
    }

    public Banner getBanner() {
        return banner;
    }

    public static class Tag {

        @SerializedName("title")
        private String text;
        @SerializedName("machine_name")
        private String id;

        public String getText() {
            return text;
        }

        public String getID() {
            return id;
        }

    }

    public static class Category {

        @SerializedName("title")
        private String text;
        @SerializedName("machine_name")
        private String id;

        public String getText() {
            return text;
        }

        public String getID() {
            return id;
        }

    }

    public static class PublishDetails {

        @SerializedName("locale")
        private String locale;

        public String getLocale() {
            return locale;
        }

    }

    public static class URL {

        @SerializedName("url")
        private String path;

        public String getPath() {
            return path;
        }

    }

    public static class Banner {

        @SerializedName("url")
        private String url;
        @SerializedName("dimension")
        private Dimension dimension;
        @SerializedName("content_type")
        private String contentType;
        @SerializedName("file_size")
        private String fileSize;
        @SerializedName("filename")
        private String fileName;

        public String getURL() {
            return url;
        }

        public Dimension getDimension() {
            return dimension;
        }

        public String getContentType() {
            return contentType;
        }

        public String getFileSize() {
            return fileSize;
        }

        public String getFileName() {
            return fileName;
        }

        public static class Dimension {

            @SerializedName("height")
            private int height;
            @SerializedName("width")
            private int width;

            public int getHeight() {
                return height;
            }

            public int getWidth() {
                return width;
            }

        }

    }

}