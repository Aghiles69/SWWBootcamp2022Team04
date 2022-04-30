package test_app.smoke.search;

import app.pom.Homepage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import static base.BasePage.driver;

public class SearchBar extends BasePage {


    @Test
    public void testSearchResultTerm() {
        String searchTerm = "Faded Short Sleeve T-shirts";
        Homepage home = new Homepage();
       SearchBar searchResults = home.doSearch(searchTerm);

      /Assert.assertEquals(searchResults.getSearchTerm(), searchTerm);


     // @Test
            //  public void


    }




}
