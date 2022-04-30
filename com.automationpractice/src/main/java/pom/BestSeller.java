package pom;

import app.shared.SystemBar;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSeller extends SystemBar {


    @FindBy(id="home-page-tabs\"]/li[2]/a")
    public WebElement bestSeller;

    @FindBy(xpath = "//a[@href='http://automationpractice.com/index.php?id_product=7&controller=product'][@class='quick-view']")
    public WebElement printedChiffonDressQuickViewButton;
}
