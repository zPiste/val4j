package dev.piste.api.val4j.apis.riotgames.internal.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public enum SeasonType {

    EPISODE("episode"),
    ACT("act");

    private final String id;

    SeasonType(String id) {
        this.id = id;
    }

    public String getID() {
        return id;
    }

    public static SeasonType ofID(String id) {
        for (SeasonType seasonType : values()) {
            if (seasonType.getID().equals(id)) {
                return seasonType;
            }
        }
        return null;
    }

}