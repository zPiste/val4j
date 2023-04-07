package dev.piste.api.val4j.apis.officer.enums;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public enum AbilitySlot {

    ABILITY_1("ability1", 'Q'),
    ABILITY_2("ability2", 'E'),
    GRENADE("grenade", 'C'),
    ULTIMATE("ultimate", 'X'),
    PASSIVE("passive", '-'),
    UNKNOWN("unknown", '?');

    private final String id;
    private final char defaultKey;

    AbilitySlot(String id, char defaultKey) {
        this.id = id;
        this.defaultKey = defaultKey;
    }

    public String getId() {
        return id;
    }

    public char getDefaultKey() {
        return defaultKey;
    }

    public boolean isUsable() {
        return this != UNKNOWN && this != PASSIVE;
    }

    public static AbilitySlot ofId(String id) {
        for (AbilitySlot abilitySlot : values()) {
            if (abilitySlot.getId().equalsIgnoreCase(id)) {
                return abilitySlot;
            }
        }
        return UNKNOWN;
    }

}