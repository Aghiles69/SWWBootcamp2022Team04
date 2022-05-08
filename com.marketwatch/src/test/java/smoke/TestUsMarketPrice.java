package smoke;

import base_test.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import pom.HomePage;
import pom.UsSubPage;

public class TestUsMarketPrice extends BaseTest {

    HomePage homePage = new HomePage();

    @Test
    public UsSubPage navigateAndComparePriceOfDJ(){

        homePage.clickOnUsMarketTable();
        fluentWait.until(ExpectedConditions.visibilityOf(homePage.dowjonesprice));
        homePage.getDowJowPrice();
        return new UsSubPage();

    }
}
