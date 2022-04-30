package pom;

import app.shared.Products;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TShirts extends Products{



        @FindBy(xpath = "//div[@id='layered_price_slider']/a[1]")
        public WebElement priceSliderLeft;

        @FindBy(xpath = "//div[@id='layered_price_slider']/a[2]")
        public static WebElement priceSliderRight;

        @FindBy(id = "\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
        public static WebElement FadedShortSleeveTShertQuickViewButton;


        public TShirts() {
            PageFactory.initElements(driver, this);
        }

        public static void setUpperPriceRange(Double upperPriceRange) {
            if (upperPriceRange >= 0 && upperPriceRange <= 100) {

                Actions actions = new Actions(driver);

                while (Double.parseDouble(driver.findElement(By.id("layered_price_range")).getText().substring(10)) > upperPriceRange) {
                    actions.clickAndHold(priceSliderRight).build().perform();
                    actions.moveByOffset(-5, 0).build().perform();
                    actions.release(priceSliderRight).build().perform();
                }
            }
        }



        public static void clickFadedShortSleeveTShertQuickViewButton() {
            safeClickOnElement(FadedShortSleeveTShertQuickViewButton);
        }

}
