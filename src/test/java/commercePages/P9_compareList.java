package commercePages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P9_compareList {

   public WebElement checkProductExist() {
        return driver.findElement(By.cssSelector("div[Class=\"table-wrapper\"] > table > tbody > tr[class=\"product-name\"] > td:nth-child(2) > a"));
    }

    public WebElement clearListButton(){
        return driver.findElement(By.cssSelector("div[class=\"page compare-products-page\"] > div[class=\"page-body\"] > a"));
    }

    public WebElement clearingMessage(){
        return driver.findElement(By.cssSelector("div[class=\"page compare-products-page\"] > div[class=\"page-body\"] > div[class=\"no-data\"]"));
    }

}
