package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.asset.ValorantAssetAPI;
import dev.piste.api.val4j.apis.asset.models.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("Officer API (VALORANT assets)")
public class TestValorantAssetAPI {

    private final ValorantAssetAPI api;
    private static final String AGENT_UUID = "5f8d3a7f-467b-97f3-062c-13acf203c006"; // Breach
    private static final String BUDDY_UUID = "2215fb09-4cf3-e57a-cd15-dfb00f92dd44"; // Araxys
    private static final String BUDDY_LEVEL_UUID = "f3b997d0-439d-eaa2-5d82-0392e75e2fb1"; // Antares
    private static final String BUNDLE_UUID = "3941ad01-4e3b-46e0-ba3a-ab94f7c67f98"; // Xenohunter
    private static final String CEREMONY_UUID = "1e71c55c-476e-24ac-0687-e48b547dbb35"; // Ace
    private static final String COMPETITIVE_TIER_TABLE_UUID = "564d8e28-c226-3180-6285-e48a390db8b1"; // Episode 1
    private static final String CONTENT_TIER_UUID = "0cebb8be-46d7-c12a-d306-e9907bfc5a25"; // Deluxe
    private static final String CONTRACT_UUID = "cae6ab4a-4b4a-69a0-3c7a-48b17e313f52"; // Gekko Gear
    private static final String CURRENCY_UUID = "85ad13f7-3d1b-5128-9eb2-7cd8ee0b5741"; // VP
    private static final String EVENT_UUID = "96682481-4f7b-6322-18bb-f1a76f91a35f"; // Champions
    private static final String GAME_MODE_UUID = "96bd3920-4f36-d026-2b28-c683eb0bcac5"; // Standard
    private static final String QUEUE_UUID = "d2faff85-4964-f52e-b6b5-73a5d66ccad6"; // Competitive
    private static final String EQUIPPABLE_UUID = "c5de005c-4bdc-26a7-a47d-c295eaaae9d8"; // Classic
    private static final String GEAR_UUID = "822bcab2-40a2-324e-c137-e09195ad7692"; // Heavy Shields
    private static final String LEVEL_BORDER_UUID = "ebc736cd-4b6a-137b-e2b0-1486e31312c9"; // Level 1
    private static final String MAP_UUID = "7eaecc1b-4337-bbf6-6ab9-04b8f06b3319"; // Ascent
    private static final String PLAYER_CARD_UUID = "fc209787-414b-10d0-dcac-04832fc2c654"; // Hivemind
    private static final String PLAYER_TITLE_UUID = "48d870a2-4493-ebf8-7d6f-979be914dc43"; // Fortune
    private static final String SEASON_UUID = "0df5adb9-4dcb-6899-1306-3e9860661dd3"; // Closed Beta
    private static final String COMPETITIVE_SEASON_UUID = "8d9e3688-470b-c0e0-5b20-ca964d907adb"; // Closed Beta
    private static final String SPRAY_UUID = "89565f02-495e-e6f0-5f67-959626122909"; // GGWP
    private static final String SPRAY_LEVEL_UUID = "f586cdaa-4d3b-8551-4155-748e3bbfa765"; // GGWP
    private static final String THEME_UUID = "2aebbb13-48a0-2c71-04c3-45a58f53f3e5"; // Immortalized
    private static final String WEAPON_UUID = "63e6c2b6-4a8e-869c-3d4c-e38355226584"; // Odin
    private static final String WEAPON_SKIN_UUID = "89be9866-4807-6235-2a95-499cd23828df"; // Altitude Odin
    private static final String WEAPON_SKIN_CHROMA_UUID = "092a25a4-422f-f577-37ac-26a5d489c155"; // Altitude Odin
    private static final String WEAPON_SKIN_LEVEL_UUID = "578e9077-4f88-260c-e54c-b988425c60e4"; // Altitude Odin

    public TestValorantAssetAPI() {
        this.api = new ValorantAssetAPI();
    }

    @Test
    public void testGetPlayableAgents() throws IOException {
        Agent[] agents = api.getPlayableAgents();
        assertNotNull(agents);
        assertTrue(agents.length > 0);
    }

    @Test
    public void testGetAgents() throws IOException {
        Agent[] agents = api.getAgents();
        assertNotNull(agents);
        assertTrue(agents.length > 0);
    }

