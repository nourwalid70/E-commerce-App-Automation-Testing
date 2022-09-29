package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P0_homePage;
import commercePages.P4_search;
import org.junit.Assert;

public class SD4_search {
    P0_homePage home = new P0_homePage();
    P4_search search = new P4_search();

    @And("user enters a search words in the search text field.")
    public void user_enters_a_search_words_in_the_text_field() {
        home.searchTxtFld().sendKeys("camera");
    }

    @Then("user clicks on search button.")
    public void user_clicks_on_the_search_button() {
        home.searchButton().click();
    }

    @And("user returned to search page.")
    public void user_redirected_to_a_search_webpage_with_the_textEntered() {
        String actualURL = Hooks.driver.getCurrentUrl();
        String expectedURL = "https://demo.nopcommerce.com/search?q=camera";
        Assert.assertTrue(actualURL.contains(expectedURL));
        Assert.assertEquals(actualURL.contains(expectedURL),true);
        String actualResult = search.searchAbout().getText();
        String expectedResult = "Leica T Mirrorless Digital Camera";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
