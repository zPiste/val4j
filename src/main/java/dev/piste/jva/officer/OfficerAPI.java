package dev.piste.jva.officer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import dev.piste.jva.http.RestClient;
import dev.piste.jva.http.requests.GetRequest;
import dev.piste.jva.http.requests.RestRequest;
import dev.piste.jva.officer.models.*;

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

    public Agent[] getAgents() throws IOException {
        RestRequest request = new GetRequest("/v1/agents");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Agent[].class);
    }

    public Agent getAgent(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/agents/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Agent.class);
    }

    public Buddy[] getBuddies() throws IOException {
        RestRequest request = new GetRequest("/v1/buddies");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Buddy[].class);
    }

    public Buddy getBuddy(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/buddies/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Buddy.class);
    }

    public Buddy.Level[] getBuddyLevels() throws IOException {
        RestRequest request = new GetRequest("/v1/buddies/levels");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Buddy.Level[].class);
    }

    public Buddy.Level getBuddyLevel(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/buddies/levels/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Buddy.Level.class);
    }

    public Bundle[] getBundles() throws IOException {
        RestRequest request = new GetRequest("/v1/bundles");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Bundle[].class);
    }

    public Bundle getBundle(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/bundles/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Bundle.class);
    }

    public Ceremony[] getCeremonies() throws IOException {
        RestRequest request = new GetRequest("/v1/ceremonies");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Ceremony[].class);
    }

    public Ceremony getCeremony(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/ceremonies/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Ceremony.class);
    }

    public CompetitiveTier[] getCompetitiveTiers() throws IOException {
        RestRequest request = new GetRequest("/v1/competitivetiers");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), CompetitiveTier[].class);
    }

    public CompetitiveTier getCompetitiveTier(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/competitivetiers/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), CompetitiveTier.class);
    }

    public CompetitiveTier getLatestCompetitiveTier() throws IOException {
        for(CompetitiveSeason competitiveSeason : getCompetitiveSeasons()) {
            if(LocalDateTime.now().isAfter(competitiveSeason.getStartDateTime()) && LocalDateTime.now().isBefore(competitiveSeason.getEndDateTime())) {
                return getCompetitiveTier(competitiveSeason.getCompetitiveTierUUID());
            }
        }
        return null;
    }

    public ContentTier[] getContentTiers() throws IOException {
        RestRequest request = new GetRequest("/v1/contenttiers");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), ContentTier[].class);
    }

    public ContentTier getContentTier(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/contenttiers/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), ContentTier.class);
    }

    public Contract[] getContracts() throws IOException {
        RestRequest request = new GetRequest("/v1/contracts");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Contract[].class);
    }

    public Contract getContract(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/contracts/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Contract.class);
    }

    public Currency[] getCurrencies() throws IOException {
        RestRequest request = new GetRequest("/v1/currencies");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Currency[].class);
    }

    public Currency getCurrency(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/currencies/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Currency.class);
    }

    public Event[] getEvents() throws IOException {
        RestRequest request = new GetRequest("/v1/events");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Event[].class);
    }

    public Event getEvent(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/events/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Event.class);
    }

    public GameMode[] getGameModes() throws IOException {
        RestRequest request = new GetRequest("/v1/gamemodes");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), GameMode[].class);
    }

    public GameMode getGameMode(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/gamemodes/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), GameMode.class);
    }

    public Queue[] getQueues() throws IOException {
        RestRequest request = new GetRequest("/v1/gamemodes/queues");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Queue[].class);
    }

    public Queue getQueue(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/gamemodes/queues/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Queue.class);
    }

    public Equippable[] getEquippables() throws IOException {
        RestRequest request = new GetRequest("/v1/gamemodes/equippables");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Equippable[].class);
    }

    public Equippable getEquippable(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/gamemodes/equippables/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Equippable.class);
    }

    public Gear[] getGear() throws IOException {
        RestRequest request = new GetRequest("/v1/gear");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Gear[].class);
    }

    public Gear getGear(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/gear/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Gear.class);
    }

    public LevelBorder[] getLevelBorders() throws IOException {
        RestRequest request = new GetRequest("/v1/levelborders");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), LevelBorder[].class);
    }

    public LevelBorder getLevelBorder(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/levelborders/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), LevelBorder.class);
    }

    public Map[] getMaps() throws IOException {
        RestRequest request = new GetRequest("/v1/maps");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Map[].class);
    }

    public Map getMap(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/maps/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Map.class);
    }

    public PlayerCard[] getPlayerCards() throws IOException {
        RestRequest request = new GetRequest("/v1/playercards");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), PlayerCard[].class);
    }

    public PlayerCard getPlayerCard(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/playercards/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), PlayerCard.class);
    }

    public PlayerTitle[] getPlayerTitles() throws IOException {
        RestRequest request = new GetRequest("/v1/playertitles");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), PlayerTitle[].class);
    }

    public PlayerTitle getPlayerTitle(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/playertitles/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), PlayerTitle.class);
    }

    public Season[] getSeasons() throws IOException {
        RestRequest request = new GetRequest("/v1/seasons");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Season[].class);
    }

    public Season getSeason(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/seasons/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Season.class);
    }

    public CompetitiveSeason[] getCompetitiveSeasons() throws IOException {
        RestRequest request = new GetRequest("/v1/seasons/competitive");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), CompetitiveSeason[].class);
    }

    public CompetitiveSeason getCompetitiveSeason(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/seasons/competitive/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), CompetitiveSeason.class);
    }

    public Spray[] getSprays() throws IOException {
        RestRequest request = new GetRequest("/v1/sprays");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Spray[].class);
    }

    public Spray getSpray(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/sprays/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Spray.class);
    }

    public Spray.Level[] getSprayLevels() throws IOException {
        RestRequest request = new GetRequest("/v1/sprays/levels");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Spray.Level[].class);
    }

    public Spray.Level getSprayLevel(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/sprays/levels/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Spray.Level.class);
    }

    public Theme[] getThemes() throws IOException {
        RestRequest request = new GetRequest("/v1/themes");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Theme[].class);
    }

    public Theme getTheme(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/themes/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Theme.class);
    }

    public Weapon[] getWeapons() throws IOException {
        RestRequest request = new GetRequest("/v1/weapons");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), Weapon[].class);
    }

    public Weapon getWeapon(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/weapons/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Weapon.class);
    }

    public WeaponSkin[] getWeaponSkins() throws IOException {
        RestRequest request = new GetRequest("/v1/weapons/skins");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), WeaponSkin[].class);
    }

    public WeaponSkin getWeaponSkin(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/weapons/skins/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), WeaponSkin.class);
    }

    public WeaponSkin.Chroma[] getWeaponSkinChromas() throws IOException {
        RestRequest request = new GetRequest("/v1/weapons/skinchromas");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), WeaponSkin.Chroma[].class);
    }

    public WeaponSkin.Chroma getWeaponSkinChroma(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/weapons/skinchromas/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), WeaponSkin.Chroma.class);
    }

    public WeaponSkin.Level[] getWeaponSkinLevels() throws IOException {
        RestRequest request = new GetRequest("/v1/weapons/skinlevels");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonArray("data"), WeaponSkin.Level[].class);
    }

    public WeaponSkin.Level getWeaponSkinLevel(String uuid) throws IOException {
        RestRequest request = new GetRequest(String.format("/v1/weapons/skinlevels/%s", uuid));
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), WeaponSkin.Level.class);
    }

    public Version getVersion() throws IOException {
        RestRequest request = new GetRequest("/v1/version");
        return gson.fromJson(restClient.sendRequest(request).getAsJsonObject("data"), Version.class);
    }

}