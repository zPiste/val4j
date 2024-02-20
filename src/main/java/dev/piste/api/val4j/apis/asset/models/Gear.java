package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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
    private String iconURL;
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

    public String getIconURL() {
        return iconURL;
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
        private String imageURL;
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

        public String getImageURL() {
            return imageURL;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

}