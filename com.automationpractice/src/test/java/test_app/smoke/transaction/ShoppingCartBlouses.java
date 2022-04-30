package test_app.smoke.transaction;

import app.pom.Homepage;
import app.pom.NewCart;
import app.shared.SystemBar;
import org.testng.Assert;
import org.testng.annotations.Test;
import test_base.BaseTest;

public class ShoppingCartBlouses extends BaseTest {

    @Test
   public void testAddItemToCart() {
        Homepage homepage = new Homepage();
      homepage.hoverOverWomenButton();
         NewCart newCart = homepage.clickWomenHoverMenuDressesSummerDressesButton();

        newCart.clickblouseQuickViewButton();

        int desiredQuantity = 3;
        String size = "M";
         newCart.addItemToCart(desiredQuantity, size);

        String expectedMessage = "Product successfully added to your shopping cart";

            Assert.assertEquals(newCart.getShoppingCartModalSuccessOrFailMessage(), expectedMessage);
         Assert.assertEquals(newCart.getShoppingCartModalQuantityCount(), desiredQuantity);


  }
    }