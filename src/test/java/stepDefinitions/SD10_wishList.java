package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import commercePages.P8_wishList;
import org.junit.Assert;
import org.openqa.selenium.Keys;


import static stepDefinitions.Hooks.driver;


public class SD10_wishList {
    P6_categories categories = new P6_categories();
    P8_wishList wishList = new P8_wishList();

    @And("user clicks on add to wishlist button for the first product.")
    public void user_clicks_on_add_to_wishlist_button_for_the_first_product() throws InterruptedException {
        categories.addToWishListButton().click();
        Thread.sleep(2000);
    }

    @Then("the message of adding to wishlist will appear.")
    public void the_message_of_adding_to_wishlist_will_appear() throws InterruptedException {
        String actualResult = categories.barNotification().getText();
        String expectedResult = "The product has been added to your wishlist";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
        Thread.sleep(3000);
    }


    @And("user clicks on wishlist button.")
    public void user_clicks_on_wishlist_button() throws InterruptedException {
        categories.wishlistButton().click();
        Thread.sleep(3000);
    }

    @Then("user returned to wishlist page.")
    public void user_returned_to_wishlist_page() {
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/wishlist";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("added products to wishlist will exist.")
    public void added_products_to_wishlist_will_exist() {
        String actualResult = wishList.productExist().getText();
        String expectedResult = "HTC One M8 Android L 5.0 Lollipop";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @Then("user changes quantity to 3 items.")
    public void user_change_quantity_to_3_items(){
        wishList.productQuantity().sendKeys(Keys.BACK_SPACE, "3");
        }

   @And("user clicks on update wishlist button.")
   public void user_clicks_on_update_wishlist_button() throws InterruptedException {
       wishList.updateWishlistButton().click();
       Thread.sleep(3000);
   }

    @And("the number of products in wishlist will be three.")
    public void second_product_is_removed_from_wishlist() {
        String actualResult = categories.wishlistQuantity().getText();
        String expectedResult = "(3)";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
