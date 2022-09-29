package commercePages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.driver;

public class P5_currencyChange {

    public WebElement listOfCurrencies() {
        return driver.findElement(By.id("customerCurrency"));
    }

    public WebElement euroCurrency() {
        return driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2Fsearch%3Fq%3Dcamera\"]"));
    }

    public WebElement usDollarCurrency() {
        return driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/1?returnUrl=%2Fsearch%3Fq%3Dcamera\"]"));
    }

    public WebElement priceCheck() {
        return driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }
}
