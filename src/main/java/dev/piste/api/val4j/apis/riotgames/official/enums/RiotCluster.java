package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
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

    public String getID() {
        return id;
    }

}