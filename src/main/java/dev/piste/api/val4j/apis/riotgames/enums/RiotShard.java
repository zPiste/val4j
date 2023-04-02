package dev.piste.api.val4j.apis.riotgames.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum RiotShard {

    EUROPE("eu"),
    NORTH_AMERICA("na"),
    LATIN_AMERICA("latam"),
    BRAZIL("br"),
    ASIA_PACIFIC("ap"),
    KOREA("kr");

    private final String id;

    RiotShard(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static RiotShard getRiotShard(String id) {
        for (RiotShard shard : values()) {
            if (shard.getId().equalsIgnoreCase(id)) {
                return shard;
            }
        }
        return null;
    }

}