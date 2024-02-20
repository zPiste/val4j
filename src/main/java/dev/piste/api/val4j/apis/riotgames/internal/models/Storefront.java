package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.riotgames.internal.enums.Currency;
import dev.piste.api.val4j.apis.riotgames.internal.enums.ItemType;

import java.time.LocalDateTime;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Storefront {

    @SerializedName("FeaturedBundle")
    private FeaturedBundle featuredBundle;

    public FeaturedBundle getFeaturedBundle() {
        return featuredBundle;
    }

    public static class FeaturedBundle {

        @SerializedName("Bundle")
        private Bundle bundle;
        @SerializedName("Bundles")
        private Bundle[] bundles;

        public Bundle getBundle() {
            return bundle;
        }

        public Bundle[] getBundles() {
            return bundles;
        }

        public static class Bundle {

            @SerializedName("ID")
            private String uuid;
            @SerializedName("DataAssetID")
            private String dataAssetUUID;
            @SerializedName("CurrencyID")
            private String currencyUUID;
            @SerializedName("Items")
            private Item[] items;
            @SerializedName("ItemOffers")
            private ItemOffer[] itemOffers;
            @SerializedName("TotalBaseCost")
            private Price totalBasePrice;
            @SerializedName("TotalDiscountedCost")
            private Price totalDiscountedPrice;
            @SerializedName("TotalDiscountPercent")
            private float totalDiscountPercent;
            @SerializedName("DurationRemainingInSeconds")
            private long durationRemainingInSeconds;
            @SerializedName("WholesaleOnly")
            private boolean wholesaleOnly;

            public String getUUID() {
                return uuid;
            }

            public String getDataAssetUUID() {
                return dataAssetUUID;
            }

            public Currency getCurrency() {
                return Currency.ofUUID(currencyUUID);
            }

            public Item[] getItems() {
                return items;
            }

            public ItemOffer[] getItemOffers() {
                return itemOffers;
            }

            public Price getTotalBasePrice() {
                return totalBasePrice;
            }

            public Price getTotalDiscountedPrice() {
                return totalDiscountedPrice;
            }

            public float getTotalDiscountPercent() {
                return totalDiscountPercent;
            }

            public long getDurationRemainingInSeconds() {
                return durationRemainingInSeconds;
            }

            public boolean isWholesaleOnly() {
                return wholesaleOnly;
            }

            public static class Item {

                @SerializedName("Item")
                private MetaData metaData;
                @SerializedName("BasePrice")
                private int basePrice;
                @SerializedName("CurrencyID")
                private String currencyUUID;
                @SerializedName("DiscountPercent")
                private float discountPercent;
                @SerializedName("DiscountedPrice")
                private int discountedPrice;
                @SerializedName("IsPromoItem")
                private boolean promoItem;

                public MetaData getMetaData() {
                    return metaData;
                }

                public int getBasePrice() {
                    return basePrice;
                }

                public String getCurrencyUUID() {
                    return currencyUUID;
                }

                public float getDiscountPercent() {
                    return discountPercent;
                }

                public int getDiscountedPrice() {
                    return discountedPrice;
                }

                public boolean isPromoItem() {
                    return promoItem;
                }

                public static class MetaData {

                    @SerializedName("ItemTypeID")
                    private String typeUUID;
                    @SerializedName("ItemID")
                    private String uuid;
                    @SerializedName("Amount")
                    private int amount;

                    public ItemType getType() {
                        return ItemType.ofUUID(typeUUID);
                    }

                    public String getUUID() {
                        return uuid;
                    }

                    public int getAmount() {
                        return amount;
                    }

                }

            }

            public static class ItemOffer {

                @SerializedName("BundleItemOfferID")
                private String uuid;
                @SerializedName("Offer")
                private Offer offer;
                @SerializedName("DiscountPercent")
                private float discountPercent;
                @SerializedName("DiscountedCost")
                private Price discountedPrice;

                public String getUUID() {
                    return uuid;
                }

                public Offer getOffer() {
                    return offer;
                }

                public float getDiscountPercent() {
                    return discountPercent;
                }

                public Price getDiscountedPrice() {
                    return discountedPrice;
                }

                public static class Offer {

                    @SerializedName("OfferID")
                    private String uuid;
                    @SerializedName("IsDirectPurchase")
                    private boolean directPurchase;
                    @SerializedName("StartDate")
                    private String startDateAsString;
                    @SerializedName("Cost")
                    private Price price;
                    @SerializedName("Rewards")
                    private Reward[] rewards;

                    public String getUUID() {
                        return uuid;
                    }

                    public boolean isDirectPurchase() {
                        return directPurchase;
                    }

                    public LocalDateTime getStartDate() {
                        return LocalDateTime.parse(startDateAsString);
                    }

                    public Price getPrice() {
                        return price;
                    }

                    public Reward[] getRewards() {
                        return rewards;
                    }

                    public static class Reward {

                        @SerializedName("ItemTypeID")
                        private String typeUUID;
                        @SerializedName("ItemID")
                        private String uuid;
                        @SerializedName("Quantity")
                        private int quantity;

                        public ItemType getType() {
                            return ItemType.ofUUID(typeUUID);
                        }

                        public String getUUID() {
                            return uuid;
                        }

                        public int getQuantity() {
                            return quantity;
                        }

                    }

                }

            }

            public static class Price {

                // VP
                @SerializedName("85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741")
                private int vp;
                // Radianite Points
                @SerializedName("e59aa87c-4cbf-517a-5983-6e81511be9b7")
                private int radianite;
                // Dough
                @SerializedName("85ca954a-41f2-ce94-9b45-8ca3dd39a00d")
                private int dough;
                // Free Agents
                @SerializedName("f08d4ae3-939c-4576-ab26-09ce1f23bb37")
                private int freeAgents;

                public int getVP() {
                    return vp;
                }

                public int getRadianite() {
                    return radianite;
                }

                public int getDough() {
                    return dough;
                }

                public int getFreeAgents() {
                    return freeAgents;
                }

            }

        }

    }

}