    @Test
    public void testGetAgent() throws IOException {
        Agent agent = api.getAgent(AGENT_UUID);
        assertNotNull(agent);
        assertEquals(AGENT_UUID, agent.getUUID());
    }

    @Test
    public void testGetBuddies() throws IOException {
        Buddy[] buddies = api.getBuddies();
        assertNotNull(buddies);
        assertTrue(buddies.length > 0);
    }

    @Test
    public void testGetBuddy() throws IOException {
        Buddy buddy = api.getBuddy(BUDDY_UUID);
        assertNotNull(buddy);
        assertEquals(BUDDY_UUID, buddy.getUUID());
    }

    @Test
    public void testGetBuddyLevels() throws IOException {
        Buddy.Level[] buddyLevels = api.getBuddyLevels();
        assertNotNull(buddyLevels);
        assertTrue(buddyLevels.length > 0);
    }

    @Test
    public void testGetBuddyLevel() throws IOException {
        Buddy.Level buddyLevel = api.getBuddyLevel(BUDDY_LEVEL_UUID);
        assertNotNull(buddyLevel);
        assertEquals(BUDDY_LEVEL_UUID, buddyLevel.getUUID());
    }

    @Test
    public void testGetBundles() throws IOException {
        Bundle[] bundles = api.getBundles();
        assertNotNull(bundles);
        assertTrue(bundles.length > 0);
    }

    @Test
    public void testGetBundle() throws IOException {
        Bundle bundle = api.getBundle(BUNDLE_UUID);
        assertNotNull(bundle);
        assertEquals(BUNDLE_UUID, bundle.getUUID());
    }

    @Test
    public void testGetCeremonies() throws IOException {
        Ceremony[] ceremonies = api.getCeremonies();
        assertNotNull(ceremonies);
        assertTrue(ceremonies.length > 0);
    }

    @Test
    public void testGetCeremony() throws IOException {
        Ceremony ceremony = api.getCeremony(CEREMONY_UUID);
        assertNotNull(ceremony);
        assertEquals(CEREMONY_UUID, ceremony.getUUID());
    }

    @Test
    public void testGetCompetitiveTierTables() throws IOException {
        CompetitiveTierTable[] competitiveTierTables = api.getCompetitiveTierTables();
        assertNotNull(competitiveTierTables);
        assertTrue(competitiveTierTables.length > 0);
    }

    @Test
    public void testGetCompetitiveTierTable() throws IOException {
        CompetitiveTierTable competitiveTierTable = api.getCompetitiveTierTable(COMPETITIVE_TIER_TABLE_UUID);
        assertNotNull(competitiveTierTable);
        assertEquals(COMPETITIVE_TIER_TABLE_UUID, competitiveTierTable.getUUID());
    }

    @Test
    public void testGetCurrentCompetitiveTierTable() throws IOException {
        CompetitiveTierTable competitiveTierTable = api.getCurrentCompetitiveTierTable();
        assertNotNull(competitiveTierTable);
    }

    @Test
    public void testGetContentTiers() throws IOException {
        ContentTier[] contentTiers = api.getContentTiers();
        assertNotNull(contentTiers);
        assertTrue(contentTiers.length > 0);
    }

    @Test
    public void testGetContentTier() throws IOException {
        ContentTier contentTier = api.getContentTier(CONTENT_TIER_UUID);
        assertNotNull(contentTier);
        assertEquals(CONTENT_TIER_UUID, contentTier.getUUID());
    }

    @Test
    public void testGetContracts() throws IOException {
        Contract[] contracts = api.getContracts();
        assertNotNull(contracts);
        assertTrue(contracts.length > 0);
    }

    @Test
    public void testGetContract() throws IOException {
        Contract contract = api.getContract(CONTRACT_UUID);
        assertNotNull(contract);
        assertEquals(CONTRACT_UUID, contract.getUUID());
    }

    @Test
    public void testGetCurrencies() throws IOException {
        Currency[] currencies = api.getCurrencies();
        assertNotNull(currencies);
        assertTrue(currencies.length > 0);
    }

    @Test
    public void testGetCurrency() throws IOException {
        Currency currency = api.getCurrency(CURRENCY_UUID);
        assertNotNull(currency);
        assertEquals(CURRENCY_UUID, currency.getUUID());
    }

