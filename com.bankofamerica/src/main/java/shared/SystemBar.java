package shared;

import Pom.AutoLoanHomePage;
import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SystemBar extends BasePage {


    @FindBy(xpath = "//*[@id=\"navAutoLoans\"]/span[3]")
    public WebElement AutoLoan;

    public AutoLoanHomePage navigateToAutoLoan() {
        clickOnElement(AutoLoan);
        return new AutoLoanHomePage();
    }

    public void clickOnElement(WebElement AutoLoan) {
    }

    public AutoLoanHomePage clickAuoLaonButton() {
        return new AutoLoanHomePage();
    }
}
