package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum PartyState {

    DEFAULT("DEFAULT"),
    MATCHMAKING("MATCHMAKING"),
    GAME_STARTING("MATCHMADE_GAME_STARTING");

    private final String id;

    PartyState(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public static PartyState ofId(String id) {
        for (PartyState partyState : PartyState.values()) {
            if (partyState.getId().equals(id)) {
                return partyState;
            }
        }
        return null;
    }

}