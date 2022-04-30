package booking.shared;

import base.BasePage;
import booking.pom.Flights;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {

    @FindBy(xpath = " //a[@data-decider-header='flights']")
    public WebElement flightsButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public Flights clickFlightsButton() {
        clickOnElement(flightsButton);
        return new Flights();


    }
}