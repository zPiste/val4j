package dev.piste.api.val4j.apis.riotgames.official.exceptions;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum ParameterType {

    RIOT_ID("Riot ID"),
    PUUID("puuid"),
    UUID("uuid");

    private final String name;

    ParameterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}