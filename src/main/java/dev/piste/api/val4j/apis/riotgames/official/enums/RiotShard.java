package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public enum RiotShard {

    NORTH_AMERICA("na"),
    PUBLIC_BETA("pbe"),
    EUROPE("eu"),
    ASIA_PACIFIC("ap"),
    KOREA("kr");

    private final String id;

    RiotShard(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static RiotShard ofID(String id) {
        for (RiotShard riotShard : values()) {
            if (riotShard.getID().equalsIgnoreCase(id)) {
                return riotShard;
            }
        }
        return null;
    }

    public static RiotShard ofRiotRegion(RiotRegion riotRegion) {
        return switch (riotRegion) {
            case EUROPE -> EUROPE;
            case NORTH_AMERICA, LATIN_AMERICA, BRAZIL -> NORTH_AMERICA;
            case KOREA -> KOREA;
            case ASIA_PACIFIC -> ASIA_PACIFIC;
        };
    }

}