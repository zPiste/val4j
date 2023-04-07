package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Content {

    @SerializedName("version")
    private String version;
    @SerializedName("characters")
    private Item[] agents;
    @SerializedName("maps")
    private Item[] maps;
    @SerializedName("chromas")
    private Item[] chromas;
    @SerializedName("skins")
    private Item[] skins;
    @SerializedName("skinLevels")
    private Item[] skinLevels;
    @SerializedName("equips")
    private Item[] equippables;
    @SerializedName("gameModes")
    private Item[] gameModes;
    @SerializedName("sprays")
    private Item[] sprays;
    @SerializedName("sprayLevels")
    private Item[] sprayLevels;
    @SerializedName("charms")
    private Item[] buddies;
    @SerializedName("charmLevels")
    private Item[] buddyLevels;
    @SerializedName("playerCards")
    private Item[] playerCards;
    @SerializedName("playerTitles")
    private Item[] playerTitles;
    @SerializedName("acts")
    private Act[] acts;
    @SerializedName("ceremonies")
    private Item[] ceremonies;

    public String getVersion() {
        return version;
    }

    public Item[] getAgents() {
        return agents;
    }

    public Item[] getMaps() {
        return maps;
    }

    public Item[] getChromas() {
        return chromas;
    }

    public Item[] getSkins() {
        return skins;
    }

    public Item[] getSkinLevels() {
        return skinLevels;
    }

    public Item[] getEquippables() {
        return equippables;
    }

    public Item[] getGameModes() {
        return gameModes;
    }

    public Item[] getSprays() {
        return sprays;
    }

    public Item[] getSprayLevels() {
        return sprayLevels;
    }

    public Item[] getBuddies() {
        return buddies;
    }

    public Item[] getBuddyLevels() {
        return buddyLevels;
    }

    public Item[] getPlayerCards() {
        return playerCards;
    }

    public Item[] getPlayerTitles() {
        return playerTitles;
    }

    public Act[] getActs() {
        return acts;
    }

    public Item[] getCeremonies() {
        return ceremonies;
    }

    public static class Item {

        @SerializedName("name")
        private String name;
        @SerializedName("id")
        private String uuid;
        @SerializedName("assetName")
        private String assetName;
        @SerializedName("assetPath")
        private String assetPath;

        public String getName() {
            return name;
        }

        public String getUuid() {
            return uuid;
        }

        public String getAssetName() {
            return assetName;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

    public static class Act {

        @SerializedName("id")
        private String uuid;
        @SerializedName("parentId")
        private String parentUuid;
        @SerializedName("type")
        private String typeAsString;
        @SerializedName("name")
        private String name;
        @SerializedName("isActive")
        private boolean active;

        public String getUuid() {
            return uuid;
        }

        public String getParentUuid() {
            return parentUuid;
        }

        public Type getType() {
            return Type.ofId(typeAsString);
        }

        public String getName() {
            return name;
        }

        public boolean isActive() {
            return active;
        }

        public enum Type {

            EPISODE("episode"),
            ACT("act");

            private final String id;

            Type(String id) {
                this.id = id;
            }

            public String getId() {
                return id;
            }

            public static Type ofId(String id) {
                for (Type type : values()) {
                    if (type.getId().equals(id)) {
                        return type;
                    }
                }
                return null;
            }

        }
    }

}