package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste (<a href="https://github.com/pistedev">GitHub</a>)
 */
public enum RiotCluster {

    AMERICAS("americas"),
    ASIA("asia"),
    ESPORTS("esports"),
    EUROPE("europe");

    private final String id;

    RiotCluster(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

}