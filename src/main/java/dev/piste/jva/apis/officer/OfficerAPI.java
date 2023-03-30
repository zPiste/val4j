package dev.piste.jva.apis.officer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import dev.piste.jva.apis.officer.models.*;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.requests.GetRequest;
import dev.piste.jva.http.requests.RestRequest;
import dev.piste.jva.util.Language;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author Piste | https://github.com/PisteDev
 */
@SuppressWarnings("unused")
public class OfficerAPI {

    private final RestClient restClient;
    private final Gson gson;

    public OfficerAPI() {
        String BASE_URL = "https://valorant-api.com";
        restClient = new RestClient(BASE_URL);
        gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public Agent[] getPlayableAgents() throws IOException {
        return getElement(Endpoint.PLAYABLE_AGENT_V1, null, Agent[].class);
    }

    public Agent[] getPlayableAgents(Language language) throws IOException {
        return getElement(Endpoint.PLAYABLE_AGENT_V1, language, Agent[].class);
    }

    public Agent[] getAgents() throws IOException {
        return getElement(Endpoint.AGENT_V1, null, Agent[].class);
    }

    public Agent[] getAgents(Language language) throws IOException {
        return getElement(Endpoint.AGENT_V1, language, Agent[].class);
    }

    public Agent getAgent(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.AGENT_V1, uuid, null, Agent.class);
    }

