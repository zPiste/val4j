package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.officer.OfficerAPI;
import dev.piste.api.val4j.apis.officer.models.*;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class TestOfficerAPI {

    private final OfficerAPI api;

    public TestOfficerAPI() {
        this.api = new OfficerAPI();
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
        Agent agent = api.getAgent("707eab51-4836-f488-046a-cda6bf494859");
        assertNotNull(agent);
        assertEquals("707eab51-4836-f488-046a-cda6bf494859", agent.getUuid());
    }

    @Test
    public void testGetBuddies() throws IOException {
        Buddy[] buddies = api.getBuddies();
        assertNotNull(buddies);
        assertTrue(buddies.length > 0);
    }

    @Test
    public void testGetBuddy() throws IOException {
        Buddy buddy = api.getBuddy("201d81f4-4409-03aa-e908-70b8050bbff5");
        assertNotNull(buddy);
        assertEquals("201d81f4-4409-03aa-e908-70b8050bbff5", buddy.getUuid());
    }

    @Test
    public void testGetBuddyLevels() throws IOException {
        Buddy.Level[] buddyLevels = api.getBuddyLevels();
        assertNotNull(buddyLevels);
        assertTrue(buddyLevels.length > 0);
    }

    @Test
    public void testGetBuddyLevel() throws IOException {
        Buddy.Level buddyLevel = api.getBuddyLevel("6f6b58db-4a4d-0acc-1dec-c4ab7b297529");
        assertNotNull(buddyLevel);
        assertEquals("6f6b58db-4a4d-0acc-1dec-c4ab7b297529", buddyLevel.getUuid());
    }

    @Test
    public void testGetBundles() throws IOException {
        Bundle[] bundles = api.getBundles();
        assertNotNull(bundles);
        assertTrue(bundles.length > 0);
    }

    @Test
    public void testGetBundle() throws IOException {
        Bundle bundle = api.getBundle("afa6651a-4b93-b7f8-b136-b6b081fc3258");
        assertNotNull(bundle);
        assertEquals("afa6651a-4b93-b7f8-b136-b6b081fc3258", bundle.getUuid());
    }

    @Test
    public void testGetCeremonies() throws IOException {
        Ceremony[] ceremonies = api.getCeremonies();
        assertNotNull(ceremonies);
        assertTrue(ceremonies.length > 0);
    }

    @Test
    public void testGetCeremony() throws IOException {
        Ceremony ceremony = api.getCeremony("87c91747-4de4-635e-a64b-6ba4faeeae78");
        assertNotNull(ceremony);
        assertEquals("87c91747-4de4-635e-a64b-6ba4faeeae78", ceremony.getUuid());
    }

    @Test
    public void testGetCompetitiveTierTables() throws IOException {
        CompetitiveTierTable[] competitiveTierTables = api.getCompetitiveTierTables();
        assertNotNull(competitiveTierTables);
        assertTrue(competitiveTierTables.length > 0);
    }

    @Test
    public void testGetCompetitiveTierTable() throws IOException {
        CompetitiveTierTable competitiveTierTable = api.getCompetitiveTierTable("edb72a72-7e6d-6010-9591-7c053bbdbf48");
        assertNotNull(competitiveTierTable);
        assertEquals("edb72a72-7e6d-6010-9591-7c053bbdbf48", competitiveTierTable.getUuid());
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
        ContentTier contentTier = api.getContentTier("12683d76-48d7-84a3-4e09-6985794f0445");
        assertNotNull(contentTier);
        assertEquals("12683d76-48d7-84a3-4e09-6985794f0445", contentTier.getUuid());
    }

    @Test
    public void testGetContracts() throws IOException {
        Contract[] contracts = api.getContracts();
        assertNotNull(contracts);
        assertTrue(contracts.length > 0);
    }

    @Test
    public void testGetContract() throws IOException {
        Contract contract = api.getContract("4c9b0fcf-57cd-4e84-ae5a-ce89e396242f");
        assertNotNull(contract);
        assertEquals("4c9b0fcf-57cd-4e84-ae5a-ce89e396242f", contract.getUuid());
    }

    @Test
    public void testGetCurrencies() throws IOException {
        Currency[] currencies = api.getCurrencies();
        assertNotNull(currencies);
        assertTrue(currencies.length > 0);
    }

    @Test
    public void testGetCurrency() throws IOException {
        Currency currency = api.getCurrency("f08d4ae3-939c-4576-ab26-09ce1f23bb37");
        assertNotNull(currency);
        assertEquals("f08d4ae3-939c-4576-ab26-09ce1f23bb37", currency.getUuid());
    }

    @Test
    public void testGetEvents() throws IOException {
        Event[] events = api.getEvents();
        assertNotNull(events);
        assertTrue(events.length > 0);
    }

    @Test
    public void testGetEvent() throws IOException {
        Event event = api.getEvent("024d36a7-46e3-8a29-30c6-09a7fb81bebe");
        assertNotNull(event);
        assertEquals("024d36a7-46e3-8a29-30c6-09a7fb81bebe", event.getUuid());
    }

    @Test
    public void testGetGameModes() throws IOException {
        GameMode[] gameModes = api.getGameModes();
        assertNotNull(gameModes);
        assertTrue(gameModes.length > 0);
    }

    @Test
    public void testGetGameMode() throws IOException {
        GameMode gameMode = api.getGameMode("e921d1e6-416b-c31f-1291-74930c330b7b");
        assertNotNull(gameMode);
        assertEquals("e921d1e6-416b-c31f-1291-74930c330b7b", gameMode.getUuid());
    }

    @Test
    public void testGetQueues() throws IOException {
        Queue[] queues = api.getQueues();
        assertNotNull(queues);
        assertTrue(queues.length > 0);
    }

    @Test
    public void testGetQueue() throws IOException {
        Queue queue = api.getQueue("63d60a3e-4838-695d-9077-e9af5ed523ca");
        assertNotNull(queue);
        assertEquals("63d60a3e-4838-695d-9077-e9af5ed523ca", queue.getUuid());
    }

    @Test
    public void testGetEquippables() throws IOException {
        Equippable[] equippables = api.getEquippables();
        assertNotNull(equippables);
        assertTrue(equippables.length > 0);
    }

    @Test
    public void testGetEquippable() throws IOException {
        Equippable equippable = api.getEquippable("3de32920-4a8f-0499-7740-648a5bf95470");
        assertNotNull(equippable);
        assertEquals("3de32920-4a8f-0499-7740-648a5bf95470", equippable.getUuid());
    }

    @Test
    public void testGetGears() throws IOException {
        Gear[] gears = api.getGear();
        assertNotNull(gears);
        assertTrue(gears.length > 0);
    }

    @Test
    public void testGetGear() throws IOException {
        Gear gear = api.getGear("4dec83d5-4902-9ab3-bed6-a7a390761157");
        assertNotNull(gear);
        assertEquals("4dec83d5-4902-9ab3-bed6-a7a390761157", gear.getUuid());
    }

    @Test
    public void testGetLevelBorders() throws IOException {
        LevelBorder[] levelBorders = api.getLevelBorders();
        assertNotNull(levelBorders);
        assertTrue(levelBorders.length > 0);
    }

    @Test
    public void testGetLevelBorder() throws IOException {
        LevelBorder levelBorder = api.getLevelBorder("49413ac2-4ed5-6953-5791-db838ccb58f3");
        assertNotNull(levelBorder);
        assertEquals("49413ac2-4ed5-6953-5791-db838ccb58f3", levelBorder.getUuid());
    }

    @Test
    public void testGetMaps() throws IOException {
        Map[] maps = api.getMaps();
        assertNotNull(maps);
        assertTrue(maps.length > 0);
    }

    @Test
    public void testGetMap() throws IOException {
        Map map = api.getMap("7eaecc1b-4337-bbf6-6ab9-04b8f06b3319");
        assertNotNull(map);
        assertEquals("7eaecc1b-4337-bbf6-6ab9-04b8f06b3319", map.getUuid());
    }

    @Test
    public void testGetPlayerCards() throws IOException {
        PlayerCard[] playerCards = api.getPlayerCards();
        assertNotNull(playerCards);
        assertTrue(playerCards.length > 0);
    }

    @Test
    public void testGetPlayerCard() throws IOException {
        PlayerCard playerCard = api.getPlayerCard("fe84218f-4338-0f85-62cd-dfa5596576a0");
        assertNotNull(playerCard);
        assertEquals("fe84218f-4338-0f85-62cd-dfa5596576a0", playerCard.getUuid());
    }

    @Test
    public void testGetPlayerTitles() throws IOException {
        PlayerTitle[] playerTitles = api.getPlayerTitles();
        assertNotNull(playerTitles);
        assertTrue(playerTitles.length > 0);
    }

    @Test
    public void testGetPlayerTitle() throws IOException {
        PlayerTitle playerTitle = api.getPlayerTitle("2d284b12-4536-1d0e-b08c-e58850b2a76e");
        assertNotNull(playerTitle);
        assertEquals("2d284b12-4536-1d0e-b08c-e58850b2a76e", playerTitle.getUuid());
    }

    @Test
    public void testGetSeasons() throws IOException {
        Season[] seasons = api.getSeasons();
        assertNotNull(seasons);
        assertTrue(seasons.length > 0);
    }

    @Test
    public void testGetSeason() throws IOException {
        Season season = api.getSeason("0530b9c4-4980-f2ee-df5d-09864cd00542");
        assertNotNull(season);
        assertEquals("0530b9c4-4980-f2ee-df5d-09864cd00542", season.getUuid());
    }

    @Test
    public void testGetCompetitiveSeasons() throws IOException {
        CompetitiveSeason[] competitiveSeasons = api.getCompetitiveSeasons();
        assertNotNull(competitiveSeasons);
        assertTrue(competitiveSeasons.length > 0);
    }

    @Test
    public void testGetCompetitiveSeason() throws IOException {
        CompetitiveSeason competitiveSeason = api.getCompetitiveSeason("6b0f1bc6-4555-2405-9034-c9af64cf1cb1");
        assertNotNull(competitiveSeason);
        assertEquals("6b0f1bc6-4555-2405-9034-c9af64cf1cb1", competitiveSeason.getUuid());
    }

    @Test
    public void testGetSprays() throws IOException {
        Spray[] sprays = api.getSprays();
        assertNotNull(sprays);
        assertTrue(sprays.length > 0);
    }

    @Test
    public void testGetSpray() throws IOException {
        Spray spray = api.getSpray("0eb56d06-474d-fbec-372f-069286388bc5");
        assertNotNull(spray);
        assertEquals("0eb56d06-474d-fbec-372f-069286388bc5", spray.getUuid());
    }

    @Test
    public void testGetSprayLevels() throws IOException {
        Spray.Level[] sprayLevels = api.getSprayLevels();
        assertNotNull(sprayLevels);
        assertTrue(sprayLevels.length > 0);
    }

    @Test
    public void testGetSprayLevel() throws IOException {
        Spray.Level sprayLevel = api.getSprayLevel("0a3d7dcf-4267-564d-5575-f28b682a3834");
        assertNotNull(sprayLevel);
        assertEquals("0a3d7dcf-4267-564d-5575-f28b682a3834", sprayLevel.getUuid());
    }

    @Test
    public void testGetThemes() throws IOException {
        Theme[] themes = api.getThemes();
        assertNotNull(themes);
        assertTrue(themes.length > 0);
    }

    @Test
    public void testGetTheme() throws IOException {
        Theme theme = api.getTheme("d7a96b31-4880-dc84-a022-45bdad450753");
        assertNotNull(theme);
        assertEquals("d7a96b31-4880-dc84-a022-45bdad450753", theme.getUuid());
    }

    @Test
    public void testGetWeapons() throws IOException {
        Weapon[] weapons = api.getWeapons();
        assertNotNull(weapons);
        assertTrue(weapons.length > 0);
    }

    @Test
    public void testGetWeapon() throws IOException {
        Weapon weapon = api.getWeapon("42da8ccc-40d5-affc-beec-15aa47b42eda");
        assertNotNull(weapon);
        assertEquals("42da8ccc-40d5-affc-beec-15aa47b42eda", weapon.getUuid());
    }

    @Test
    public void testGetWeaponSkins() throws IOException {
        WeaponSkin[] weaponSkins = api.getWeaponSkins();
        assertNotNull(weaponSkins);
        assertTrue(weaponSkins.length > 0);
    }

    @Test
    public void testGetWeaponSkin() throws IOException {
        WeaponSkin weaponSkin = api.getWeaponSkin("9c134f41-4c29-1bd8-682e-178e7f349c9b");
        assertNotNull(weaponSkin);
        assertEquals("9c134f41-4c29-1bd8-682e-178e7f349c9b", weaponSkin.getUuid());
    }

    @Test
    public void testGetWeaponSkinChromas() throws IOException {
        WeaponSkin.Chroma[] weaponSkinChromas = api.getWeaponSkinChromas();
        assertNotNull(weaponSkinChromas);
        assertTrue(weaponSkinChromas.length > 0);
    }

    @Test
    public void testGetWeaponSkinChroma() throws IOException {
        WeaponSkin.Chroma weaponSkinChroma = api.getWeaponSkinChroma("8617ebbb-418a-0819-1ca2-b383f8ae757c");
        assertNotNull(weaponSkinChroma);
        assertEquals("8617ebbb-418a-0819-1ca2-b383f8ae757c", weaponSkinChroma.getUuid());
    }

    @Test
    public void testGetWeaponSkinLevels() throws IOException {
        WeaponSkin.Level[] weaponSkinLevels = api.getWeaponSkinLevels();
        assertNotNull(weaponSkinLevels);
        assertTrue(weaponSkinLevels.length > 0);
    }

    @Test
    public void testGetWeaponSkinLevel() throws IOException {
        WeaponSkin.Level weaponSkinLevel = api.getWeaponSkinLevel("c59442a5-4b74-792c-d996-71a5fb340625");
        assertNotNull(weaponSkinLevel);
        assertEquals("c59442a5-4b74-792c-d996-71a5fb340625", weaponSkinLevel.getUuid());
    }

    @Test
    public void testGetVersion() throws IOException {
        Version version = api.getVersion();
        assertNotNull(version);
    }

}