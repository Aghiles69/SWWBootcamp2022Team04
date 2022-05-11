package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import utils.GenerateData;

import java.util.Locale;

public class HomePage extends BasePage {

    public HomePage(){PageFactory.initElements(driver,this);}


    @FindBy(xpath = "//div[@class=\"top-bar\"]//a[@href=\"/en/home\"]")
    public WebElement TopLogoButton;

    @FindBy(xpath = "//footer//a[@href=\"/en/all-vehicles\"]")
    public WebElement FooterAllVehiclesButton;

    @FindBy(xpath = "//a[@href=\"/en/vehicles/build/c-class/sedan/c300w4\"]")
    public WebElement BuildYourOwnMB;

    @FindBy(xpath = "//a[@href=\"/en/inventory?class=EQS:SDN\"]")
    public WebElement InventorySectionLink;

    @FindBy(xpath = "//span[@class=\"button__value-text\"]")
    public WebElement EmailSubButton;

    @FindBy(xpath = "//span[@class=\"form__input-label-text\"]")
    public WebElement EmailSubInputField;

    @FindBy(xpath = "//a[@href=\"/en/about-us\"]")
    public WebElement aboutUsLink;

    public void safeSendEmailToInputField(){
        webDriverWait.until(ExpectedConditions.visibilityOf(EmailSubInputField));
        sendKeysToElement(EmailSubInputField,GenerateData.email());
    }

    public void subscribeToMBUsa(){
        safeSendEmailToInputField();
        safeClickOnElement(EmailSubButton);

    }

    public AboutUs navigateToAboutUsPage() {
        webDriverWait.until(ExpectedConditions.elementToBeClickable(aboutUsLink));
        jsClickOnElement(aboutUsLink);
        return new AboutUs();
    }






}
