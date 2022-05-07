package automationApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import shared.SystemBar;

public class LoginPage extends SystemBar {

    public static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";


    @FindBy(id = "email")
    public WebElement registeredEmailAddressInputField;

    @FindBy(id = "passwd")
    public WebElement passwordInputField;


    public void sKInputRegisteredEmailAddress() {
        //Fluent Wait Use
        fluentWait.until(ExpectedConditions.visibilityOf(registeredEmailAddressInputField));
        sendKeysToElement(registeredEmailAddressInputField, "aghiles18@yahoo.com");
    }
    public void sKPasswordInput(){
        sendKeysToElement(passwordInputField, "abcd8523");
    }


}
