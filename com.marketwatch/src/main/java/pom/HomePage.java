package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;

import java.util.Locale;

public class HomePage extends BasePage {

    //AlertDismiss Region
    @FindBy(xpath = "//div[@id=\"cx-scrim-wrapper\"]//button")
    WebElement dismissButton;

    @BeforeMethod(alwaysRun = true)
    public void dismissAlertPopUp(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(dismissButton));
        safeClickOnElement(dismissButton);

    }
    //End AlertDismiss region

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/us\"]")
    WebElement usMarketTableOption;


    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/europe-middle-east\"]")
    WebElement euMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/asia\"]")
    WebElement asiaMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/currencies\"]")
    WebElement fxMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/bonds\"]")
    WebElement ratesMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/futures\"]")
    WebElement futuresMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/cryptocurrency\"]")
    WebElement cryptoMarketTableOption;

    @FindBy(xpath = "//td[@class=\"table__cell price\"]//bg-quote[@channel=\"/zigman2/quotes/31322028/realtime\"]")
    WebElement realTimePriceBTC;






    public void clickOnCryptoOption(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cryptoMarketTableOption));
        cryptoMarketTableOption.click();
    }


    public String getRealTimePriceBTC(){
        fluentWait.until(ExpectedConditions.visibilityOf(realTimePriceBTC));
        String rTPriceBTC = getTrimmedElementText(realTimePriceBTC);

        return rTPriceBTC;

    }




}
