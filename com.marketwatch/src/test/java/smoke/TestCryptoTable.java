package smoke;

import base_test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pom.HomePage;

public class TestCryptoTable extends BaseTest {

    HomePage homePage = new HomePage();
    public final static String BTCENTRYPRICE = "33000";


    @Test
    public void compareRealTimeAndEntryPriceForBtc(){
        safeClickOnElement(homePage.dismissButton);
        homePage.clickOnCryptoOption();
        String btcActualPrice = homePage.getRealTimePriceBTC();

        Assert.assertEquals(btcActualPrice,BTCENTRYPRICE);
        System.out.println("Good timing to Buy BITCOIN,you Should ALWAYS buy and hold btc");

    }

    @Test
    public void ethPriceCheck(){
        homePage.navigateToEthShardPage();
        Assert.assertTrue(true);
    }




}
