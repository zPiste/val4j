package dev.piste.api.val4j.apis.riotgames.official.exceptions;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum ParameterType {

    RIOT_ID("Riot ID"),
    PUUID("PUUID"),
    UUID("UUID");

    private final String name;

    ParameterType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}