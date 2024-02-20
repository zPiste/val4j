package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class GameMode {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("duration")
    private String durationAsString;
    @SerializedName("allowsMatchTimeouts")
    private boolean allowingMatchTimeouts;
    @SerializedName("isTeamVoiceAllowed")
    private boolean teamVoiceAllowed;
    @SerializedName("isMinimapHidden")
    private boolean minimapHidden;
    @SerializedName("orbCount")
    private int orbCount;
    @SerializedName("roundsPerHalf")
    private int roundsPerHalf;
    @SerializedName("teamRoles")
    private String[] teamRoles;
    @SerializedName("gameFeatureOverrides")
    private GameFeature[] gameFeatureOverrides;
    @SerializedName("gameRuleBoolOverrides")
    private GameRule[] gameRuleBoolOverrides;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDurationAsString() {
        return durationAsString.toLowerCase();
    }

    public boolean isAllowingMatchTimeouts() {
        return allowingMatchTimeouts;
    }

    public boolean isTeamVoiceAllowed() {
        return teamVoiceAllowed;
    }

    public boolean isMinimapHidden() {
        return minimapHidden;
    }

    public int getOrbCount() {
        return orbCount;
    }

    public int getRoundsPerHalf() {
        return roundsPerHalf;
    }

    public String[] getTeamRoles() {
        return teamRoles;
    }

    public GameFeature[] getGameFeatureOverrides() {
        return gameFeatureOverrides;
    }

    public GameRule[] getGameRuleBoolOverrides() {
        return gameRuleBoolOverrides;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public static class GameFeature {

        @SerializedName("featureName")
        private String name;
        @SerializedName("state")
        private boolean enabled;

        public String getName() {
            return name;
        }

        public boolean isEnabled() {
            return enabled;
        }

    }

    public static class GameRule {

        @SerializedName("ruleName")
        private String name;
        @SerializedName("state")
        private boolean enabled;

        public String getName() {
            return name;
        }

        public boolean isEnabled() {
            return enabled;
        }

    }

}