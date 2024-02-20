package dev.piste.api.val4j.apis.asset.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public enum AbilitySlot {

    ABILITY_1("ability1", 'Q'),
    ABILITY_2("ability2", 'E'),
    GRENADE("grenade", 'C'),
    ULTIMATE("ultimate", 'X'),
    PASSIVE("passive", (char) 0),
    UNKNOWN("unknown", (char) 0);

    private final String id;
    private final char defaultKey;

    AbilitySlot(String id, char defaultKey) {
        this.id = id;
        this.defaultKey = defaultKey;
    }

    public String getID() {
        return id;
    }

    public char getDefaultKey() {
        return defaultKey;
    }

    public boolean isUsable() {
        return this != UNKNOWN && this != PASSIVE;
    }

    public static AbilitySlot ofID(String id) {
        for (AbilitySlot abilitySlot : values()) {
            if (abilitySlot.getID().equalsIgnoreCase(id)) {
                return abilitySlot;
            }
        }
        return UNKNOWN;
    }

}