package dev.piste.api.val4j.apis.officer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import dev.piste.api.val4j.apis.officer.models.*;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequestBuilder;
import dev.piste.api.val4j.util.JVALanguage;

import java.io.IOException;
import java.time.LocalDateTime;

/**
 * @author Piste | https://github.com/PisteDev
 */
public class OfficerAPI {

    private final RestClient restClient;
    private final Gson gson;

    public OfficerAPI() {
        String BASE_URL = "https://valorant-api.com";
        restClient = new RestClient(BASE_URL);
        gson = new GsonBuilder().setPrettyPrinting().create();
    }


    public Agent[] getPlayableAgents() throws IOException {
        return getPlayableAgents(null);
    }

    public Agent[] getPlayableAgents(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("agents").addParameter("isPlayableCharacter", "true"), language, Agent[].class);
    }

    public Agent[] getAgents() throws IOException {
        return getAgents(null);
    }

    public Agent[] getAgents(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("agents"), language, Agent[].class);
    }

    public Agent getAgent(String uuid) throws IOException {
        return getAgent(uuid, null);
    }

    public Agent getAgent(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("agents").addPath(uuid), language, Agent.class);
    }


    public Buddy[] getBuddies() throws IOException {
        return getBuddies(null);
    }

    public Buddy[] getBuddies(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("buddies"), language, Buddy[].class);
    }

    public Buddy getBuddy(String uuid) throws IOException {
        return getBuddy(uuid, null);
    }

    public Buddy getBuddy(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("buddies").addPath(uuid), language, Buddy.class);
    }


    public Buddy.Level[] getBuddyLevels() throws IOException {
        return getBuddyLevels(null);
    }

    public Buddy.Level[] getBuddyLevels(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("buddies").addPath("levels"), language, Buddy.Level[].class);
    }

    public Buddy.Level getBuddyLevel(String uuid) throws IOException {
        return getBuddyLevel(uuid, null);
    }

    public Buddy.Level getBuddyLevel(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("buddies").addPath("levels").addPath(uuid), language, Buddy.Level.class);
    }


    public Bundle[] getBundles() throws IOException {
        return getBundles(null);
    }

    public Bundle[] getBundles(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("bundles"), language, Bundle[].class);
    }

    public Bundle getBundle(String uuid) throws IOException {
        return getBundle(uuid, null);
    }

    public Bundle getBundle(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("bundles").addPath(uuid), language, Bundle.class);
    }


    public Ceremony[] getCeremonies() throws IOException {
        return getCeremonies(null);
    }

    public Ceremony[] getCeremonies(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("ceremonies"), language, Ceremony[].class);
    }

    public Ceremony getCeremony(String uuid) throws IOException {
        return getCeremony(uuid, null);
    }

    public Ceremony getCeremony(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("ceremonies").addPath(uuid), language, Ceremony.class);
    }


    public CompetitiveTierTable[] getCompetitiveTierTables() throws IOException {
        return getCompetitiveTierTables(null);
    }

    public CompetitiveTierTable[] getCompetitiveTierTables(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("competitivetiers"), language, CompetitiveTierTable[].class);
    }

    public CompetitiveTierTable getCompetitiveTierTable(String uuid) throws IOException {
        return getCompetitiveTierTable(uuid, null);
    }

    public CompetitiveTierTable getCompetitiveTierTable(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("competitivetiers").addPath(uuid), language, CompetitiveTierTable.class);
    }

    public CompetitiveTierTable getCurrentCompetitiveTierTable() throws IOException {
        return getCurrentCompetitiveTierTable(null);
    }

    public CompetitiveTierTable getCurrentCompetitiveTierTable(JVALanguage language) throws IOException {
        for(CompetitiveSeason competitiveSeason : getCompetitiveSeasons()) {
            if(LocalDateTime.now().isAfter(competitiveSeason.getStartDateTime()) && LocalDateTime.now().isBefore(competitiveSeason.getEndDateTime())) {
                return getCompetitiveTierTable(competitiveSeason.getCompetitiveTierUUID(), language);
            }
        }
        return null;
    }


    public ContentTier[] getContentTiers() throws IOException {
        return getContentTiers(null);
    }

    public ContentTier[] getContentTiers(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("contenttiers"), language, ContentTier[].class);
    }

    public ContentTier getContentTier(String uuid) throws IOException {
        return getContentTier(uuid, null);
    }

    public ContentTier getContentTier(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("contenttiers").addPath(uuid), language, ContentTier.class);
    }


    public Contract[] getContracts() throws IOException {
        return getContracts(null);
    }

    public Contract[] getContracts(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("contracts"), language, Contract[].class);
    }

    public Contract getContract(String uuid) throws IOException {
        return getContract(uuid, null);
    }

    public Contract getContract(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("contracts").addPath(uuid), language, Contract.class);
    }


    public Currency[] getCurrencies() throws IOException {
        return getCurrencies(null);
    }

    public Currency[] getCurrencies(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("currencies"), language, Currency[].class);
    }

    public Currency getCurrency(String uuid) throws IOException {
        return getCurrency(uuid, null);
    }

    public Currency getCurrency(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("currencies").addPath(uuid), language, Currency.class);
    }


    public Event[] getEvents() throws IOException {
        return getEvents(null);
    }

    public Event[] getEvents(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("events"), language, Event[].class);
    }

    public Event getEvent(String uuid) throws IOException {
        return getEvent(uuid, null);
    }

    public Event getEvent(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("events").addPath(uuid), language, Event.class);
    }


    public GameMode[] getGameModes() throws IOException {
        return getGameModes(null);
    }

    public GameMode[] getGameModes(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes"), language, GameMode[].class);
    }

    public GameMode getGameMode(String uuid) throws IOException {
        return getGameMode(uuid, null);
    }

    public GameMode getGameMode(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes").addPath(uuid), language, GameMode.class);
    }


    public Queue[] getQueues() throws IOException {
        return getQueues(null);
    }

    public Queue[] getQueues(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes").addPath("queues"), language, Queue[].class);
    }

    public Queue getQueue(String uuid) throws IOException {
        return getQueue(uuid, null);
    }

    public Queue getQueue(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes").addPath("queues").addPath(uuid), language, Queue.class);
    }


    public Equippable[] getEquippables() throws IOException {
        return getEquippables(null);
    }

    public Equippable[] getEquippables(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes").addPath("equippables"), language, Equippable[].class);
    }

    public Equippable getEquippable(String uuid) throws IOException {
        return getEquippable(uuid, null);
    }

    public Equippable getEquippable(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gamemodes").addPath("equippables").addPath(uuid), language, Equippable.class);
    }


    public Gear[] getGear() throws IOException {
        return getGear((JVALanguage) null);
    }

    public Gear[] getGear(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gear"), language, Gear[].class);
    }

    public Gear getGear(String uuid) throws IOException {
        return getGear(uuid, null);
    }

    public Gear getGear(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("gear").addPath(uuid), language, Gear.class);
    }


    public LevelBorder[] getLevelBorders() throws IOException {
        return getLevelBorders(null);
    }

    public LevelBorder[] getLevelBorders(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("levelborders"), language, LevelBorder[].class);
    }

    public LevelBorder getLevelBorder(String uuid) throws IOException {
        return getLevelBorder(uuid, null);
    }

    public LevelBorder getLevelBorder(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("levelborders").addPath(uuid), language, LevelBorder.class);
    }


    public Map[] getMaps() throws IOException {
        return getMaps(null);
    }

    public Map[] getMaps(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("maps"), language, Map[].class);
    }

    public Map getMap(String uuid) throws IOException {
        return getMap(uuid, null);
    }

    public Map getMap(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("maps").addPath(uuid), language, Map.class);
    }


    public PlayerCard[] getPlayerCards() throws IOException {
        return getPlayerCards(null);
    }

    public PlayerCard[] getPlayerCards(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("playercards"), language, PlayerCard[].class);
    }

    public PlayerCard getPlayerCard(String uuid) throws IOException {
        return getPlayerCard(uuid, null);
    }

    public PlayerCard getPlayerCard(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("playercards").addPath(uuid), language, PlayerCard.class);
    }


    public PlayerTitle[] getPlayerTitles() throws IOException {
        return getPlayerTitles(null);
    }

    public PlayerTitle[] getPlayerTitles(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("playertitles"), language, PlayerTitle[].class);
    }

    public PlayerTitle getPlayerTitle(String uuid) throws IOException {
        return getPlayerTitle(uuid, null);
    }

    public PlayerTitle getPlayerTitle(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("playertitles").addPath(uuid), language, PlayerTitle.class);
    }


    public Season[] getSeasons() throws IOException {
        return getSeasons(null);
    }

    public Season[] getSeasons(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("seasons"), language, Season[].class);
    }

    public Season getSeason(String uuid) throws IOException {
        return getSeason(uuid, null);
    }

    public Season getSeason(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("seasons").addPath(uuid), language, Season.class);
    }


    public CompetitiveSeason[] getCompetitiveSeasons() throws IOException {
        return getCompetitiveSeasons(null);
    }

    public CompetitiveSeason[] getCompetitiveSeasons(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("seasons").addPath("competitive"), language, CompetitiveSeason[].class);
    }

    public CompetitiveSeason getCompetitiveSeason(String uuid) throws IOException {
        return getCompetitiveSeason(uuid, null);
    }

    public CompetitiveSeason getCompetitiveSeason(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("seasons").addPath("competitive").addPath(uuid), language, CompetitiveSeason.class);
    }


    public Spray[] getSprays() throws IOException {
        return getSprays(null);
    }

    public Spray[] getSprays(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("sprays"), language, Spray[].class);
    }

    public Spray getSpray(String uuid) throws IOException {
        return getSpray(uuid, null);
    }

    public Spray getSpray(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("sprays").addPath(uuid), language, Spray.class);
    }


    public Spray.Level[] getSprayLevels() throws IOException {
        return getSprayLevels(null);
    }

    public Spray.Level[] getSprayLevels(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("sprays").addPath("levels"), language, Spray.Level[].class);
    }

    public Spray.Level getSprayLevel(String uuid) throws IOException {
        return getSprayLevel(uuid, null);
    }

    public Spray.Level getSprayLevel(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("sprays").addPath("levels").addPath(uuid), language, Spray.Level.class);
    }


    public Theme[] getThemes() throws IOException {
        return getThemes(null);
    }

    public Theme[] getThemes(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("themes"), language, Theme[].class);
    }

    public Theme getTheme(String uuid) throws IOException {
        return getTheme(uuid, null);
    }

    public Theme getTheme(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("themes").addPath(uuid), language, Theme.class);
    }


    public Weapon[] getWeapons() throws IOException {
        return getWeapons(null);
    }

    public Weapon[] getWeapons(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons"), language, Weapon[].class);
    }

    public Weapon getWeapon(String uuid) throws IOException {
        return getWeapon(uuid, null);
    }

    public Weapon getWeapon(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath(uuid), language, Weapon.class);
    }


    public WeaponSkin[] getWeaponSkins() throws IOException {
        return getWeaponSkins(null);
    }

    public WeaponSkin[] getWeaponSkins(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skins"), language, WeaponSkin[].class);
    }

    public WeaponSkin getWeaponSkin(String uuid) throws IOException {
        return getWeaponSkin(uuid, null);
    }

    public WeaponSkin getWeaponSkin(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skins").addPath(uuid), language, WeaponSkin.class);
    }


    public WeaponSkin.Chroma[] getWeaponSkinChromas() throws IOException {
        return getWeaponSkinChromas(null);
    }

    public WeaponSkin.Chroma[] getWeaponSkinChromas(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skinchromas"), language, WeaponSkin.Chroma[].class);
    }

    public WeaponSkin.Chroma getWeaponSkinChroma(String uuid) throws IOException {
        return getWeaponSkinChroma(uuid, null);
    }

    public WeaponSkin.Chroma getWeaponSkinChroma(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skinchromas").addPath(uuid), language, WeaponSkin.Chroma.class);
    }


    public WeaponSkin.Level[] getWeaponSkinLevels() throws IOException {
        return getWeaponSkinLevels(null);
    }

    public WeaponSkin.Level[] getWeaponSkinLevels(JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skinlevels"), language, WeaponSkin.Level[].class);
    }

    public WeaponSkin.Level getWeaponSkinLevel(String uuid) throws IOException {
        return getWeaponSkinLevel(uuid, null);
    }

    public WeaponSkin.Level getWeaponSkinLevel(String uuid, JVALanguage language) throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("weapons").addPath("skinlevels").addPath(uuid), language, WeaponSkin.Level.class);
    }

    public Version getVersion() throws IOException {
        return getElement(new GetRequestBuilder().addPath("v1").addPath("version"), null, Version.class);
    }

    private <T> T getElement(RestRequestBuilder requestBuilder, JVALanguage language, Class<T> clazz) throws IOException {
        if(language != null)
            requestBuilder.addParameter("language", language.getLocale());
        JsonElement element = restClient.sendRequest(requestBuilder.build()).get("data");
        if(element.isJsonArray()) {
            return gson.fromJson(element.getAsJsonArray(), clazz);
        } else {
            return gson.fromJson(element.getAsJsonObject(), clazz);
        }
    }

}