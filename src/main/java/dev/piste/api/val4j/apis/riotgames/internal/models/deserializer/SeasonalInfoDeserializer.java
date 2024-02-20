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
public class SeasonalInfoDeserializer implements JsonDeserializer<MMR.QueueStats.SeasonalInfo[]> {

    @Override
    public MMR.QueueStats.SeasonalInfo[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<MMR.QueueStats.SeasonalInfo> seasonalInfos = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            MMR.QueueStats.SeasonalInfo seasonalInfo = jsonDeserializationContext.deserialize(entry.getValue(), MMR.QueueStats.SeasonalInfo.class);
            seasonalInfos.add(seasonalInfo);
        }
        return seasonalInfos.toArray(new MMR.QueueStats.SeasonalInfo[0]);
    }

}