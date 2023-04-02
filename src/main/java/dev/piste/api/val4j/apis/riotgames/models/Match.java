package dev.piste.api.val4j.apis.riotgames.models;

import com.google.gson.annotations.SerializedName;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
@SuppressWarnings("unused")
public class Match {

    @SerializedName("matchInfo")
    private MatchInfo matchInfo;
    @SerializedName("players")
    private Player[] players;
    @SerializedName("coaches")
    private Coach[] coaches;
    @SerializedName("teams")
    private Team[] teams;
    @SerializedName("roundResults")
    private RoundResult[] roundResults;

    public MatchInfo getMatchInfo() {
        return matchInfo;
    }

    public Player[] getPlayers() {
        return players;
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

    public static class MatchInfo {

        @SerializedName("matchId")
        private String uuid;
        @SerializedName("mapId")
        private String mapUrl;
        @SerializedName("gameVersion")
        private String gameVersion;
        @SerializedName("gameLengthMillis")
        private long gameLengthMillis;
        @SerializedName("region")
        private String region;
        @SerializedName("gameStartMillis")
        private long gameStartMillis;
        @SerializedName("provisioningFlowId")
        private String provisioningFlowId;
        @SerializedName("isCompleted")
        private boolean completed;
        @SerializedName("customGameName")
        private String customGameName;
        @SerializedName("queueId")
        private String queueId;
        @SerializedName("gameMode")
        private String gameModeUrl;
        @SerializedName("isRanked")
        private boolean ranked;
        @SerializedName("seasonId")
        private String seasonUuid;

        public String getUUID() {
            return uuid;
        }

        public String getMapUrl() {
            return mapUrl;
        }

        public LocalDateTime getStartDateTime() {
            return LocalDateTime.ofEpochSecond(gameStartMillis / 1000, 0, ZoneOffset.UTC);
        }

        public LocalDateTime getEndDateTime() {
            return LocalDateTime.ofEpochSecond((gameStartMillis + gameLengthMillis) / 1000, 0, ZoneOffset.UTC);
        }

        public String getProvisioningFlowID() {
            return provisioningFlowId;
        }

        public boolean isCompleted() {
            return completed;
        }

        public String getCustomGameName() {
            return customGameName;
        }

        public String getQueueID() {
            return queueId;
        }

        public String getGameModeUrl() {
            return gameModeUrl;
        }

        public boolean isRanked() {
            return ranked;
        }

        public String getSeasonUUID() {
            return seasonUuid;
        }

    }

    public static class Player {

        @SerializedName("puuid")
        private String puuid;
        @SerializedName("gameName")
        private String name;
        @SerializedName("tagLine")
        private String tag;
        @SerializedName("teamId")
        private String teamId;
        @SerializedName("partyId")
        private String partyUuid;
        @SerializedName("characterId")
        private String agentUuid;
        @SerializedName("stats")
        private Stats stats;
        @SerializedName("competitiveTier")
        private int rankId;
        @SerializedName("playerCard")
        private String playerCardUuid;
        @SerializedName("playerTitle")
        private String playerTitleUuid;

        public String getPUUID() {
            return puuid;
        }

        public String getName() {
            return name;
        }

        public String getTag() {
            return tag;
        }

        public String getTeamID() {
            return teamId;
        }

        public String getPartyUUID() {
            return partyUuid;
        }

        public String getAgentUUID() {
            return agentUuid;
        }

        public Stats getStats() {
            return stats;
        }

        public int getRankID() {
            return rankId;
        }

        public String getPlayerCardUUID() {
            return playerCardUuid;
        }

        public String getPlayerTitleUUID() {
            return playerTitleUuid;
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
            private long playtimeMillis;
            @SerializedName("abilityCasts")
            private AbilityCasts abilityCasts;

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

            public long getPlaytimeMillis() {
                return playtimeMillis;
            }

            public AbilityCasts getAbilityCasts() {
                return abilityCasts;
            }

            public static class AbilityCasts {

                @SerializedName("grenadeCasts")
                private int grenadeCastCount;
                @SerializedName("ability1Casts")
                private int ability1CastCount;
                @SerializedName("ability2Casts")
                private int ability2CastCount;
                @SerializedName("ultimateCasts")
                private int ultimateCastCount;

                // Key: C
                public int getGrenadeCastCount() {
                    return grenadeCastCount;
                }

                // Key: Q
                public int getAbility1CastCount() {
                    return ability1CastCount;
                }

                // Key: E
                public int getAbility2CastCount() {
                    return ability2CastCount;
                }

                // Key: X
                public int getUltimateCastCount() {
                    return ultimateCastCount;
                }

            }

        }

    }

    public static class Coach {

        @SerializedName("puuid")
        private String puuid;
        @SerializedName("teamId")
        private String teamId;

        public String getPUUID() {
            return puuid;
        }

        public String getTeamID() {
            return teamId;
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
        private int points;

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

        public int getPoints() {
            return points;
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
        private String winningTeamId;
        @SerializedName("bombPlanter")
        private String bombPlanterPuuid;
        @SerializedName("bombDefuser")
        private String bombDefuserPuuid;
        @SerializedName("plantRoundTime")
        private int plantRoundTime;
        @SerializedName("plantPlayerLocations")
        private PlayerLocation[] plantPlayerLocations;
        @SerializedName("plantLocation")
        private Location plantLocation;
        @SerializedName("plantSite")
        private String plantSite;
        @SerializedName("defuseRoundTime")
        private int defuseRoundTime;
        @SerializedName("defusePlayerLocations")
        private PlayerLocation[] defusePlayerLocations;
        @SerializedName("defuseLocation")
        private Location defuseLocation;
        @SerializedName("playerStats")
        private PlayerStats[] playerStats;
        @SerializedName("roundResultCode")
        private String resultCode;

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
            return winningTeamId;
        }

        public String getBombPlanterPUUID() {
            return bombPlanterPuuid;
        }

        public String getBombDefuserPUUID() {
            return bombDefuserPuuid;
        }

        public int getPlantRoundTime() {
            return plantRoundTime;
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

        public int getDefuseRoundTime() {
            return defuseRoundTime;
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

        public static class PlayerLocation {

            @SerializedName("puuid")
            private String puuid;
            @SerializedName("viewRadians")
            private float viewRadians;
            @SerializedName("location")
            private Location location;

            public String getPUUID() {
                return puuid;
            }

            public float getViewRadians() {
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

        public static class PlayerStats {

            @SerializedName("puuid")
            private String puuid;
            @SerializedName("kills")
            private Kill[] kills;
            @SerializedName("damage")
            private Damage[] damages;
            @SerializedName("score")
            private int score;
            @SerializedName("economy")
            private Economy economy;
            @SerializedName("ability")
            private Ability ability;

            public String getPUUID() {
                return puuid;
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

            public Ability getAbility() {
                return ability;
            }

            public static class Kill {

                @SerializedName("timeSinceGameStartMillis")
                private long timeSinceGameStartMillis;
                @SerializedName("timeSinceRoundStartMillis")
                private long timeSinceRoundStartMillis;
                @SerializedName("killer")
                private String killerPuuid;
                @SerializedName("victim")
                private String victimPuuid;
                @SerializedName("victimLocation")
                private Location victimLocation;
                @SerializedName("assistants")
                private String[] assistantPuuids;
                @SerializedName("playerLocations")
                private PlayerLocation[] playerLocations;
                @SerializedName("finishingDamage")
                private FinishingDamage finishingDamage;

                public long getTimeSinceGameStartMillis() {
                    return timeSinceGameStartMillis;
                }

                public long getTimeSinceRoundStartMillis() {
                    return timeSinceRoundStartMillis;
                }

                public String getKillerPUUID() {
                    return killerPuuid;
                }

                public String getVictimPUUID() {
                    return victimPuuid;
                }

                public Location getVictimLocation() {
                    return victimLocation;
                }

                public String[] getAssistantPUUIDs() {
                    return assistantPuuids;
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

            public static class Damage {

                @SerializedName("receiver")
                private String receiverPuuid;
                @SerializedName("damage")
                private int damageCount;
                @SerializedName("legshots")
                private int legshotCount;
                @SerializedName("bodyshots")
                private int bodyshotCount;
                @SerializedName("headshots")
                private int headshotCount;

                public String getReceiverPUUID() {
                    return receiverPuuid;
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
                private String weaponUuid;
                @SerializedName("armor")
                private String armorUuid;
                @SerializedName("remaining")
                private int remainingMoney;
                @SerializedName("spent")
                private int spentMoney;

                public int getLoadoutValue() {
                    return loadoutValue;
                }

                public String getWeaponUUID() {
                    return weaponUuid.toLowerCase();
                }

                public String getArmorUuid() {
                    return armorUuid.toLowerCase();
                }

                public int getRemainingMoney() {
                    return remainingMoney;
                }

                public int getSpentMoney() {
                    return spentMoney;
                }

            }

            public static class Ability {

                @SerializedName("grenadeEffects")
                private String grenadeEffects;
                @SerializedName("ability1Effects")
                private String ability1Effects;
                @SerializedName("ability2Effects")
                private String ability2Effects;
                @SerializedName("ultimateEffects")
                private String ultimateEffects;

                // Key: C
                public String getGrenadeEffects() {
                    return grenadeEffects;
                }

                // Key: Q
                public String getAbility1Effects() {
                    return ability1Effects;
                }

                // Key: E
                public String getAbility2Effects() {
                    return ability2Effects;
                }

                // Key: R
                public String getUltimateEffects() {
                    return ultimateEffects;
                }

            }

        }

    }

}