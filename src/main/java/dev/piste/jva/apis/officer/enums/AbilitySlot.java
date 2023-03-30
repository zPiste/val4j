package dev.piste.jva.apis.officer.enums;

/**
 * @author Piste | https://github.com/PisteDev
 */
public enum AbilitySlot {

    ABILITY_1("ability1", 'Q'),
    ABILITY_2("ability2", 'E'),
    GRENADE("grenade", 'C'),
    ULTIMATE("ultimate", 'X'),
    PASSIVE("passive", '-'),
    UNKNOWN("unknown", '?');

    private final String name;
    private final char defaultKey;

    AbilitySlot(String name, char defaultKey) {
        this.name = name;
        this.defaultKey = defaultKey;
    }

    public String getName() {
        return name;
    }

    public char getDefaultKey() {
        return defaultKey;
    }

    public static AbilitySlot of(String name) {
        for (AbilitySlot slot : values()) {
            if (slot.getName().equalsIgnoreCase(name)) {
                return slot;
            }
        }
        return UNKNOWN;
    }

}