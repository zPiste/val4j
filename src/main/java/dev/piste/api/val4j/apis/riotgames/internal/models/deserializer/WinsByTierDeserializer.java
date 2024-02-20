package dev.piste.api.val4j.apis.riotgames.internal.models.deserializer;

import com.google.gson.*;
import dev.piste.api.val4j.apis.riotgames.internal.models.MMR;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class WinsByTierDeserializer implements JsonDeserializer<MMR.QueueStats.SeasonalInfo.WinsByTier[]> {

    @Override
    public MMR.QueueStats.SeasonalInfo.WinsByTier[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<MMR.QueueStats.SeasonalInfo.WinsByTier> winsByTiers = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            int tierId = Integer.parseInt(entry.getKey());
            int winCount = entry.getValue().getAsInt();
            JsonObject winsByTierObject = new JsonObject();
            winsByTierObject.addProperty("tierId", tierId);
            winsByTierObject.addProperty("winCount", winCount);
            MMR.QueueStats.SeasonalInfo.WinsByTier winsByTier = jsonDeserializationContext.deserialize(winsByTierObject, MMR.QueueStats.SeasonalInfo.WinsByTier.class);
            winsByTiers.add(winsByTier);
        }
        return winsByTiers.toArray(new MMR.QueueStats.SeasonalInfo.WinsByTier[0]);
    }

}