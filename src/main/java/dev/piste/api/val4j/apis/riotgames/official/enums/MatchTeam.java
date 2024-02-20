package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum MatchTeam {

    RED("Red"),
    BLUE("Blue");

    private final String id;

    MatchTeam(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static MatchTeam ofID(String id) {
        for (MatchTeam matchTeam : MatchTeam.values()) {
            if (matchTeam.getID().equals(id)) {
                return matchTeam;
            }
        }
        return null;
    }

}