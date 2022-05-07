package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EBayHomePage extends BasePage {

    public EBayHomePage() {
        PageFactory.initElements(driver,this);

    }

    @FindBy(xpath = "//a[@title='Advanced Search']")
    WebElement advancedSearchButton;

    public AdvancedSearchPage clickOnAdvcSearchButton(){
        safeClickOnElement(advancedSearchButton);
        return new AdvancedSearchPage();
    }

    }


