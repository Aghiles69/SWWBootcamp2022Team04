package smoke_test;

import automationApp.AutomationHomePage;
import automationApp.LoginPage;
import org.testng.annotations.Test;

import automationApp.BaseTest;


public class TestLoginFailure extends BaseTest {


    @Test
    public static void tryLoginWithUnvalidCread(){

        AutomationHomePage homePage = new AutomationHomePage();
        LoginPage loginPage = new LoginPage();
        homePage.clickLoginButton();


        loginPage.sKInputRegisteredEmailAddress();
        loginPage.sKPasswordInput();

        loginPage.clickLoginButton();


    }


}