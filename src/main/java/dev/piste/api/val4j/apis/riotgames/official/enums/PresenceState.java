package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum PresenceState {

    CHAT("chat"),
    INGAME("dnd"),
    AWAY("away"),
    OFFLINE("offline");

    private final String id;

    PresenceState(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static PresenceState ofID(String id) {
        for (PresenceState presenceState : PresenceState.values()) {
            if (presenceState.getID().equals(id)) {
                return presenceState;
            }
        }
        return null;
    }

}