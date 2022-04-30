package booking.pom;

import booking.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightResults extends SystemBar {

    @FindBy( xpath = "//div[normalize-space()='Showing 1748 results'] ")
    public WebElement SearchResultQuantityText;  // 1748

    public FlightResults(){
        PageFactory.initElements(driver,this);
    }

    public int getSearchResultQuantity(){
        String text= getTrimmedElementText(SearchResultQuantityText);
        String[] textToArray=text.split("");
        return Integer.parseInt(textToArray[1]);
    }


}
