package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import commercePages.P7_shoppingCart;
import commercePages.P10_createOrder;
import org.junit.Assert;
import java.time.Duration;

import static stepDefinitions.Hooks.driver;


public class SD12_createOrder {
    P7_shoppingCart shoppingCart = new P7_shoppingCart();
    P10_createOrder checkout = new P10_createOrder();

    @And("user marks the checkbox of agreement.")
    public void user_marks_the_checkbox_of_agreement() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        shoppingCart.checkboxOfAgreement().click();
        Thread.sleep(2000);
    }

    @And("user clicks on checkout button.")
    public void user_clicks_on_checkout_button() throws InterruptedException {
        shoppingCart.checkoutButton().click();
        Thread.sleep(2000);
    }

    @Then("user returned to checkout page.")
    public void user_returned_to_checkout_page() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/onepagecheckout#opc-billing";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user enters his country.")
    public void user_enters_his_country_as() throws InterruptedException {
        checkout.countryList().click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        checkout.countryEgypt().click();
        Thread.sleep(2000);
    }

    @And("user enters his city.")
    public void user_enters_his_city() throws InterruptedException {
        checkout.cityInput().sendKeys("Alexandria");
        Thread.sleep(2000);
    }

    @And("user enters his address.")
    public void user_enters_his_her_address() throws InterruptedException {
        checkout.address1Input().sendKeys("32 street, Alexandria");
        Thread.sleep(2000);
    }

    @And("user enters zip or postal code.")
    public void user_enters_zip_or_postal_code() throws InterruptedException {
        checkout.zipOrPostalInput().sendKeys("985126");
        Thread.sleep(2000);
    }

    @And("user enters his phone number.")
    public void user_enters_his_or_her_phone_number() throws InterruptedException {
        checkout.phoneNumberInput().sendKeys("+20123456789");
        Thread.sleep(2000);
    }

    @And("user clicks on continue button at billing address.")
    public void user_clicks_on_continue_button_at_billing_address() throws InterruptedException {
        checkout.continueButtonAtBillingAddress().click();
        Thread.sleep(3000);
    }

    @And("user clicks on continue button at shipping method.")
    public void user_clicks_on_continue_button_at_shipping_method() throws InterruptedException {
        checkout.continueButtonAtShippingMethod().click();
        Thread.sleep(3000);
    }

    @And("user clicks on continue button at payment method.")
    public void user_clicks_on_continue_button_at_payment_method() throws InterruptedException {
        checkout.continueButtonAtPaymentMethod().click();
        Thread.sleep(3000);
    }

    @And("user clicks on continue button at payment information.")
    public void user_clicks_on_continue_button_at_payment_information() throws InterruptedException {
        checkout.continueButtonAtPaymentInformation().click();
        Thread.sleep(3000);
    }

    @And("user clicks on confirm button.")
    public void user_clicks_on_confirm_button() throws InterruptedException {
        checkout.confirmButton().click();
        Thread.sleep(3000);
    }

    @Then("user returned to checkout completed page.")
    public void user_returned_to_checkout_completed_page() {
        String actualResult = driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/checkout/completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("creating order successfully message appears.")
    public void creating_order_successfully_message_appears() {
        String actualResult= checkout.successMessage().getText();
        String expectedResult = "Your order has been successfully processed!";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
