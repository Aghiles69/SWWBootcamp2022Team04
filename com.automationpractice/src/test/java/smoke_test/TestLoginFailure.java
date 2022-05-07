package smoke_test;

import org.testng.annotations.Test;
import shared.SystemBar;
import test_base.AutomationHomePage;
import test_base.BaseTest;
import test_base.LoginPage;

public class TestLoginFailure extends BaseTest {


    @Test
    public static void tryLoginWithUnvalidCread(){
        SystemBar systemBar = new SystemBar();
        systemBar.safeClickOnElement(systemBar.signInButton);

        LoginPage loginPage = new LoginPage();
        loginPage.sKPasswordInput();
        loginPage.sKInputRegisteredEmailAddress();





    }


}