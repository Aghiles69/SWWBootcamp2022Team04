package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AutomationHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='login']")
    WebElement loginButton;




}
