package dev.piste.api.val4j.util;

import com.google.gson.JsonObject;

import java.util.Base64;

/**
 * @author Piste  (<a href="https://github.com/PisteDev">GitHub</a>)
 */
public class ClientPlatform {

    public static String getAsBase64() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("platformType", "PC");
        jsonObject.addProperty("platformOS", "Windows");
        jsonObject.addProperty("platformOSVersion", "10.0.19042.1.256.64bit");
        jsonObject.addProperty("platformChipset", "Unknown");

        return Base64.getEncoder().encodeToString(jsonObject.toString().getBytes());
    }

}