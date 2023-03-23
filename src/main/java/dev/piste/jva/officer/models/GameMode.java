package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class GameMode {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("duration")
    private String duration;
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
    private String displayIcon;
    @SerializedName("assetPath")
    private String assetPath;

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDuration() {
        return duration;
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

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public static class GameFeature {

        @SerializedName("featureName")
        private String featureName;
        @SerializedName("state")
        private boolean enabled;

        public String getFeatureName() {
            return featureName;
        }

        public boolean isEnabled() {
            return enabled;
        }

    }

    public static class GameRule {

        @SerializedName("ruleName")
        private String ruleName;
        @SerializedName("state")
        private boolean enabled;

        public String getRuleName() {
            return ruleName;
        }

        public boolean isEnabled() {
            return enabled;
        }

    }

}