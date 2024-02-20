package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum PartyState {

    DEFAULT("DEFAULT"),
    MATCHMAKING("MATCHMAKING"),
    GAME_STARTING("MATCHMADE_GAME_STARTING");

    private final String id;

    PartyState(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static PartyState ofID(String id) {
        for (PartyState partyState : PartyState.values()) {
            if (partyState.getID().equals(id)) {
                return partyState;
            }
        }
        return null;
    }

}