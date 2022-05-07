package shared;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import test_base.LoginPage;

public class SystemBar extends BasePage {

    @FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
    public WebElement signInButton;


    public LoginPage clickSignButton() {
        safeClickOnElement(signInButton);

        return new LoginPage();
    }
}
