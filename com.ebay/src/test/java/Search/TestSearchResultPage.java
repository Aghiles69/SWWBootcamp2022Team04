package Search;

import Pom.HomePage;
import Pom.SearchResultPage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchResultPage extends BasePage {


    @Test
    public void testSearchResultTerm() {
        String searchTerm = "Iphone";
        HomePage home = new HomePage();
        SearchResultPage searchResults = home.doSearch(searchTerm);

        {
            Assert.assertEquals(searchResults.getSearchTerm(), searchTerm);
        }
    }

    }

