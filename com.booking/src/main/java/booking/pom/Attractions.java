package booking.pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Attractions extends BasePage {



    @FindBy(xpath= "//input[@name='query']")
    public WebElement searchBar;

    @FindBy(xpath= "/html/body/div[2]/div/div/div/div[1]/div/div/div/div[3]/div/div/form/button/span")
    public WebElement searchButton;


    public Attractions() {
        PageFactory.initElements(driver, this);
    }

    public AttractionsSearchResultPage doSearch(String searchTerm) {
        typeOnSearchBar(searchTerm);
        clickSearchButton();
        return new AttractionsSearchResultPage();
    }


    public void typeOnSearchBar(String input) {
        searchBar.sendKeys(input);
    }

    public void clickSearchButton() {
        searchButton.click();

    }


}