    @Test
    public void testGetEvents() throws IOException {
        Event[] events = api.getEvents();
        assertNotNull(events);
        assertTrue(events.length > 0);
    }

    @Test
    public void testGetEvent() throws IOException {
        Event event = api.getEvent(EVENT_UUID);
        assertNotNull(event);
        assertEquals(EVENT_UUID, event.getUUID());
    }

    @Test
    public void testGetGameModes() throws IOException {
        GameMode[] gameModes = api.getGameModes();
        assertNotNull(gameModes);
        assertTrue(gameModes.length > 0);
    }

    @Test
    public void testGetGameMode() throws IOException {
        GameMode gameMode = api.getGameMode(GAME_MODE_UUID);
        assertNotNull(gameMode);
        assertEquals(GAME_MODE_UUID, gameMode.getUUID());
    }

    @Test
    public void testGetQueues() throws IOException {
        Queue[] queues = api.getQueues();
        assertNotNull(queues);
        assertTrue(queues.length > 0);
    }

    @Test
    public void testGetQueue() throws IOException {
        Queue queue = api.getQueue(QUEUE_UUID);
        assertNotNull(queue);
        assertEquals(QUEUE_UUID, queue.getUUID());
    }

    @Test
    public void testGetEquippables() throws IOException {
        Equippable[] equippables = api.getEquippables();
        assertNotNull(equippables);
        assertTrue(equippables.length > 0);
    }

    @Test
    public void testGetEquippable() throws IOException {
        Equippable equippable = api.getEquippable(EQUIPPABLE_UUID);
        assertNotNull(equippable);
        assertEquals(EQUIPPABLE_UUID, equippable.getUUID());
    }

    @Test
    public void testGetGears() throws IOException {
        Gear[] gears = api.getGear();
        assertNotNull(gears);
        assertTrue(gears.length > 0);
    }

    @Test
    public void testGetGear() throws IOException {
        Gear gear = api.getGear(GEAR_UUID);
        assertNotNull(gear);
        assertEquals(GEAR_UUID, gear.getUUID());
    }

    @Test
    public void testGetLevelBorders() throws IOException {
        LevelBorder[] levelBorders = api.getLevelBorders();
        assertNotNull(levelBorders);
        assertTrue(levelBorders.length > 0);
    }

    @Test
    public void testGetLevelBorder() throws IOException {
        LevelBorder levelBorder = api.getLevelBorder(LEVEL_BORDER_UUID);
        assertNotNull(levelBorder);
        assertEquals(LEVEL_BORDER_UUID, levelBorder.getUUID());
    }

    @Test
    public void testGetMaps() throws IOException {
        Map[] maps = api.getMaps();
        assertNotNull(maps);
        assertTrue(maps.length > 0);
    }

    @Test
    public void testGetMap() throws IOException {
        Map map = api.getMap(MAP_UUID);
        assertNotNull(map);
        assertEquals(MAP_UUID, map.getUUID());
    }

    @Test
    public void testGetPlayerCards() throws IOException {
        PlayerCard[] playerCards = api.getPlayerCards();
        assertNotNull(playerCards);
        assertTrue(playerCards.length > 0);
    }

    @Test
    public void testGetPlayerCard() throws IOException {
        PlayerCard playerCard = api.getPlayerCard(PLAYER_CARD_UUID);
        assertNotNull(playerCard);
        assertEquals(PLAYER_CARD_UUID, playerCard.getUUID());
    }

    @Test
    public void testGetPlayerTitles() throws IOException {
        PlayerTitle[] playerTitles = api.getPlayerTitles();
        assertNotNull(playerTitles);
        assertTrue(playerTitles.length > 0);
    }

    @Test
    public void testGetPlayerTitle() throws IOException {
        PlayerTitle playerTitle = api.getPlayerTitle(PLAYER_TITLE_UUID);
        assertNotNull(playerTitle);
        assertEquals(PLAYER_TITLE_UUID, playerTitle.getUUID());
    }

    @Test
    public void testGetSeasons() throws IOException {
        Season[] seasons = api.getSeasons();
        assertNotNull(seasons);
        assertTrue(seasons.length > 0);
    }

    @Test
    public void testGetSeason() throws IOException {
        Season season = api.getSeason(SEASON_UUID);
        assertNotNull(season);
        assertEquals(SEASON_UUID, season.getUUID());
    }

