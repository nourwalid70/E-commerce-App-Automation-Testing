package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P8_wishList {

    public WebElement productExist() {
        return driver.findElement(By.cssSelector("tr:nth-child(1) > td.product > a[href=\"/htc-one-m8-android-l-50-lollipop\"]"));
    }

    public WebElement productQuantity() {
        return driver.findElement(By.cssSelector("td[class=\"quantity\"] > input:nth-child(2)"));
    }

    public WebElement updateWishlistButton() {
        return driver.findElement(By.id("updatecart"));
    }
}
