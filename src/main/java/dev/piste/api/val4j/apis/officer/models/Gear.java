package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Gear {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("shopData")
    private ShopData shopData;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getIconUrl() {
        return iconUrl;
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
        @SerializedName("newImage")
        private String imageUrl;
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

        public String getImageUrl() {
            return imageUrl;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}