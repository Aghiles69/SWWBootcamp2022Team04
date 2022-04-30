package pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses extends SystemBar {



    @FindBy(xpath = " By\"li[@class='sfHover']//a[@title='Dresses'][normalize-space()='Dresses'")
    public WebElement dresses;

    @FindBy(id="categories_block_left\"]/div/ul/li[2]/a")
    public WebElement eveningDresses;

    @FindBy(id="\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    public static WebElement firstItem;

    public Dresses() {
        PageFactory.initElements(driver, this);
    }

    public static void hoverOverFirstItem() {
        hoverOverElement(firstItem);
    }

   // public static void clickEveningDressQuickViewButton() {
      //  WebElement eveningDressQuickViewButton = null;
        //safeClickOnElement(eveningDressQuickViewButton);
   // }

}
