package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class HomePage extends SystemBar {




    @FindBy(id = "gh-ac\"]")
    public WebElement searchBar;

    @FindBy(id = "\"gh-btn\"]")
    public WebElement searchButton;



   public HomePage() {
       PageFactory.initElements(driver, this);
   }
    public SearchResultPage doSearch(String searchTerm) {
       typeOnSearchBar(searchTerm);
        clickSearchButton();
        return new SearchResultPage();
    }


    public void typeOnSearchBar(String input) {
        searchBar.sendKeys(input);
    }

    public void clickSearchButton() {
        searchButton.click();

    }


}
