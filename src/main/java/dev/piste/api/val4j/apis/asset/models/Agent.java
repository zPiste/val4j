package dev.piste.api.val4j.apis.asset.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.asset.enums.AbilitySlot;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Agent {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String name;
    @SerializedName("description")
    private String description;
    @SerializedName("developerName")
    private String developerName;
    @SerializedName("characterTags")
    private String[] tags;
    @SerializedName("displayIcon")
    private String iconURL;
    @SerializedName("displayIconSmall")
    private String smallIconURL;
    @SerializedName("fullPortrait")
    private String portraitURL;
    @SerializedName("killfeedPortrait")
    private String killfeedIconURL;
    @SerializedName("background")
    private String backgroundImageURL;
    @SerializedName("backgroundGradientColors")
    private String[] backgroundGradientColors;
    @SerializedName("assetPath")
    private String assetPath;
    @SerializedName("isFullPortraitRightFacing")
    private boolean fullPortraitRightFacing;
    @SerializedName("isPlayableCharacter")
    private boolean playableCharacter;
    @SerializedName("isAvailableForTest")
    private boolean availableForTest;
    @SerializedName("isBaseContent")
    private boolean baseContent;
    @SerializedName("role")
    private Role role;
    @SerializedName("abilities")
    private Ability[] abilities;
    @SerializedName("voiceLine")
    private VoiceLine voiceLine;

    public String getUUID() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public String[] getTags() {
        return tags;
    }

    public String getIconURL() {
        return iconURL;
    }

    public String getSmallIconURL() {
        return smallIconURL;
    }

    public String getPortraitURL() {
        return portraitURL;
    }

    public String getKillfeedIconURL() {
        return killfeedIconURL;
    }

    public String getBackgroundImageURL() {
        return backgroundImageURL;
    }

    public String[] getBackgroundGradientColors() {
        return backgroundGradientColors;
    }

    public String getAssetPath() {
        return assetPath;
    }

    public boolean isFullPortraitRightFacing() {
        return fullPortraitRightFacing;
    }

    public boolean isPlayableCharacter() {
        return playableCharacter;
    }

    public boolean isAvailableForTest() {
        return availableForTest;
    }

    public boolean isBaseContent() {
        return baseContent;
    }

    public Role getRole() {
        return role;
    }

    public Ability[] getAbilities() {
        return abilities;
    }

    public VoiceLine getVoiceLine() {
        return voiceLine;
    }

    public static class Role {

        @SerializedName("uuid")
        private String uuid;
        @SerializedName("displayName")
        private String name;
        @SerializedName("description")
        private String description;
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

        public String getDescription() {
            return description;
        }

        public String getIconURL() {
            return iconURL;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

    public static class Ability {

        @SerializedName("slot")
        private String slotID;
        @SerializedName("displayName")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("displayIcon")
        private String iconURL;

        public AbilitySlot getSlot() {
            return AbilitySlot.ofID(slotID.toLowerCase());
        }

        public String getSlotID() {
            return slotID;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getIconURL() {
            return iconURL;
        }

    }

    public static class VoiceLine {

        @SerializedName("minDuration")
        private double minimumDuration;
        @SerializedName("maxDuration")
        private double maximumDuration;
        @SerializedName("mediaList")
        private Media[] medias;

        public double getMinimumDuration() {
            return minimumDuration;
        }

        public double getMaximumDuration() {
            return maximumDuration;
        }

        public Media[] getMedias() {
            return medias;
        }

        public static class Media {

            @SerializedName("id")
            private int id;
            @SerializedName("wwise")
            private String wwiseFileURL;
            @SerializedName("wave")
            private String waveFileURL;

            public int getID() {
                return id;
            }

            public String getWwiseFileURL() {
                return wwiseFileURL;
            }

            public String getWaveFileURL() {
                return waveFileURL;
            }

        }

    }

}