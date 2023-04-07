package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum SessionState {

    MENU("MENUS"),
    INGAME("INGAME"),
    PREGAME("PREGAME");

    private final String id;

    SessionState(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static SessionState ofId(String id) {
        for (SessionState sessionState : SessionState.values()) {
            if (sessionState.getId().equals(id)) {
                return sessionState;
            }
        }
        return null;
    }

}