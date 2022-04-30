package test_app.smoke.transaction;

import app.pom.Dresses;
import app.pom.Homepage;
import app.pom.TShirts;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.TestBasePage;

public class ShoppingCart extends TestBasePage {


    @Test
    public void testAddItemToCart() {
        Homepage homepage = new Homepage();
        homepage.hoverOverWomenButton();
        TShirts Tshirt = homepage.clickWomenHoverMenuTShirtsButton();

        TShirts.setUpperPriceRange(17.95);
        TShirts.clickFadedShortSleeveTShertQuickViewButton();

        int desiredQuantity = 1;
        String size = "S";
        TShirts.addItemToCart(desiredQuantity, size);

        String expectedMessage = "Product successfully added to your shopping cart";

        Assert.assertEquals(TShirts.getShoppingCartModalSuccessOrFailMessage(), expectedMessage);
        Assert.assertEquals(TShirts.getShoppingCartModalQuantityCount(), desiredQuantity);

    }
    /
}
