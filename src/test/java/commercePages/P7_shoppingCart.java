package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.driver;

public class P7_shoppingCart {
    public WebElement productExist() {
        return driver.findElement(By.cssSelector("tr:nth-child(1) > td.product > a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }

    public WebElement removeFromCartButton() {
        return driver.findElement(By.cssSelector("tbody > tr:nth-child(1) > td.remove-from-cart > button"));
    }

    public WebElement checkboxOfAgreement() {
        return driver.findElement(By.cssSelector("input[id=\"termsofservice\"]"));
    }

    public WebElement checkoutButton() {
        return driver.findElement(By.cssSelector("button[id=\"checkout\"]"));
    }

}
