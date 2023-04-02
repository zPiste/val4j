package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Weapon {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("category")
    private String category;
    @SerializedName("defaultSkinUuid")
    private String defaultSkinUuid;
    @SerializedName("displayIcon")
    private String iconUrl;
    @SerializedName("killStreamIcon")
    private String killfeedIconUrl;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("weaponStats")
    private Stats stats;
    @SerializedName("shopData")
    private ShopData shopData;
    @SerializedName("skins")
    private WeaponSkin[] skins;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getDefaultSkinUUID() {
        return defaultSkinUuid;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public String getKillfeedIconUrl() {
        return killfeedIconUrl;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public Stats getStats() {
        return stats;
    }

    public ShopData getShopData() {
        return shopData;
    }

    public WeaponSkin[] getSkins() {
        return skins;
    }

    public static class Stats {

        @SerializedName("fireRate")
        private double fireRate;
        @SerializedName("magazineSize")
        private int magazineSize;
        @SerializedName("runSpeedMultiplier")
        private double runSpeedMultiplier;
        @SerializedName("equipTimeSeconds")
        private double equipTimeSeconds;
        @SerializedName("reloadTimeSeconds")
        private double reloadTimeSeconds;
        @SerializedName("firstBulletAccuracy")
        private double firstBulletAccuracy;
        @SerializedName("shotgunPelletCount")
        private int shotgunPelletCount;
        @SerializedName("wallPenetration")
        private String wallPenetration;
        @SerializedName("feature")
        private String feature;
        @SerializedName("fireMode")
        private String fireMode;
        @SerializedName("altFireType")
        private String altFireType;
        @SerializedName("adsStats")
        private ADSStats adsStats;
        @SerializedName("altShotgunStats")
        private AltShotgunStats altShotgunStats;
        @SerializedName("airBurstStats")
        private AirBurstStats airBurstStats;
        @SerializedName("damageRanges")
        private DamageRange[] damageRanges;

        public double getFireRate() {
            return fireRate;
        }

        public int getMagazineSize() {
            return magazineSize;
        }

        public double getRunSpeedMultiplier() {
            return runSpeedMultiplier;
        }

        public double getEquipTimeSeconds() {
            return equipTimeSeconds;
        }

        public double getReloadTimeSeconds() {
            return reloadTimeSeconds;
        }

        public double getFirstBulletAccuracy() {
            return firstBulletAccuracy;
        }

        public int getShotgunPelletCount() {
            return shotgunPelletCount;
        }

        public String getWallPenetration() {
            return wallPenetration;
        }

        public String getFeature() {
            return feature;
        }

        public String getFireMode() {
            return fireMode;
        }

        public String getAltFireType() {
            return altFireType;
        }

        public ADSStats getAdsStats() {
            return adsStats;
        }

        public AltShotgunStats getAltShotgunStats() {
            return altShotgunStats;
        }

        public AirBurstStats getAirBurstStats() {
            return airBurstStats;
        }

        public DamageRange[] getDamageRanges() {
            return damageRanges;
        }

        public static class ADSStats {

            @SerializedName("zoomMultiplier")
            private double zoomMultiplier;
            @SerializedName("fireRate")
            private double fireRate;
            @SerializedName("runSpeedMultiplier")
            private double runSpeedMultiplier;
            @SerializedName("burstCount")
            private int burstCount;
            @SerializedName("firstBulletAccuracy")
            private double firstBulletAccuracy;

            public double getZoomMultiplier() {
                return zoomMultiplier;
            }

            public double getFireRate() {
                return fireRate;
            }

            public double getRunSpeedMultiplier() {
                return runSpeedMultiplier;
            }

            public int getBurstCount() {
                return burstCount;
            }

            public double getFirstBulletAccuracy() {
                return firstBulletAccuracy;
            }

        }

        public static class AltShotgunStats {

            @SerializedName("shotgunPelletCount")
            private int shotgunPelletCount;
            @SerializedName("burstRate")
            private double burstRate;

            public int getShotgunPelletCount() {
                return shotgunPelletCount;
            }

            public double getBurstRate() {
                return burstRate;
            }

        }

        public static class AirBurstStats {

            @SerializedName("shotgunPelletCount")
            private int shotgunPelletCount;
            @SerializedName("burstDistance")
            private double burstDistance;

            public int getShotgunPelletCount() {
                return shotgunPelletCount;
            }

            public double getBurstDistance() {
                return burstDistance;
            }

        }

        public static class DamageRange {

            @SerializedName("rangeStartMeters")
            private int rangeStartMeters;
            @SerializedName("rangeEndMeters")
            private int rangeEndMeters;
            @SerializedName("headDamage")
            private int headDamageCount;
            @SerializedName("bodyDamage")
            private int bodyDamageCount;
            @SerializedName("legDamage")
            private int legDamageCount;

            public int getRangeStartMeters() {
                return rangeStartMeters;
            }

            public int getRangeEndMeters() {
                return rangeEndMeters;
            }

            public int getHeadDamageCount() {
                return headDamageCount;
            }

            public int getBodyDamageCount() {
                return bodyDamageCount;
            }

            public int getLegDamageCount() {
                return legDamageCount;
            }

        }

    }

    public static class ShopData {

        @SerializedName("cost")
        private int price;
        @SerializedName("category")
        private String category;
        @SerializedName("categoryText")
        private String categoryText;
        @SerializedName("gridPosition")
        private GridPosition gridPosition;
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

        public GridPosition getGridPosition() {
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

        public static class GridPosition {

            @SerializedName("row")
            private int row;
            @SerializedName("column")
            private int column;

            public int getRow() {
                return row;
            }

            public int getColumn() {
                return column;
            }

        }

    }

}