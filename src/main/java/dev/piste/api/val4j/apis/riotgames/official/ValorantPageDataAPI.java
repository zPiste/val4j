package dev.piste.api.val4j.apis.riotgames.official;

import com.google.gson.Gson;
import dev.piste.api.val4j.apis.riotgames.official.models.Article;
import dev.piste.api.val4j.http.RestClient;
import dev.piste.api.val4j.http.requests.GetRequestBuilder;
import dev.piste.api.val4j.http.requests.RestRequest;
import dev.piste.api.val4j.util.APILanguage;

import java.io.IOException;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
public class ValorantPageDataAPI {

    private final RestClient restClient;
    private final Gson gson;

    public ValorantPageDataAPI() {
        this.restClient = new RestClient("https://playvalorant.com/page-data");
        this.gson = new Gson();
    }

    public Article[] getArticles(APILanguage language) throws IOException {
        RestRequest restRequest = new GetRequestBuilder()
                .addPath(language.getLocale().toLowerCase()).addPath("news")
                .addPath("page-data.json")
                .build();

        return gson.fromJson(restClient.sendRequest(restRequest).getAsJsonObject().getAsJsonObject("result").getAsJsonObject("data").getAsJsonObject("allContentstackArticles").getAsJsonArray("nodes"), Article[].class);
    }

}