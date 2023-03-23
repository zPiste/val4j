package dev.piste.jva.officer.models;

import com.google.gson.annotations.SerializedName;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class Agent {

    @SerializedName("uuid")
    private String uuid;
    @SerializedName("displayName")
    private String displayName;
    @SerializedName("description")
    private String description;
    @SerializedName("developerName")
    private String developerName;
    @SerializedName("characterTags")
    private String[] characterTags;
    @SerializedName("displayIcon")
    private String displayIcon;
    @SerializedName("displayIconSmall")
    private String displayIconSmall;
    @SerializedName("bustPortrait")
    private String bustPortrait;
    @SerializedName("fullPortrait")
    private String fullPortrait;
    @SerializedName("fullPortraitV2")
    private String fullPortraitV2;
    @SerializedName("killfeedPortrait")
    private String killfeedPortrait;
    @SerializedName("background")
    private String background;
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

    public String getUUID() {
        return uuid;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDescription() {
        return description;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public String[] getCharacterTags() {
        return characterTags;
    }

    public String getDisplayIcon() {
        return displayIcon;
    }

    public String getDisplayIconSmall() {
        return displayIconSmall;
    }

    public String getBustPortrait() {
        return bustPortrait;
    }

    public String getFullPortrait() {
        return fullPortrait;
    }

    public String getFullPortraitV2() {
        return fullPortraitV2;
    }

    public String getKillfeedPortrait() {
        return killfeedPortrait;
    }

    public String getBackground() {
        return background;
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

}