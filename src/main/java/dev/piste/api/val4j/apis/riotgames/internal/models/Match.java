package dev.piste.api.val4j.apis.riotgames.internal.models;

import com.google.gson.annotations.SerializedName;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@SuppressWarnings("unused")
public class Match {

    @SerializedName("matchInfo")
    private MatchInfo matchInfo;
    @SerializedName("players")
    private Player[] players;
    @SerializedName("bots")
    private Bot[] bots;
    @SerializedName("coaches")
    private Coach[] coaches;
    @SerializedName("teams")
    private Team[] teams;
    @SerializedName("roundResults")
    private RoundResult[] roundResults;
    @SerializedName("kills")
    private Kill[] kills;

    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Bot[] getBots() {
        return bots;
    }

    public Coach[] getCoaches() {
        return coaches;
    }

    public Team[] getTeams() {
        return teams;
    }

    public RoundResult[] getRoundResults() {
        return roundResults;
    }

    public Kill[] getKills() {
        return kills;
    }

    public static class MatchInfo {

        @SerializedName("matchId")
        private String uuid;
        @SerializedName("mapId")
        private String mapURL;
        @SerializedName("gamePodId")
        private String gamePodID;
        @SerializedName("gameLoopZone")
        private String gameLoopZone;
        @SerializedName("gameServerAddress")
        private String gameServerAddress;
        @SerializedName("gameVersion")
        private String gameVersion;
        @SerializedName("gameLengthMillis")
        private long gameLengthInMillis;
        @SerializedName("gameStartMillis")
        private long gameStartInMillis;
        @SerializedName("provisioningFlowID")
        private String provisioningFlowID;
        @SerializedName("isCompleted")
        private boolean completed;
        @SerializedName("customGameName")
        private String customGameName;
        @SerializedName("forcePostProcessing")
        private boolean forcingPostProcessing;
        @SerializedName("queueID")
        private String queueID;
        @SerializedName("gameMode")
        private String gameModeURL;
        @SerializedName("isRanked")
        private boolean ranked;
        @SerializedName("isMatchSampled")
        private boolean sampled;
        @SerializedName("seasonId")
        private String seasonUUID;
        @SerializedName("completionStage")
        private String completionStage;
        @SerializedName("platformType")
        private String platformType;
        @SerializedName("shouldMatchDisablePenalties")
        private boolean shouldMatchDisablePenalties;

        public String getUUID() {
            return uuid;
        }

        public String getMapURL() {
            return mapURL;
        }

        public String getGamePodID() {
            return gamePodID;
        }

        public String getGameLoopZone() {
            return gameLoopZone;
        }

        public String getGameServerAddress() {
            return gameServerAddress;
        }

        public String getGameVersion() {
            return gameVersion;
        }

