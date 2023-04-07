package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum MatchTeam {

    RED("Red"),
    BLUE("Blue");

    private final String id;

    MatchTeam(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static MatchTeam ofId(String id) {
        for (MatchTeam matchTeam : MatchTeam.values()) {
            if (matchTeam.getId().equals(id)) {
                return matchTeam;
            }
        }
        return null;
    }

}