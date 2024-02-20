package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum RiotRegion {

    EUROPE("eu"),
    NORTH_AMERICA("na"),
    LATIN_AMERICA("latam"),
    BRAZIL("br"),
    ASIA_PACIFIC("ap"),
    KOREA("kr");

    private final String id;

    RiotRegion(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static RiotRegion ofID(String id) {
        for (RiotRegion shard : values()) {
            if (shard.getID().equalsIgnoreCase(id)) {
                return shard;
            }
        }
        return null;
    }

}