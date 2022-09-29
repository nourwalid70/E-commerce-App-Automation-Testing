package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.driver;

public class P0_homePage {

    // search area
    public WebElement searchTxtFld() {
        return driver.findElement(By.cssSelector("input[class=\"search-box-text ui-autocomplete-input\"]"));
    }

    public WebElement searchButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }

    // categories area
    public WebElement electronicsCategory() {
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] > li > [href=\"/electronics\"]"));
    }

    public WebElement cellPhonesSubCategory() {
        return driver.findElement(By.cssSelector("ul[class=\"sublist\"] > li[class=\"inactive\"] > a[href=\"/cell-phones\"]"));
    }

    public WebElement apparelCategory() {
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"] > li > a[href=\"/apparel\"]"));
    }

    public WebElement shoesSubCategory() {
        return driver.findElement(By.cssSelector("ul[class=\"sublist\"] > li[class=\"inactive\"] > a[href=\"/shoes\"]"));
    }
}
