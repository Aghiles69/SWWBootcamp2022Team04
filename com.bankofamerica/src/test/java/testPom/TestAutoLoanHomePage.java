package testPom;

import Pom.AutoLoanHomePage;
import Pom.HomePage;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestAutoLoanHomePage extends BasePage {

    @Test
    public void testAutoLoan() throws IOException {
        HomePage homePage = new HomePage();
        AutoLoanHomePage autoLoan = homePage.clickAuoLaonButton();

        clickOnElement(autoLoan.AutoLoan);
        waitForElementToBeVisible(autoLoan.autoLoan);
        clickOnElement(autoLoan.checkAutoLoanRates);
        //waitForElementToBeVisible
        clickOnElement(autoLoan.stateSelector);
        clickOnElement(autoLoan.Virginia);
        clickOnElement(autoLoan.goButton);
        String expectedText = "60-month auto loan options";
        String expectedMessage = excel.readStringArray("ExpectedMessage")[0];
        Assert.assertEquals(autoLoan.getAutoLoanRateMessege(), expectedMessage);

    }










     //Assert.assertEquals(summerDresses.getShoppingCartModalSuccessOrFailMessage(), expectedMessage);
      //  Assert.assertEquals(summerDresses.getShoppingCartModalQuantityCount(), desiredQuantity);
}
