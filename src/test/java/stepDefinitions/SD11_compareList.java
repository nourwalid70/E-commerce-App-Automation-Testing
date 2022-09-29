package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import commercePages.P9_compareList;
import org.junit.Assert;

import java.time.Duration;

import static stepDefinitions.Hooks.driver;

public class SD11_compareList {

    P6_categories categories = new P6_categories();
    P9_compareList compare = new P9_compareList();

    @And("user clicks on add to compare list button for the first product.")
    public void user_clicks_on_add_to_compare_list_button_for_the_first_product() throws InterruptedException {
        categories.addFirstProductToCompareList().click();
        Thread.sleep(2000);
    }

    @Then("the message of adding to compare list will appear.")
    public void the_message_of_adding_to_compare_list_will_appear() throws InterruptedException {
        String actualResult = categories.barNotification().getText();
        String expectedResult = "The product has been added to your product comparison";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user clicks on add to compare list button for the second product.")
    public void user_clicks_on_add_to_compare_list_button_for_the_second_product(){
        categories.addSecondProductToCompareList().click();
    }

    @And("user clicks on product comparison button in appearing message.")
    public void user_clicks_on_product_comparison_button_in__appearing_message() throws InterruptedException {
        categories.productComparisonButton().click();
        Thread.sleep(3000);
    }

    @Then("user returned to compare list page.")
    public void user_returned_to_compare_list_page() {
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/compareproducts";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("products will exist.")
    public void products_will_exist() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String actualResult = compare.checkProductExist().getText();
        String expectedResult = "HTC One M8 Android L 5.0 Lollipop";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user clicks on clear list button.")
    public void user_clicks_on_clear_list_button() throws InterruptedException {
        compare.clearListButton().click();
        Thread.sleep(3000);
    }

    @Then("the list of products will be empty.")
    public void the_list_of_products_will_be_empty(){
        String actualResult = compare.clearingMessage().getText();
        String expectedResult = "You have no items to compare.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
