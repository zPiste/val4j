package dev.piste.api.val4j.apis.riotgames.internal.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public enum Currency {

    VP("85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741"),
    DOUGH("85ca954a-41f2-ce94-9b45-8ca3dd39a00d"),
    FREE_AGENT("f08d4ae3-939c-4576-ab26-09ce1f23bb37"),
    RADIANITE_POINT("e59aa87c-4cbf-517a-5983-6e81511be9b7");

    private final String uuid;

    Currency(String uuid) {
        this.uuid = uuid;
    }

    public String getUUID() {
        return uuid;
    }

    public static Currency ofUUID(String uuid) {
        for (Currency currency : values()) {
            if (currency.getUUID().equals(uuid)) {
                return currency;
            }
        }
        return null;
    }

}