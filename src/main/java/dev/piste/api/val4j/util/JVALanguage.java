package dev.piste.api.val4j.util;

/**
 * @author Piste | https://github.com/PisteDev
 */
public enum JVALanguage {

    ARABIC("ar-AE"),
    GERMAN("de-DE"),
    ENGLISH_US("en-US"),
    SPANISH("es-ES"),
    SPANISH_MX("es-MX"),
    FRENCH("fr-FR"),
    INDONESIAN("id-ID"),
    ITALIAN("it-IT"),
    JAPANESE("ja-JP"),
    KOREAN("ko-KR"),
    POLISH("pl-PL"),
    PORTUGUESE_BR("pt-BR"),
    RUSSIAN("ru-RU"),
    THAI("th-TH"),
    TURKISH("tr-TR"),
    VIETNAMESE("vi-VN"),
    CHINESE_CN("zh-CN"),
    CHINESE_TW("zh-TW");

    private final String locale;

    JVALanguage(String locale) {
        this.locale = locale;
    }

    public String getLocale() {
        return locale;
    }

    public static JVALanguage ofLocale(String locale) {
        for(JVALanguage language : values()) {
            if(language.getLocale().equals(locale)) {
                return language;
            }
        }
        return null;
    }

}