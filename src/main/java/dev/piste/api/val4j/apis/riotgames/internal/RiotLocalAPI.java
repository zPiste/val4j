package dev.piste.api.val4j.apis.riotgames.internal;

import com.google.gson.Gson;
import dev.piste.api.val4j.apis.riotgames.internal.models.OwnPresence;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.enums.ContentType;
import dev.piste.api.val4j.http.requests.PutRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.util.Lockfile;

import java.io.IOException;
import java.util.Base64;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class RiotLocalAPI {

    private static final String HEADER_NAME = "Authorization";
    private final String headerValue;

    private final RestClient restClient;
    private final Gson gson;

    public RiotLocalAPI() throws IOException {
        Lockfile lockfile = new Lockfile();
        this.headerValue = "Basic " + Base64.getEncoder().encodeToString(("riot:" + lockfile.getPassword()).getBytes());
        this.restClient = new RestClient(String.format("https://127.0.0.1:%s", lockfile.getPort())).bypassAllSLLCertificates();
        this.gson = new Gson();
    }

    public void setOwnPresence(OwnPresence ownPresence) throws IOException {
        RestRequest restRequest = new PutRequestBuilder(gson.toJson(ownPresence), ContentType.JSON)
                .addPath("chat").addPath("v2").addPath("me")
                .addHeader(HEADER_NAME, headerValue)
                .build();

        restClient.sendRequest(restRequest);
    }

}