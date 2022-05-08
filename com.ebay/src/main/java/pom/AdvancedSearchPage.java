package pom;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdvancedSearchPage extends BasePage {
    public static final String URL = "https://www.ebay.com/sch/ebayadvsearch";

    @FindBy(xpath = "//a[@href=\"https://www.ebay.com/sch/ebayadvsearch?_sofindtype=21\"]")
    WebElement eBayMotors;


    @FindBy(xpath = "//a[@href=\"https://www.ebay.com/sch/ebayadvsearch?_sofindtype=0&_byseller=1#byseller\"]")
    WebElement eBayBestSeller;




}
