package booking.pom;

import booking.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttractionsSearchResultPage extends SystemBar {



    @FindBy(xpath = "/html/body/div[2]/div/div/div/div[1]/div/div/div/nav/ol/li[2]/span/a/span")
    public WebElement searchTerm;


    public AttractionsSearchResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String getSearchTerm() {
        String searchTermString = searchTerm.getText().toLowerCase();
        return searchTermString.substring(1, searchTermString.length() - 1);
    }
}