    @Test
    public void testGetCompetitiveSeasons() throws IOException {
        CompetitiveSeason[] competitiveSeasons = api.getCompetitiveSeasons();
        assertNotNull(competitiveSeasons);
        assertTrue(competitiveSeasons.length > 0);
    }

    @Test
    public void testGetCompetitiveSeason() throws IOException {
        CompetitiveSeason competitiveSeason = api.getCompetitiveSeason(COMPETITIVE_SEASON_UUID);
        assertNotNull(competitiveSeason);
        assertEquals(COMPETITIVE_SEASON_UUID, competitiveSeason.getUUID());
    }

    @Test
    public void testGetSprays() throws IOException {
        Spray[] sprays = api.getSprays();
        assertNotNull(sprays);
        assertTrue(sprays.length > 0);
    }

    @Test
    public void testGetSpray() throws IOException {
        Spray spray = api.getSpray(SPRAY_UUID);
        assertNotNull(spray);
        assertEquals(SPRAY_UUID, spray.getUUID());
    }

    @Test
    public void testGetSprayLevels() throws IOException {
        Spray.Level[] sprayLevels = api.getSprayLevels();
        assertNotNull(sprayLevels);
        assertTrue(sprayLevels.length > 0);
    }

    @Test
    public void testGetSprayLevel() throws IOException {
        Spray.Level sprayLevel = api.getSprayLevel(SPRAY_LEVEL_UUID);
        assertNotNull(sprayLevel);
        assertEquals(SPRAY_LEVEL_UUID, sprayLevel.getUUID());
    }

    @Test
    public void testGetThemes() throws IOException {
        Theme[] themes = api.getThemes();
        assertNotNull(themes);
        assertTrue(themes.length > 0);
    }

    @Test
    public void testGetTheme() throws IOException {
        Theme theme = api.getTheme(THEME_UUID);
        assertNotNull(theme);
        assertEquals(THEME_UUID, theme.getUUID());
    }

    @Test
    public void testGetWeapons() throws IOException {
        Weapon[] weapons = api.getWeapons();
        assertNotNull(weapons);
        assertTrue(weapons.length > 0);
    }

    @Test
    public void testGetWeapon() throws IOException {
        Weapon weapon = api.getWeapon(WEAPON_UUID);
        assertNotNull(weapon);
        assertEquals(WEAPON_UUID, weapon.getUUID());
    }

    @Test
    public void testGetWeaponSkins() throws IOException {
        WeaponSkin[] weaponSkins = api.getWeaponSkins();
        assertNotNull(weaponSkins);
        assertTrue(weaponSkins.length > 0);
    }

    @Test
    public void testGetWeaponSkin() throws IOException {
        WeaponSkin weaponSkin = api.getWeaponSkin(WEAPON_SKIN_UUID);
        assertNotNull(weaponSkin);
        assertEquals(WEAPON_SKIN_UUID, weaponSkin.getUUID());
    }

    @Test
    public void testGetWeaponSkinChromas() throws IOException {
        WeaponSkin.Chroma[] weaponSkinChromas = api.getWeaponSkinChromas();
        assertNotNull(weaponSkinChromas);
        assertTrue(weaponSkinChromas.length > 0);
    }

    @Test
    public void testGetWeaponSkinChroma() throws IOException {
        WeaponSkin.Chroma weaponSkinChroma = api.getWeaponSkinChroma(WEAPON_SKIN_CHROMA_UUID);
        assertNotNull(weaponSkinChroma);
        assertEquals(WEAPON_SKIN_CHROMA_UUID, weaponSkinChroma.getUUID());
    }

    @Test
    public void testGetWeaponSkinLevels() throws IOException {
        WeaponSkin.Level[] weaponSkinLevels = api.getWeaponSkinLevels();
        assertNotNull(weaponSkinLevels);
        assertTrue(weaponSkinLevels.length > 0);
    }

    @Test
    public void testGetWeaponSkinLevel() throws IOException {
        WeaponSkin.Level weaponSkinLevel = api.getWeaponSkinLevel(WEAPON_SKIN_LEVEL_UUID);
        assertNotNull(weaponSkinLevel);
        assertEquals(WEAPON_SKIN_LEVEL_UUID, weaponSkinLevel.getUUID());
    }

    @Test
    public void testGetVersion() throws IOException {
        Version version = api.getVersion();
        assertNotNull(version);
    }

}