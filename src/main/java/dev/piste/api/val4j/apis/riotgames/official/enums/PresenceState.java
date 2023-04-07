package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
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

    public String getId() {
        return id;
    }

    public static PresenceState ofId(String id) {
        for (PresenceState presenceState : PresenceState.values()) {
            if (presenceState.getId().equals(id)) {
                return presenceState;
            }
        }
        return null;
    }

}