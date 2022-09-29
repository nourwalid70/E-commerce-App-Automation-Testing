package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import commercePages.P0_homePage;
import org.junit.Assert;

public class SD7_filterWithColor {
    P0_homePage home = new P0_homePage();
    P6_categories categories = new P6_categories();

    @When("user selects Apparel category from home page.")
    public void user_selects_Apparel_category_from_home_page() throws InterruptedException {
        home.apparelCategory().click();
        Thread.sleep(3000);
    }

    @And("user selects shoes as sub-Category.")
    public void user_selects_shoes_as_sub_Category() throws InterruptedException {
        home.shoesSubCategory().click();
        Thread.sleep(3000);
    }

    @And("user selects a red checkbox.")
    public void user_selects_a_red_checkbox() throws InterruptedException {
        categories.shoesRedCheckBox().click();
        Thread.sleep(3000);
    }

    @Then("shoes will be filtered by red color.")
    public void shoes_will_be_filtered_by_red_color() {
        String actualResult = categories.checkProductFromShoesSubCategoryPage().getText();
        String expectedResult = "adidas Consortium Campus 80s Running Shoes";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
