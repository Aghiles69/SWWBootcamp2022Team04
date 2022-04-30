package testBooking.search;

import base.BasePage;
import booking.pom.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAttractionSearch extends BasePage {


    @Test
    public void testSearchResultTerm(){
        String searchTerm = "Dubai";
        HomePage homepage = new HomePage();
       TestAttractionSearch searchResults = homepage.doSearch(searchTerm);

       // Assert.assertEquals(searchResults.getSearchTerm(),searchTerm);





    }







}
