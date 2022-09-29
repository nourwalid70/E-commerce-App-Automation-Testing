package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import commercePages.P7_shoppingCart;
import org.junit.Assert;


import static stepDefinitions.Hooks.driver;


public class SD9_shoppingCart {
    P6_categories categories = new P6_categories();
    P7_shoppingCart shoppingCart = new P7_shoppingCart();

    @And("user clicks on add to cart button for the first product.")
    public void user_clicks_on_add_to_cart_button_for_the_first_product() throws InterruptedException {
        categories.addToCartButton().click();
        Thread.sleep(1000);
    }

    @Then("the message of adding to cart will appear.")
    public void the_message_of_adding_to_cart_will_appear() throws InterruptedException {
        String actualResult = categories.barNotification().getText();
        String expectedResult = "The product has been added to your shopping cart";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Thread.sleep(3000);
    }

    @And("user clicks on shopping cart button.")
    public void user_clicks_on_shopping_cart_button() throws InterruptedException {
        categories.shoppingCartButton().click();
        Thread.sleep(3000);
    }

    @Then("user returned to shopping cart page.")
    public void user_returned_to_shopping_cart_page() {
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/cart";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("added products to shopping cart will exist.")
    public void added_products_to_shopping_cart_will_exist() {
        String actualResult = shoppingCart.productExist().getText();
        String expectedResult = "HTC One M8 Android L 5.0 Lollipop";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @Then("user clicks on remove button for existing product.")
    public void user_clicks_on_remove_button_for_existing_product() throws InterruptedException {
        shoppingCart.removeFromCartButton().click();
        Thread.sleep(3000);
    }

    @And("the number of products in cart will be zero.")
    public void the_number_of_products_in_cart_will_be_zero() {
        String actualResult = categories.shoppingCartQuantity().getText();
        String expectedResult = "(0)";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
