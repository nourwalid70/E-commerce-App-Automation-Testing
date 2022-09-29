package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P10_createOrder {
    public WebElement countryList() {
        return driver.findElement(By.cssSelector("select[data-url=\"/country/getstatesbycountryid\"]"));
    }

    public WebElement countryEgypt() {
        return driver.findElement( By.cssSelector("option[value=\"123\"]"));
    }

    public WebElement cityInput() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_City"));
    }

    public WebElement address1Input() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_Address1"));
    }

    public WebElement zipOrPostalInput() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_ZipPostalCode"));
    }

    public WebElement phoneNumberInput() {
        return driver.findElement(By.cssSelector("#BillingNewAddress_PhoneNumber"));
    }

    public WebElement continueButtonAtBillingAddress() {
        return driver.findElement(By.cssSelector("#billing-buttons-container > button.button-1.new-address-next-step-button"));
    }

    public WebElement continueButtonAtShippingMethod() {
        return driver.findElement(By.cssSelector("#shipping-method-buttons-container > button"));
    }

    public WebElement continueButtonAtPaymentMethod() {
        return driver.findElement(By.cssSelector("#payment-method-buttons-container > button"));
    }

    public WebElement continueButtonAtPaymentInformation() {
        return driver.findElement(By.cssSelector("#payment-info-buttons-container > button"));
    }

    public WebElement confirmButton() {
        return driver.findElement(By.cssSelector("#confirm-order-buttons-container > button"));
    }

    public WebElement successMessage() {
        return driver.findElement(By.cssSelector("div.page-body.checkout-data > div > div.title > strong"));
    }
}
