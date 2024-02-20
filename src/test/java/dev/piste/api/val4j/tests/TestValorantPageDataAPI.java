package dev.piste.api.val4j.tests;

import dev.piste.api.val4j.apis.riotgames.official.ValorantPageDataAPI;
import dev.piste.api.val4j.apis.riotgames.official.models.Article;
import dev.piste.api.val4j.util.APILanguage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author <a href="https://github.com/zpiste">Piste</a>
 */
@DisplayName("VALORANT Webpage Data API")
public class TestValorantPageDataAPI {

    @Test
    public void testGetArticles() throws IOException {
        Article[] articles = new ValorantPageDataAPI().getArticles(APILanguage.GERMAN);
        assertNotNull(articles);
        assertTrue(articles.length > 0);
    }

}