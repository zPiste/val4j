package dev.piste.api.val4j.tests.util;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class Config {

    private static final Config instance;

    static {
        try {
            instance = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create()
                    .fromJson(new FileReader("test.config.json"), Config.class);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Expose
    @SerializedName("riotAccount")
    private RiotAccount riotAccount;
    @Expose
    @SerializedName("apiKey")
    private APIKey apiKey;

    public RiotAccount getRiotAccount() {
        return riotAccount;
    }

    public APIKey getAPIKey() {
        return apiKey;
    }

    public static class RiotAccount {

        @Expose
        @SerializedName("username")
        private String username;
        @Expose
        @SerializedName("password")
        private String password;

        public String getUsername() {
            return username;
        }

        public String getPassword() {
            return password;
        }

    }

    public static class APIKey {

        @Expose
        @SerializedName("riotGames")
        private String riotGames;

        public String getRiotGames() {
            return riotGames;
        }
        
    }

    public static Config getInstance() {
        return instance;
    }

}