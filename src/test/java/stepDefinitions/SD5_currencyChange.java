package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P5_currencyChange;
import org.junit.Assert;


public class SD5_currencyChange { // after searching about camera, there is only one element in home page
    P5_currencyChange currency = new P5_currencyChange();

    @And("user click on the list of currencies.")
    public void user_clicks_on_the_list_of_currencies() throws InterruptedException {
        currency.listOfCurrencies();
        Thread.sleep(3000);
    }

    @And("user chooses Euro currency.")
    public void user_chooses_Euro_currency() throws InterruptedException {
        currency.euroCurrency().click();
        Thread.sleep(3000);
    }

    @Then("the price of products changes to Euros.")
    public void the_price_of_products_changes_to_Euros(){
        String actualResult = currency.priceCheck().getText();
        String expectedResult = "€";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user chooses US Dollar currency.")
    public void user_chooses_US_Dollar_currency() throws InterruptedException {
        currency.usDollarCurrency().click();
        Thread.sleep(3000);
    }


    @Then("the price of products changes to US Dollar.")
    public void the_price_of_products_changes_to_US_Dollar(){
        String actualResult = currency.priceCheck().getText();
        String expectedResult = "$";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
