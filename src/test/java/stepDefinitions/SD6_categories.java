package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P6_categories;
import commercePages.P0_homePage;
import org.junit.Assert;

public class SD6_categories {
    P0_homePage home = new P0_homePage();
    P6_categories categories = new P6_categories();

    @When("user selects Electronics category from home page.")
    public void user_selects_Electronics_category_from_home_page() throws InterruptedException {
        home.electronicsCategory().click();
        Thread.sleep(3000);
    }

    @And("user selects cell phones as sub-Category.")
    public void user_selects_cell_phones_as_sub_Category() throws InterruptedException {
        home.cellPhonesSubCategory().click();
        Thread.sleep(3000);
    }

    @Then("user returned to subcategory page.")
    public void user_returned_to_subcategory_page() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/cell-phones";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("subcategory page shows a cell phones.")
    public void subcategory_page_shows_a_cell_phones() {
        String actualResult = categories.checkProductFromCellPhoneSubCategoryPage().getText();
        String expectedResult = "Nokia Lumia 1020";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
