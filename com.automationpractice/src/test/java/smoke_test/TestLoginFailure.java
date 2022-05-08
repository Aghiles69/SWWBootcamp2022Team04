package smoke_test;

import automationApp.AutomationHomePage;
import automationApp.LoginPage;
import automationApp.MyAccount;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import automationApp.BaseTest;
import org.testng.asserts.SoftAssert;
import utils.GenerateData;


public class TestLoginFailure extends BaseTest {

    AutomationHomePage homePage = new AutomationHomePage();
    LoginPage loginPage = new LoginPage();

    @Test
    public  void tryLoginWithUnvalidCread(){


        homePage.clickLoginButton();


        loginPage.sKInputRegisteredEmailAddress();
        loginPage.sKPasswordInput();

        loginPage.clickLoginButton();

        Assert.assertEquals(homePage.logoutButton,"logout");

    }

    @Test
    public void createNewUserAccount(){
    homePage.clickLoginButton();
    loginPage.createAccount(GenerateData.email());
    loginPage.clickCreateAccountButton();
        String firstName = GenerateData.firstName();
        String lastName = GenerateData.lastName();
        String password = GenerateData.password();
        String[] dob = GenerateData.dateOfBirth();
        String day = dob[0];
        String monthNumber = dob[1];
        String year = dob[2];
        String streetAddress = GenerateData.streetAddress();
        String city = GenerateData.city();
        String state = GenerateData.state();
        String zipCode = GenerateData.zipCode();
        String phoneNumber = GenerateData.mobilePhone();

    }


}