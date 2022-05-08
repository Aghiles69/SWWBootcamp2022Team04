package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeMethod;

public class HomePage extends BasePage {

    //AlertDismiss Region
    @FindBy(xpath = "//div[@id=\"cx-scrim-wrapper\"]//button")
    public WebElement dismissButton;

    @BeforeMethod(alwaysRun = true)
    public void dismissAlertPopUp(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(dismissButton));
        safeClickOnElement(dismissButton);

    }
    //End AlertDismiss region

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/us\"]")
    public WebElement usMarketTableOption;


    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/europe-middle-east\"]")
    public WebElement euMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/markets/asia\"]")
    public WebElement asiaMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/currencies\"]")
    public WebElement fxMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/bonds\"]")
    public WebElement ratesMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/futures\"]")
    public WebElement futuresMarketTableOption;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/cryptocurrency\"]")
    public WebElement cryptoMarketTableOption;

    @FindBy(xpath = "//td[@class=\"table__cell price\"]//bg-quote[@channel=\"/zigman2/quotes/31322028/realtime\"]")
    public WebElement realTimePriceBTC;

    @FindBy(xpath = "//a[@href=\"https://www.marketwatch.com/investing/cryptocurrency/ethusd?mod=home-page\"]")
    public WebElement ethTableLink;

    @FindBy(xpath = "//td[@class='table__cell symbol']//a[@data-track-code='MW_Header_Market Data_Quote Click_Dow Jones Industrial Average']")
    public WebElement dowjonesprice;






    public void clickOnCryptoOption(){
        webDriverWait.until(ExpectedConditions.elementToBeClickable(cryptoMarketTableOption));
        cryptoMarketTableOption.click();
    }


    public String getRealTimePriceBTC(){
        fluentWait.until(ExpectedConditions.visibilityOf(realTimePriceBTC));
        String rTPriceBTC = getTrimmedElementText(realTimePriceBTC);

        return rTPriceBTC;

    }

    public EthSubPage navigateToEthShardPage(){
        clickOnCryptoOption();
        webDriverWait.until(ExpectedConditions.visibilityOf(ethTableLink));
       clickOnElement(ethTableLink);

     return new EthSubPage();
    }

    public UsSubPage clickOnUsMarketTable(){
        safeClickOnElement(usMarketTableOption);
        return new UsSubPage();

    }

    public void getDowJowPrice(){
        hoverOverElement(dowjonesprice);
        getTrimmedElementText(dowjonesprice);
    }

}
