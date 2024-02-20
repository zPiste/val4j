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
public class QueueStatsDeserializer implements JsonDeserializer<MMR.QueueStats[]> {

    @Override
    public MMR.QueueStats[] deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        List<MMR.QueueStats> queueStatsList = new ArrayList<>();
        for (Map.Entry<String, JsonElement> entry : jsonObject.entrySet()) {
            JsonObject queueStatsObject = entry.getValue().getAsJsonObject();
            queueStatsObject.addProperty("queueId", entry.getKey());
            MMR.QueueStats queueStats = jsonDeserializationContext.deserialize(queueStatsObject, MMR.QueueStats.class);
            queueStatsList.add(queueStats);
        }
        return queueStatsList.toArray(new MMR.QueueStats[0]);
    }

}