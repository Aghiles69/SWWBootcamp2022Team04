package search;

import Pom.HomePage;
import Pom.StoreFindHomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStoreFind extends BasePage {

    @Test
    public void testStoreFind(){
        HomePage homePage =new HomePage();
        StoreFindHomePage storeFind= homePage.clickOnElement();
        waitForElementToBeVisible(StoreFindHomePage.LocationFindSearch);
        homePage.clickOnElement(StoreFindHomePage.StoreFind);
        homePage.clickOnElement(StoreFindHomePage.LocationFind);
        homePage.sendKeysToElement(22043);
       // homePage.clickOnElement(StoreFindHomePage.SearshFirstResult);
        clickOnElement(StoreFindHomePage.SearchFirstResult);
        homePage.hoverOverElement(StoreFindHomePage.TargetLocation);
        String expectedMessage = excel.readStringArray("ExpectedMessage1")[0];
        Assert.assertEquals(StoreFindHomePage.getStoreFindHomePageMessage(),expectedMessage);




    }



}
