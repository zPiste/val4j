package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Gear {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("description")
    private String description;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("shopData")
    private ShopData shopData;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public ShopData getShopData() {
        return shopData;
    }

    public static class ShopData {

        @SerializedName("cost")
        private int price;
        @SerializedName("category")
        private String category;
        @SerializedName("categoryText")
        private String categoryText;
        @SerializedName("gridPosition")
        private int gridPosition;
        @SerializedName("canBeTrashed")
        private boolean trashable;
        @SerializedName("image")
        private String image;
        @SerializedName("newImage")
        private String newImage;
        @SerializedName("newImage2")
        private String newImage2;
        @SerializedName("assetPath")
        private String assetPath;

        public int getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        public String getCategoryText() {
            return categoryText;
        }

        public int getGridPosition() {
            return gridPosition;
        }

        public boolean isTrashable() {
            return trashable;
        }

        public String getImage() {
            return image;
        }

        public String getNewImage() {
            return newImage;
        }

        public String getNewImage2() {
            return newImage2;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}