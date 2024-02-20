package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum SessionState {

    MENU("MENUS"),
    INGAME("INGAME"),
    PREGAME("PREGAME");

    private final String id;

    SessionState(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static SessionState ofID(String id) {
        for (SessionState sessionState : SessionState.values()) {
            if (sessionState.getID().equals(id)) {
                return sessionState;
            }
        }
        return null;
    }

}