package dev.piste.api.val4j.apis.riotgames.internal.enums;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public enum ItemType {

    AGENT("01bb38e1-da47-4e6a-9b3d-945fe4655707"),
    CONTRACT("f85cb6f7-33e5-4dc8-b609-ec7212301948"),
    SPRAY("d5f120f8-ff8c-4aac-92ea-f2b5acbe9475"),
    GUN_BUDDY("dd3bf334-87f3-40bd-b043-682a57a8dc3a"),
    PLAYER_CARD("3f296c07-64c3-494c-923b-fe692a4fa1bd"),
    WEAPON_SKIN("e7c63390-eda7-46e0-bb7a-a6abdacd2433"),
    WEAPON_SKIN_VARIANT("3ad1b2b2-acdb-4524-852f-954a76ddae0a"),
    PLAYER_TITLE("de7caa6b-adf7-4588-bbd1-143831e786c6");

    private final String uuid;

    ItemType(String uuid) {
        this.uuid = uuid;
    }

    public String getUUID() {
        return uuid;
    }

    public static ItemType ofUUID(String uuid) {
        for (ItemType itemType : values()) {
            if (itemType.getUUID().equals(uuid)) {
                return itemType;
            }
        }
        return null;
    }

}