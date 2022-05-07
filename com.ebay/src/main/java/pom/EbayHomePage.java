package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EbayHomePage extends BasePage {

    public EbayHomePage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@title='Advanced Search']")
    WebElement advancedSearchButton;



}
