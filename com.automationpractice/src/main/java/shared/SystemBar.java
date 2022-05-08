package shared;

import automationApp.AutomationHomePage;
import automationApp.LoginPage;
import base.BasePage;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class SystemBar extends BasePage {

   //@FindBy(css = "#header > div.nav > div > div > nav > div.header_user_info > a")
    //public WebElement signInButton;

    @FindBy(xpath = "//a[@class='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@class='logout']")
    public WebElement logoutButton;

    public LoginPage clickLoginButton() {
        safeClickOnElement(loginButton);

        return new LoginPage();
    }


    public AutomationHomePage clickLogoutButton() {

        webDriverWait.until(ExpectedConditions.visibilityOf(loginButton));
        safeClickOnElement(logoutButton);

        return new AutomationHomePage();
    }


}
