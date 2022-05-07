package automationApp;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class AutomationHomePage extends BasePage {



    public  AutomationHomePage() {
        PageFactory.initElements(driver, this);
    }



}
