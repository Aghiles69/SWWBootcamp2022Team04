package testBase;

import base.BasePage;
import utils.ExcelData;

import java.io.File;

public class TestBase extends BasePage {


   // public Homepage getHomepage() {return new Homepage();}

   // public CreditCardHomePage CreditCardHomePage(){return new CreditCardHomePage();}

    public static String dataFilePath = System.getProperty("user.dir") + File.separator + "src" + File.separator
            + "test" + File.separator + "resources" + File.separator + "test_data.xlsx";
    public static ExcelData excel = new ExcelData(dataFilePath);
}
