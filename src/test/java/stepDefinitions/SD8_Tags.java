package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import org.junit.Assert;


public class SD8_Tags {
    P6_categories categories = new P6_categories();

    @And("user selects a compact tag.")
    public void user_selects_a_compact_tag() throws InterruptedException {
        categories.compactTag().click();
        Thread.sleep(3000);
    }

    @Then("user returned to products with compact tag.")
    public void user_returned_to_products_with_compact_tag() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/compact";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("products tagged with compact title will be appeared.")
    public void products_tagged_with_compact_title_will_be_appeared() {
        String actualResult = categories.pageTitle().getText();
        String expectedResult = "'compact'";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
