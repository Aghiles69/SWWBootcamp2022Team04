package booking.pom;

import booking.shared.SystemBar;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SystemBar {



    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
