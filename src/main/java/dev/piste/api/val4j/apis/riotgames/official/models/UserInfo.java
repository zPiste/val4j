package dev.piste.api.val4j.apis.riotgames.official.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class UserInfo {

    @SerializedName("country")
    private String countryCode;
    @SerializedName("sub")
    private String playerUUID;
    @SerializedName("email_verified")
    private boolean emailVerified;
    @SerializedName("player_plocale")
    private String playerProfileLocale;
    @SerializedName("country_at")
    private long countryUpdateDateInMillis;
    @SerializedName("pw")
    private PasswordInfo passwordInfo;
    @SerializedName("phone_number_verified")
    private boolean phoneNumberVerified;
    @SerializedName("account_verified")
    private boolean accountVerified;
    @SerializedName("ppid")
    private String profilePictureID;
    @SerializedName("federated_identity_providers")
    private String[] federatedIdentityProviders;
    @SerializedName("player_locale")
    private String playerLocale;
    @SerializedName("acct")
    private Account account;
    @SerializedName("age")
    private int age;
    @SerializedName("jti")
    private String jwtID;
    @SerializedName("affinity")
    private Affinity affinity;

    public String getCountryCode() {
        return countryCode;
    }

    public String getPlayerUUID() {
        return playerUUID;
    }

    public boolean isEmailVerified() {
        return emailVerified;
    }

    public String getPlayerProfileLocale() {
        return playerProfileLocale;
    }

    public LocalDateTime getCountryUpdateDate() {
        return LocalDateTime.ofInstant(Instant.ofEpochMilli(countryUpdateDateInMillis), ZoneId.systemDefault());
    }

    public PasswordInfo getPasswordInfo() {
        return passwordInfo;
    }

    public boolean isPhoneNumberVerified() {
        return phoneNumberVerified;
    }

    public boolean isAccountVerified() {
        return accountVerified;
    }

    public String getProfilePictureID() {
        return profilePictureID;
    }

    public String[] getFederatedIdentityProviders() {
        return federatedIdentityProviders;
    }

    public String getPlayerLocale() {
        return playerLocale;
    }

    public Account getAccount() {
        return account;
    }

    public int getAge() {
        return age;
    }

    public String getJWTID() {
        return jwtID;
    }

    public Affinity getAffinity() {
        return affinity;
    }

    public static class PasswordInfo {

        @SerializedName("cng_at")
        private long lastUpdateDateInMillis;
        @SerializedName("reset")
        private boolean reset;
        @SerializedName("must_reset")
        private boolean mustReset;

        public LocalDateTime getLastUpdateDate() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(lastUpdateDateInMillis), ZoneId.systemDefault());
        }

        public boolean hasBeenResetted() {
            return reset;
        }

        public boolean mustBeResetted() {
            return mustReset;
        }

    }

    public static class Account {

        @SerializedName("type")
        private int type;
        @SerializedName("state")
        private String state;
        @SerializedName("adm")
        private boolean admin;
        @SerializedName("game_name")
        private String name;
        @SerializedName("tag_line")
        private String tag;
        @SerializedName("created_at")
        private long creationDateInMillis;

        public int getType() {
            return type;
        }

        public String getState() {
            return state;
        }

        public boolean isAdmin() {
            return admin;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public LocalDateTime getCreationDate() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(creationDateInMillis), ZoneId.systemDefault());
        }

    }

    public static class Affinity {

        @SerializedName("pp")
        private String playerPlatform;

        public String getPlayerPlatform() {
            return playerPlatform;
        }

    }

}