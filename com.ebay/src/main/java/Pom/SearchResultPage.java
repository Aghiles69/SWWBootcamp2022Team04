package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class SearchResultPage extends SystemBar {


    @FindBy(xpath = "//div[5]/div[1]/div/span[2]/a[1]/span") // iphone
    public WebElement searchTerm;


    public SearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm() {
        String searchTermString = searchTerm.getText().toLowerCase();
        return searchTermString.substring(1, searchTermString.length() - 1);
    }



}
