package dev.piste.api.val4j.apis.riotgames.official.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum PartyAccessibility {

    CLOSED("CLOSED"),
    OPENED("OPEN");

    private final String id;

    PartyAccessibility(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static PartyAccessibility ofID(String id) {
        for (PartyAccessibility partyAccessibility : PartyAccessibility.values()) {
            if (partyAccessibility.getID().equals(id)) {
                return partyAccessibility;
            }
        }
        return null;
    }

}