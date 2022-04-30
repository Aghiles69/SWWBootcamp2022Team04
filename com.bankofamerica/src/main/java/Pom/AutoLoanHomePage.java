package Pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import shared.SystemBar;

public class AutoLoanHomePage extends SystemBar {

   @FindBy(xpath =" //*[@id=\"navAutoLoans\"]/span[3]")
    public WebElement autoLoan;

    @FindBy(xpath ="//*[@id=\"checkAutoLoanRates\"] ")
    public WebElement  checkAutoLoanRates;

    @FindBy(xpath =" //*[@id=\"stateSelectModal\"]")
    public WebElement stateSelector ;

    @FindBy(xpath ="//*[@id=\"stateSelectModal\"]/option[48] ")
    public WebElement  Virginia;

    @FindBy(xpath =" //*[@id=\"stateSelectorSubmit\"]")
    public WebElement goButton ;


}