        public LocalDateTime getGameStartDate() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(gameStartInMillis), ZoneId.systemDefault());
        }

        public LocalDateTime getGameEndDate() {
            return LocalDateTime.ofInstant(Instant.ofEpochMilli(gameStartInMillis + gameLengthInMillis), ZoneId.systemDefault());
        }

        public String getProvisioningFlowID() {
            return provisioningFlowID;
        }

        public boolean isCompleted() {
            return completed;
        }

        public String getCustomGameName() {
            return customGameName;
        }

        public boolean isForcingPostProcessing() {
            return forcingPostProcessing;
        }

        public String getQueueID() {
            return queueID;
        }

        public String getGameModeURL() {
            return gameModeURL;
        }

        public boolean isRanked() {
            return ranked;
        }

        public boolean isSampled() {
            return sampled;
        }

        public String getSeasonUUID() {
            return seasonUUID;
        }

        public String getCompletionStage() {
            return completionStage;
        }

        public String getPlatformType() {
            return platformType;
        }

        public boolean isShouldMatchDisablePenalties() {
            return shouldMatchDisablePenalties;
        }

    }

    public static class Player {

        @SerializedName("subject")
        private String uuid;
        @SerializedName("gameName")
        private String name;
        @SerializedName("tagLine")
        private String tag;
        @SerializedName("platformInfo")
        private PlatformInfo platformInfo;
        @SerializedName("teamId")
        private String teamID;
        @SerializedName("partyUuid")
        private String partyUUID;
        @SerializedName("characterId")
        private String agentUUID;
        @SerializedName("stats")
        private Stats stats;
        @SerializedName("roundDamage")
        private RoundDamage[] roundDamage;
        @SerializedName("competitiveTier")
        private int competitiveTierID;
        @SerializedName("isObserver")
        private boolean observer;
        @SerializedName("playerCard")
        private String playerCardUUID;
        @SerializedName("playerTitle")
        private String playerTitleUUID;
        @SerializedName("preferredLevelBorder")
        private String preferredLevelBorderUUID;
        @SerializedName("accountLevel")
        private int level;
        @SerializedName("sessionPlaytimeMinutes")
        private int sessionPlaytimeInMinutes;
        @SerializedName("xpModifications")
        private XPModification[] xpModifications;
        @SerializedName("behaviourFactors")
        private BehaviourFactors behaviourFactors;

        public String getUUID() {
            return uuid;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public PlatformInfo getPlatformInfo() {
            return platformInfo;
        }

        public String getTeamID() {
            return teamID;
        }

        public String getPartyUUID() {
            return partyUUID;
        }

        public String getAgentUUID() {
            return agentUUID;
        }

        public Stats getStats() {
            return stats;
        }

        public RoundDamage[] getRoundDamage() {
            return roundDamage;
        }

        public int getCompetitiveTierID() {
            return competitiveTierID;
        }

        public boolean isObserver() {
            return observer;
        }

        public String getPlayerCardUUID() {
            return playerCardUUID;
        }

        public String getPlayerTitleUUID() {
            return playerTitleUUID;
        }

        public String getPreferredLevelBorderUUID() {
            return preferredLevelBorderUUID;
        }

        public int getLevel() {
            return level;
        }

        public int getSessionPlaytimeInMinutes() {
            return sessionPlaytimeInMinutes;
        }

        public XPModification[] getXpModifications() {
            return xpModifications;
        }

        public BehaviourFactors getBehaviourFactors() {
            return behaviourFactors;
        }

        public static class PlatformInfo {

            @SerializedName("platformType")
            private String platformType;
            @SerializedName("platformOS")
            private String platformOS;
            @SerializedName("platformOSVersion")
            private String platformOSVersion;
            @SerializedName("platformChipset")
            private String platformChipset;

            public String getPlatformType() {
                return platformType;
            }

            public String getPlatformOS() {
                return platformOS;
            }

            public String getPlatformOSVersion() {
                return platformOSVersion;
            }

            public String getPlatformChipset() {
                return platformChipset;
            }

        }

        public static class Stats {

            @SerializedName("score")
            private int score;
            @SerializedName("roundsPlayed")
            private int playedRoundsCount;
            @SerializedName("kills")
            private int killCount;
            @SerializedName("deaths")
            private int deathCount;
            @SerializedName("assists")
            private int assistCount;
            @SerializedName("playtimeMillis")
            private long playtimeInMillis;
            @SerializedName("abilityCasts")
            private AbilityCasts abilityCastCounts;

            public int getScore() {
                return score;
            }

            public int getPlayedRoundsCount() {
                return playedRoundsCount;
            }

            public int getKillCount() {
                return killCount;
            }

            public int getDeathCount() {
                return deathCount;
            }

            public int getAssistCount() {
                return assistCount;
            }

            public long getPlaytimeInMillis() {
                return playtimeInMillis;
            }

            public AbilityCasts getAbilityCastCounts() {
                return abilityCastCounts;
            }

            public static class AbilityCasts {

                @SerializedName("grenadeCasts")
                private int grenade;
                @SerializedName("ability1Casts")
                private int ability1;
                @SerializedName("ability2Casts")
                private int ability2;
                @SerializedName("ultimateCasts")
                private int ultimate;

                public int getGrenade() {
                    return grenade;
                }

                public int getAbility1() {
                    return ability1;
                }

                public int getAbility2() {
                    return ability2;
                }

                public int getUltimate() {
                    return ultimate;
                }

            }

        }

        public static class RoundDamage {

            @SerializedName("round")
            private int roundNumber;
            @SerializedName("receiver")
            private String receiverPlayerUUID;
            @SerializedName("damage")
            private int damageCount;

            public int getRoundNumber() {
                return roundNumber;
            }

            public String getReceiverPlayerUUID() {
                return receiverPlayerUUID;
            }

            public int getDamageCount() {
                return damageCount;
            }

        }

        public static class XPModification {

            @SerializedName("Value")
            private double value;
            @SerializedName("ID")
            private String uuid;

            public double getValue() {
                return value;
            }

            public String getUUID() {
                return uuid;
            }

        }

        public static class BehaviourFactors {

            @SerializedName("afkRounds")
            private int afkRoundsCount;
            @SerializedName("collisions")
            private double collisions;
            @SerializedName("commsRatingRecovery")
            private int commsRatingRecovery;
            @SerializedName("damageParticipationOutgoing")
            private int damageParticipationOutgoing;
            @SerializedName("friendlyFireIncoming")
            private int friendlyFireIncoming;
            @SerializedName("friendlyFireOutgoing")
            private int friendlyFireOutgoing;
            @SerializedName("mouseMovement")
            private int mouseMovement;
            @SerializedName("stayedInSpawnRounds")
            private int stayedInSpawnRoundsCount;

            public int getAFKRoundsCount() {
                return afkRoundsCount;
            }

            public double getCollisions() {
                return collisions;
            }

            public int getCommsRatingRecovery() {
                return commsRatingRecovery;
            }

            public int getDamageParticipationOutgoing() {
                return damageParticipationOutgoing;
            }

            public int getFriendlyFireIncoming() {
                return friendlyFireIncoming;
            }

            public int getFriendlyFireOutgoing() {
                return friendlyFireOutgoing;
            }

            public int getMouseMovement() {
                return mouseMovement;
            }

            public int getStayedInSpawnRoundsCount() {
                return stayedInSpawnRoundsCount;
            }

        }

    }

    public static class Bot {

        // Unknown

    }

    public static class Coach {

        @SerializedName("subject")
        private String uuid;
        @SerializedName("teamId")
        private String teamID;

        public String getUUID() {
            return uuid;
        }

        public String getTeamID() {
            return teamID;
        }
    }

    public static class Team {

        @SerializedName("teamId")
        private String id;
        @SerializedName("won")
        private boolean winner;
        @SerializedName("roundsPlayed")
        private int playedRoundsCount;
        @SerializedName("roundsWon")
        private int wonRoundsCount;
        @SerializedName("numPoints")
        private int pointsCount;

        public String getID() {
            return id;
        }

        public boolean isWinner() {
            return winner;
        }

        public int getPlayedRoundsCount() {
            return playedRoundsCount;
        }

        public int getWonRoundsCount() {
            return wonRoundsCount;
        }

        public int getPointsCount() {
            return pointsCount;
        }

    }

    public static class RoundResult {

        @SerializedName("roundNum")
        private int roundNumber;
        @SerializedName("roundResult")
        private String result;
        @SerializedName("roundCeremony")
        private String ceremony;
        @SerializedName("winningTeam")
        private String winningTeamID;
        @SerializedName("bombPlanter")
        private String bombPlanterPlayerUUID;
        @SerializedName("bombDefuser")
        private String bombDefuserPlayerUUID;
        @SerializedName("plantRoundTime")
        private int plantRoundTimeInMillis;
        @SerializedName("plantPlayerLocations")
        private PlayerLocation[] plantPlayerLocations;
        @SerializedName("plantLocation")
        private Location plantLocation;
        @SerializedName("plantSite")
        private String plantSite;
        @SerializedName("defuseRoundTime")
        private int defuseRoundTimeInMillis;
        @SerializedName("defusePlayerLocations")
        private PlayerLocation[] defusePlayerLocations;
        @SerializedName("defuseLocation")
        private Location defuseLocation;
        @SerializedName("playerStats")
        private PlayerStats[] playerStats;
        @SerializedName("roundResultCode")
        private String resultCode;
        @SerializedName("playerEconomies")
        private PlayerEconomy[] playerEconomies;
        @SerializedName("playerScores")
        private PlayerScore[] playerScores;

        public int getRoundNumber() {
            return roundNumber;
        }

        public String getResult() {
            return result;
        }

        public String getCeremony() {
            return ceremony;
        }

        public String getWinningTeamID() {
            return winningTeamID;
        }

        public String getBombPlanterPlayerUUID() {
            return bombPlanterPlayerUUID;
        }

        public String getBombDefuserPlayerUUID() {
            return bombDefuserPlayerUUID;
        }

        public int getPlantRoundTimeInMillis() {
            return plantRoundTimeInMillis;
        }

        public PlayerLocation[] getPlantPlayerLocations() {
            return plantPlayerLocations;
        }

        public Location getPlantLocation() {
            return plantLocation;
        }

        public String getPlantSite() {
            return plantSite;
        }

        public int getDefuseRoundTimeInMillis() {
            return defuseRoundTimeInMillis;
        }

        public PlayerLocation[] getDefusePlayerLocations() {
            return defusePlayerLocations;
        }

        public Location getDefuseLocation() {
            return defuseLocation;
        }

        public PlayerStats[] getPlayerStats() {
            return playerStats;
        }

        public String getResultCode() {
            return resultCode;
        }

        public PlayerEconomy[] getPlayerEconomies() {
            return playerEconomies;
        }

        public PlayerScore[] getPlayerScores() {
            return playerScores;
        }

        public static class PlayerStats {

            @SerializedName("subject")
            private String playerUUID;
            @SerializedName("kills")
            private Kill[] kills;
            @SerializedName("damage")
            private Damage[] damages;
            @SerializedName("score")
            private int score;
            @SerializedName("economy")
            private Economy economy;
            @SerializedName("wasAfk")
            private boolean wasAFK;
            @SerializedName("wasPenalized")
            private boolean penalized;
            @SerializedName("stayedInSpawn")
            private boolean stayingInSpawn;

            public String getPlayerUUID() {
                return playerUUID;
            }

            public Kill[] getKills() {
                return kills;
            }

            public Damage[] getDamages() {
                return damages;
            }

            public int getScore() {
                return score;
            }

            public Economy getEconomy() {
                return economy;
            }

            public boolean wasAFK() {
                return wasAFK;
            }

            public boolean isPenalized() {
                return penalized;
            }

            public boolean isStayingInSpawn() {
                return stayingInSpawn;
            }

            public static class Damage {

                @SerializedName("receiver")
                private String receiverPlayerUUID;
                @SerializedName("damage")
                private int damageCount;
                @SerializedName("legshots")
                private int legshotCount;
                @SerializedName("bodyshots")
                private int bodyshotCount;
                @SerializedName("headshots")
                private int headshotCount;

                public String getReceiverPlayerUUID() {
                    return receiverPlayerUUID;
                }

                public int getDamageCount() {
                    return damageCount;
                }

                public int getLegshotCount() {
                    return legshotCount;
                }

                public int getBodyshotCount() {
                    return bodyshotCount;
                }

                public int getHeadshotCount() {
                    return headshotCount;
                }

            }

            public static class Economy {

                @SerializedName("loadoutValue")
                private int loadoutValue;
                @SerializedName("weapon")
                private String weaponUUID;
                @SerializedName("armor")
                private String armorUUID;
                @SerializedName("remaining")
                private int remaining;
                @SerializedName("spent")
                private int spent;

                public int getLoadoutValue() {
                    return loadoutValue;
                }

                public String getWeaponUUID() {
                    return weaponUUID;
                }

                public String getArmorUUID() {
                    return armorUUID;
                }

                public int getRemaining() {
                    return remaining;
                }

                public int getSpent() {
                    return spent;
                }

            }

        }

        public static class PlayerEconomy {

            @SerializedName("subject")
            private String puuid;
            @SerializedName("loadoutValue")
            private int loadoutValue;
            @SerializedName("weapon")
            private String weaponUUID;
            @SerializedName("armor")
            private String armorUUID;
            @SerializedName("remaining")
            private int remaining;
            @SerializedName("spent")
            private int spent;

            public String getPuuid() {
                return puuid;
            }

            public int getLoadoutValue() {
                return loadoutValue;
            }

            public String getWeaponUUID() {
                return weaponUUID;
            }

            public String getArmorUUID() {
                return armorUUID;
            }

            public int getRemaining() {
                return remaining;
            }

        }

        public static class PlayerScore {

            @SerializedName("subject")
            private String playerUUID;
            @SerializedName("score")
            private int score;

            public String getPlayerUUID() {
                return playerUUID;
            }

            public int getScore() {
                return score;
            }

        }

    }

    public static class Kill {

        @SerializedName("gameTime")
        private int timeSinceGameStartInMillis;
        @SerializedName("roundTime")
        private int timeSinceRoundStartInMillis;
        @SerializedName("killer")
        private String killerPlayerUUID;
        @SerializedName("victim")
        private String victimPlayerUUID;
        @SerializedName("victimLocation")
        private Location victimLocation;
        @SerializedName("assistants")
        private String[] assistantPlayerUUIDs;
        @SerializedName("playerLocations")
        private PlayerLocation[] playerLocations;
        @SerializedName("finishingDamage")
        private FinishingDamage finishingDamage;

        public int getTimeSinceGameStartInMillis() {
            return timeSinceGameStartInMillis;
        }

        public int getTimeSinceRoundStartInMillis() {
            return timeSinceRoundStartInMillis;
        }

        public String getKillerPlayerUUID() {
            return killerPlayerUUID;
        }

        public String getVictimPlayerUUID() {
            return victimPlayerUUID;
        }

        public Location getVictimLocation() {
            return victimLocation;
        }

        public String[] getAssistantPlayerUUIDs() {
            return assistantPlayerUUIDs;
        }

        public PlayerLocation[] getPlayerLocations() {
            return playerLocations;
        }

        public FinishingDamage getFinishingDamage() {
            return finishingDamage;
        }

        public static class FinishingDamage {

            @SerializedName("damageType")
            private String damageType;
            @SerializedName("damageItem")
            private String damageItem;
            @SerializedName("isSecondaryFireMode")
            private boolean secondaryFireMode;

            public String getDamageType() {
                return damageType;
            }

            public String getDamageItem() {
                return damageItem;
            }

            public boolean isSecondaryFireMode() {
                return secondaryFireMode;
            }

        }

    }

    public static class PlayerLocation {

        @SerializedName("subject")
        private String playerUUID;
        @SerializedName("viewRadians")
        private double viewRadians;
        @SerializedName("location")
        private Location location;

        public String getPlayerUUID() {
            return playerUUID;
        }

        public double getViewRadians() {
            return viewRadians;
        }

        public Location getLocation() {
            return location;
        }

    }

    public static class Location {

        @SerializedName("x")
        private int x;
        @SerializedName("y")
        private int y;

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

    }

}