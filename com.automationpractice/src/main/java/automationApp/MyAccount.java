package automationApp;


import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class MyAccount extends SystemBar {

    public MyAccount() {
        PageFactory.initElements(driver, this);
    }

}
