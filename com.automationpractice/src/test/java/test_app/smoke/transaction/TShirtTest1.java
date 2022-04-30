package test_app.smoke.transaction;

//import app.pom.Homepage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom.Homepage;
import pom.TShirtsPage1;
import test_base.BaseTest;

public class TShirtTest1 extends BaseTest {


    @Test
    public void TestShirtPage1(){

    Homepage homepage = new Homepage();
    TShirtPage1 tShirtPage1 = new TShirtsPage1();
    homepage.TShirtTab.click();
    TShirtsPage1.TShirtDropDown.cilck();
    TShirtsPage1.Casual.cilck();
    Assert.assertTrue(

    IsElementVisible(TShirtpage.casual));

    //    }
   }
}
