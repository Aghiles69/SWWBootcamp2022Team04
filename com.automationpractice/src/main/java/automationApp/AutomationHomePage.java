package automationApp;


import org.openqa.selenium.support.PageFactory;
import shared.SystemBar;

public class AutomationHomePage extends SystemBar {



    public  AutomationHomePage() {
        PageFactory.initElements(driver, this);
    }





}
