package dev.piste.api.val4j.apis.officer.models;

import com.google.gson.annotations.SerializedName;
import dev.piste.api.val4j.apis.officer.enums.AbilitySlot;

/**
 * @author Piste | https://github.com/PisteDev
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
    private String iconUrl;
    @SerializedName("displayIconSmall")
    private String smallIconUrl;
    @SerializedName("fullPortrait")
    private String portraitUrl;
    @SerializedName("killfeedPortrait")
    private String killfeedIconUrl;
    @SerializedName("background")
    private String backgroundImageUrl;
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

    public String getIconUrl() {
        return iconUrl;
    }

    public String getSmallIconUrl() {
        return smallIconUrl;
    }

    public String getPortraitUrl() {
        return portraitUrl;
    }

    public String getKillfeedIconUrl() {
        return killfeedIconUrl;
    }

    public String getBackgroundImageUrl() {
        return backgroundImageUrl;
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
        private String iconUrl;
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

        public String getIconUrl() {
            return iconUrl;
        }

        public String getAssetPath() {
            return assetPath;
        }

    }

    public static class Ability {

        @SerializedName("slot")
        private String slotName;
        @SerializedName("displayName")
        private String name;
        @SerializedName("description")
        private String description;
        @SerializedName("displayIcon")
        private String iconUrl;

        public AbilitySlot getSlot() {
            return AbilitySlot.of(slotName.toLowerCase());
        }

        public String getSlotName() {
            return slotName;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getIconUrl() {
            return iconUrl;
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
            private String wwiseFileUrl;
            @SerializedName("wave")
            private String waveFileUrl;

            public int getID() {
                return id;
            }

            public String getWwiseFileUrl() {
                return wwiseFileUrl;
            }

            public String getWaveFileUrl() {
                return waveFileUrl;
            }

        }

    }

}