    public Agent getAgent(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.AGENT_V1, uuid, language, Agent.class);
    }


    public Buddy[] getBuddies() throws IOException {
        return getElement(Endpoint.BUDDY_V1, null, Buddy[].class);
    }

    public Buddy[] getBuddies(Language language) throws IOException {
        return getElement(Endpoint.BUDDY_V1, language, Buddy[].class);
    }

    public Buddy getBuddy(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.BUDDY_V1, uuid, null, Buddy.class);
    }

    public Buddy getBuddy(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.BUDDY_V1, uuid, language, Buddy.class);
    }


    public Buddy.Level[] getBuddyLevels() throws IOException {
        return getElement(Endpoint.BUDDY_LEVEL_V1, null, Buddy.Level[].class);
    }

    public Buddy.Level[] getBuddyLevels(Language language) throws IOException {
        return getElement(Endpoint.BUDDY_LEVEL_V1, language, Buddy.Level[].class);
    }

    public Buddy.Level getBuddyLevel(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.BUDDY_LEVEL_V1, uuid, null, Buddy.Level.class);
    }

    public Buddy.Level getBuddyLevel(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.BUDDY_LEVEL_V1, uuid, language, Buddy.Level.class);
    }


    public Bundle[] getBundles() throws IOException {
        return getElement(Endpoint.BUNDLE_V1, null, Bundle[].class);
    }

    public Bundle[] getBundles(Language language) throws IOException {
        return getElement(Endpoint.BUNDLE_V1, language, Bundle[].class);
    }

    public Bundle getBundle(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.BUNDLE_V1, uuid, null, Bundle.class);
    }

    public Bundle getBundle(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.BUNDLE_V1, uuid, language, Bundle.class);
    }


    public Ceremony[] getCeremonies() throws IOException {
        return getElement(Endpoint.CEREMONY_V1, null, Ceremony[].class);
    }

    public Ceremony[] getCeremonies(Language language) throws IOException {
        return getElement(Endpoint.CEREMONY_V1, language, Ceremony[].class);
    }

    public Ceremony getCeremony(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.CEREMONY_V1, uuid, null, Ceremony.class);
    }

    public Ceremony getCeremony(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.CEREMONY_V1, uuid, language, Ceremony.class);
    }


    public CompetitiveTierTable[] getCompetitiveTierTables() throws IOException {
        return getElement(Endpoint.COMPETITIVE_TIER_TABLE_V1, null, CompetitiveTierTable[].class);
    }

    public CompetitiveTierTable[] getCompetitiveTierTables(Language language) throws IOException {
        return getElement(Endpoint.COMPETITIVE_TIER_TABLE_V1, language, CompetitiveTierTable[].class);
    }

    public CompetitiveTierTable getCompetitiveTierTable(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.COMPETITIVE_TIER_TABLE_V1, uuid, null, CompetitiveTierTable.class);
    }

    public CompetitiveTierTable getCompetitiveTierTable(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.COMPETITIVE_TIER_TABLE_V1, uuid, language, CompetitiveTierTable.class);
    }

    public CompetitiveTierTable getCurrentCompetitiveTierTable() throws IOException {
        for(CompetitiveSeason competitiveSeason : getCompetitiveSeasons()) {
            if(LocalDateTime.now().isAfter(competitiveSeason.getStartDateTime()) && LocalDateTime.now().isBefore(competitiveSeason.getEndDateTime())) {
                return getCompetitiveTierTable(competitiveSeason.getCompetitiveTierUUID());
            }
        }
        return null;
    }

    public CompetitiveTierTable getCurrentCompetitiveTierTable(Language language) throws IOException {
        for(CompetitiveSeason competitiveSeason : getCompetitiveSeasons()) {
            if(LocalDateTime.now().isAfter(competitiveSeason.getStartDateTime()) && LocalDateTime.now().isBefore(competitiveSeason.getEndDateTime())) {
                return getCompetitiveTierTable(competitiveSeason.getCompetitiveTierUUID(), language);
            }
        }
        return null;
    }


    public ContentTier[] getContentTiers() throws IOException {
        return getElement(Endpoint.CONTENT_TIER_V1, null, ContentTier[].class);
    }

    public ContentTier[] getContentTiers(Language language) throws IOException {
        return getElement(Endpoint.CONTENT_TIER_V1, language, ContentTier[].class);
    }

    public ContentTier getContentTier(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.CONTENT_TIER_V1, uuid, null, ContentTier.class);
    }

    public ContentTier getContentTier(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.CONTENT_TIER_V1, uuid, language, ContentTier.class);
    }


    public Contract[] getContracts() throws IOException {
        return getElement(Endpoint.CONTRACT_V1, null, Contract[].class);
    }

    public Contract[] getContracts(Language language) throws IOException {
        return getElement(Endpoint.CONTRACT_V1, language, Contract[].class);
    }

    public Contract getContract(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.CONTRACT_V1, uuid, null, Contract.class);
    }

    public Contract getContract(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.CONTRACT_V1, uuid, language, Contract.class);
    }


    public Currency[] getCurrencies() throws IOException {
        return getElement(Endpoint.CURRENCY_V1, null, Currency[].class);
    }

    public Currency[] getCurrencies(Language language) throws IOException {
        return getElement(Endpoint.CURRENCY_V1, language, Currency[].class);
    }

    public Currency getCurrency(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.CURRENCY_V1, uuid, null, Currency.class);
    }

    public Currency getCurrency(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.CURRENCY_V1, uuid, language, Currency.class);
    }


    public Event[] getEvents() throws IOException {
        return getElement(Endpoint.EVENT_V1, null, Event[].class);
    }

    public Event[] getEvents(Language language) throws IOException {
        return getElement(Endpoint.EVENT_V1, language, Event[].class);
    }

    public Event getEvent(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.EVENT_V1, uuid, null, Event.class);
    }

    public Event getEvent(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.EVENT_V1, uuid, language, Event.class);
    }


    public GameMode[] getGameModes() throws IOException {
        return getElement(Endpoint.GAMEMODE_V1, null, GameMode[].class);
    }

    public GameMode[] getGameModes(Language language) throws IOException {
        return getElement(Endpoint.GAMEMODE_V1, language, GameMode[].class);
    }

    public GameMode getGameMode(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_V1, uuid, null, GameMode.class);
    }

    public GameMode getGameMode(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_V1, uuid, language, GameMode.class);
    }


    public Queue[] getQueues() throws IOException {
        return getElement(Endpoint.GAMEMODE_QUEUE_V1, null, Queue[].class);
    }

    public Queue[] getQueues(Language language) throws IOException {
        return getElement(Endpoint.GAMEMODE_QUEUE_V1, language, Queue[].class);
    }

    public Queue getQueue(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_QUEUE_V1, uuid, null, Queue.class);
    }

    public Queue getQueue(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_QUEUE_V1, uuid, language, Queue.class);
    }


    public Equippable[] getEquippables() throws IOException {
        return getElement(Endpoint.GAMEMODE_EQUIPPABLE_V1, null, Equippable[].class);
    }

    public Equippable[] getEquippables(Language language) throws IOException {
        return getElement(Endpoint.GAMEMODE_EQUIPPABLE_V1, language, Equippable[].class);
    }

    public Equippable getEquippable(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_EQUIPPABLE_V1, uuid, null, Equippable.class);
    }

    public Equippable getEquippable(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.GAMEMODE_EQUIPPABLE_V1, uuid, language, Equippable.class);
    }


    public Gear[] getGear() throws IOException {
        return getElement(Endpoint.GEAR_V1, null, Gear[].class);
    }

    public Gear[] getGear(Language language) throws IOException {
        return getElement(Endpoint.GEAR_V1, language, Gear[].class);
    }

    public Gear getGear(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.GEAR_V1, uuid, null, Gear.class);
    }

    public Gear getGear(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.GEAR_V1, uuid, language, Gear.class);
    }


    public LevelBorder[] getLevelBorders() throws IOException {
        return getElement(Endpoint.LEVEL_BORDER_V1, null, LevelBorder[].class);
    }

    public LevelBorder[] getLevelBorders(Language language) throws IOException {
        return getElement(Endpoint.LEVEL_BORDER_V1, language, LevelBorder[].class);
    }

    public LevelBorder getLevelBorder(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.LEVEL_BORDER_V1, uuid, null, LevelBorder.class);
    }

    public LevelBorder getLevelBorder(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.LEVEL_BORDER_V1, uuid, language, LevelBorder.class);
    }


    public Map[] getMaps() throws IOException {
        return getElement(Endpoint.MAP_V1, null, Map[].class);
    }

    public Map[] getMaps(Language language) throws IOException {
        return getElement(Endpoint.MAP_V1, language, Map[].class);
    }

    public Map getMap(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.MAP_V1, uuid, null, Map.class);
    }

    public Map getMap(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.MAP_V1, uuid, language, Map.class);
    }


    public PlayerCard[] getPlayerCards() throws IOException {
        return getElement(Endpoint.PLAYER_CARD_V1, null, PlayerCard[].class);
    }

    public PlayerCard[] getPlayerCards(Language language) throws IOException {
        return getElement(Endpoint.PLAYER_CARD_V1, language, PlayerCard[].class);
    }

    public PlayerCard getPlayerCard(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.PLAYER_CARD_V1, uuid, null, PlayerCard.class);
    }

    public PlayerCard getPlayerCard(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.PLAYER_CARD_V1, uuid, language, PlayerCard.class);
    }


    public PlayerTitle[] getPlayerTitles() throws IOException {
        return getElement(Endpoint.PLAYER_TITLE_V1, null, PlayerTitle[].class);
    }

    public PlayerTitle[] getPlayerTitles(Language language) throws IOException {
        return getElement(Endpoint.PLAYER_TITLE_V1, language, PlayerTitle[].class);
    }

    public PlayerTitle getPlayerTitle(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.PLAYER_TITLE_V1, uuid, null, PlayerTitle.class);
    }

    public PlayerTitle getPlayerTitle(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.PLAYER_TITLE_V1, uuid, language, PlayerTitle.class);
    }


    public Season[] getSeasons() throws IOException {
        return getElement(Endpoint.SEASON_V1, null, Season[].class);
    }

    public Season[] getSeasons(Language language) throws IOException {
        return getElement(Endpoint.SEASON_V1, language, Season[].class);
    }

    public Season getSeason(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.SEASON_V1, uuid, null, Season.class);
    }

    public Season getSeason(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.SEASON_V1, uuid, language, Season.class);
    }


    public CompetitiveSeason[] getCompetitiveSeasons() throws IOException {
        return getElement(Endpoint.SEASON_COMPETITIVE_V1, null, CompetitiveSeason[].class);
    }

    public CompetitiveSeason[] getCompetitiveSeasons(Language language) throws IOException {
        return getElement(Endpoint.SEASON_COMPETITIVE_V1, language, CompetitiveSeason[].class);
    }

    public CompetitiveSeason getCompetitiveSeason(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.SEASON_COMPETITIVE_V1, uuid, null, CompetitiveSeason.class);
    }

    public CompetitiveSeason getCompetitiveSeason(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.SEASON_COMPETITIVE_V1, uuid, language, CompetitiveSeason.class);
    }


    public Spray[] getSprays() throws IOException {
        return getElement(Endpoint.SPRAY_V1, null, Spray[].class);
    }

    public Spray[] getSprays(Language language) throws IOException {
        return getElement(Endpoint.SPRAY_V1, language, Spray[].class);
    }

    public Spray getSpray(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.SPRAY_V1, uuid, null, Spray.class);
    }

    public Spray getSpray(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.SPRAY_V1, uuid, language, Spray.class);
    }


    public Spray.Level[] getSprayLevels() throws IOException {
        return getElement(Endpoint.SPRAY_LEVEL_V1, null, Spray.Level[].class);
    }

    public Spray.Level[] getSprayLevels(Language language) throws IOException {
        return getElement(Endpoint.SPRAY_LEVEL_V1, language, Spray.Level[].class);
    }

    public Spray.Level getSprayLevel(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.SPRAY_LEVEL_V1, uuid, null, Spray.Level.class);
    }

    public Spray.Level getSprayLevel(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.SPRAY_LEVEL_V1, uuid, language, Spray.Level.class);
    }


    public Theme[] getThemes() throws IOException {
        return getElement(Endpoint.THEME_V1, null, Theme[].class);
    }

    public Theme[] getThemes(Language language) throws IOException {
        return getElement(Endpoint.THEME_V1, language, Theme[].class);
    }

    public Theme getTheme(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.THEME_V1, uuid, null, Theme.class);
    }

    public Theme getTheme(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.THEME_V1, uuid, language, Theme.class);
    }


    public Weapon[] getWeapons() throws IOException {
        return getElement(Endpoint.WEAPON_V1, null, Weapon[].class);
    }

    public Weapon[] getWeapons(Language language) throws IOException {
        return getElement(Endpoint.WEAPON_V1, language, Weapon[].class);
    }

    public Weapon getWeapon(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_V1, uuid, null, Weapon.class);
    }

    public Weapon getWeapon(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_V1, uuid, language, Weapon.class);
    }


    public WeaponSkin[] getWeaponSkins() throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_V1, null, WeaponSkin[].class);
    }

    public WeaponSkin[] getWeaponSkins(Language language) throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_V1, language, WeaponSkin[].class);
    }

    public WeaponSkin getWeaponSkin(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_V1, uuid, null, WeaponSkin.class);
    }

    public WeaponSkin getWeaponSkin(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_V1, uuid, language, WeaponSkin.class);
    }


    public WeaponSkin.Chroma[] getWeaponSkinChromas() throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_CHROMA_V1, null, WeaponSkin.Chroma[].class);
    }

    public WeaponSkin.Chroma[] getWeaponSkinChromas(Language language) throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_CHROMA_V1, language, WeaponSkin.Chroma[].class);
    }

    public WeaponSkin.Chroma getWeaponSkinChroma(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_CHROMA_V1, uuid, null, WeaponSkin.Chroma.class);
    }

    public WeaponSkin.Chroma getWeaponSkinChroma(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_CHROMA_V1, uuid, language, WeaponSkin.Chroma.class);
    }


    public WeaponSkin.Level[] getWeaponSkinLevels() throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_LEVEL_V1, null, WeaponSkin.Level[].class);
    }

    public WeaponSkin.Level[] getWeaponSkinLevels(Language language) throws IOException {
        return getElement(Endpoint.WEAPON_SKIN_LEVEL_V1, language, WeaponSkin.Level[].class);
    }

    public WeaponSkin.Level getWeaponSkinLevel(String uuid) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_LEVEL_V1, uuid, null, WeaponSkin.Level.class);
    }

    public WeaponSkin.Level getWeaponSkinLevel(String uuid, Language language) throws IOException {
        return getObjectByUUID(Endpoint.WEAPON_SKIN_LEVEL_V1, uuid, language, WeaponSkin.Level.class);
    }

    public Version getVersion() throws IOException {
        return getElement(Endpoint.VERSION_V1, null, Version.class);
    }

    private <T> T getElement(Endpoint endpoint, Language language, Class<T> clazz) throws IOException {
        RestRequest request = endpoint.getDefaultRequest();
        if(language != null)
            request.addParameter("language", language.getLocale());
        JsonElement element = restClient.sendRequest(request).get("data");
        if(element.isJsonArray())
            return gson.fromJson(element.getAsJsonArray(), clazz);
        else
            return gson.fromJson(element.getAsJsonObject(), clazz);
    }

    private <T> T getObjectByUUID(Endpoint endpoint, String uuid, Language language, Class<T> clazz) throws IOException {
        RestRequest request = endpoint.getDefaultRequest().addPath(uuid);
        if(language != null)
            request.addParameter("language", language.getLocale());
        JsonElement dataElement = restClient.sendRequest(request).get("data");
        return gson.fromJson(dataElement.getAsJsonObject(), clazz);
    }

    private enum Endpoint {

        AGENT_V1(new GetRequest().addPath("v1").addPath("agents")),
        PLAYABLE_AGENT_V1(new GetRequest().addPath("v1").addPath("agents").addParameter("isPlayableCharacter", "true")),
        BUDDY_V1(new GetRequest().addPath("v1").addPath("buddies")),
        BUDDY_LEVEL_V1(new GetRequest().addPath("v1").addPath("buddies").addPath("levels")),
        BUNDLE_V1(new GetRequest().addPath("v1").addPath("bundles")),
        CEREMONY_V1(new GetRequest().addPath("v1").addPath("ceremonies")),
        COMPETITIVE_TIER_TABLE_V1(new GetRequest().addPath("v1").addPath("competitivetiers")),
        CONTENT_TIER_V1(new GetRequest().addPath("v1").addPath("contenttiers")),
        CONTRACT_V1(new GetRequest().addPath("v1").addPath("contracts")),
        CURRENCY_V1(new GetRequest().addPath("v1").addPath("currencies")),
        EVENT_V1(new GetRequest().addPath("v1").addPath("events")),
        GAMEMODE_V1(new GetRequest().addPath("v1").addPath("gamemodes")),
        GAMEMODE_EQUIPPABLE_V1(new GetRequest().addPath("v1").addPath("gamemodes").addPath("equippables")),
        GAMEMODE_QUEUE_V1(new GetRequest().addPath("v1").addPath("gamemodes").addPath("queues")),
        GEAR_V1(new GetRequest().addPath("v1").addPath("gear")),
        LEVEL_BORDER_V1(new GetRequest().addPath("v1").addPath("levelborders")),
        MAP_V1(new GetRequest().addPath("v1").addPath("maps")),
        PLAYER_CARD_V1(new GetRequest().addPath("v1").addPath("playercards")),
        PLAYER_TITLE_V1(new GetRequest().addPath("v1").addPath("playertitles")),
        SEASON_V1(new GetRequest().addPath("v1").addPath("seasons")),
        SEASON_COMPETITIVE_V1(new GetRequest().addPath("v1").addPath("seasons").addPath("competitive")),
        SPRAY_V1(new GetRequest().addPath("v1").addPath("sprays")),
        SPRAY_LEVEL_V1(new GetRequest().addPath("v1").addPath("sprays").addPath("levels")),
        THEME_V1(new GetRequest().addPath("v1").addPath("themes")),
        WEAPON_V1(new GetRequest().addPath("v1").addPath("weapons")),
        WEAPON_SKIN_V1(new GetRequest().addPath("v1").addPath("weapons").addPath("skins")),
        WEAPON_SKIN_CHROMA_V1(new GetRequest().addPath("v1").addPath("weapons").addPath("skinchromas")),
        WEAPON_SKIN_LEVEL_V1(new GetRequest().addPath("v1").addPath("weapons").addPath("skinlevels")),
        VERSION_V1(new GetRequest().addPath("v1").addPath("version"));


        private final RestRequest defaultRequest;

        Endpoint(RestRequest defaultRequest) {
            this.defaultRequest = defaultRequest;
        }

        public RestRequest getDefaultRequest() {
            return defaultRequest;
        }

    }

}