package booking.shared;

import base.BasePage;
import booking.pom.FlightsHomePage;
import org.openqa.selenium.support.PageFactory;

public class SystemBar extends BasePage {



    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public FlightsHomePage clickOnElement() {
        return null;
    }

    // public FlightsHomePage navigateToFlight() {
  //  }
}

