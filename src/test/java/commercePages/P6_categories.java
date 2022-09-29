package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P6_categories {

    public WebElement checkProductFromCellPhoneSubCategoryPage() {
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"] > a[href=\"/nokia-lumia-1020\"]"));
    }

    public WebElement shoesRedCheckBox() {
        return driver.findElement(By.cssSelector("li[class=\"item color-item\"] > input[id=\"attribute-option-15\"]"));
    }

    public WebElement checkProductFromShoesSubCategoryPage() {
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"] > [href=\"/adidas-consortium-campus-80s-running-shoes\"]"));
    }

    public WebElement compactTag() {
        return driver.findElement(By.cssSelector("a[href=\"/compact\"]"));
    }

    public WebElement pageTitle() {
        return driver.findElement(By.cssSelector("div[class=\"page-title\"]:first-child"));
    }

    public WebElement addToCartButton() {
        return driver.findElement(By.cssSelector("div:nth-child(1) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button"));
    }

    public WebElement barNotification() {
        return driver.findElement(By.cssSelector("#bar-notification > div > p"));
    }

    public WebElement shoppingCartButton() {
      return driver.findElement( By.cssSelector("a[href=\"/cart\"] > span[class=\"cart-label\"]"));
    }

    public WebElement shoppingCartQuantity() {
        return driver.findElement(By.cssSelector("a[href=\"/cart\"] > span[class=\"cart-qty\"]"));
    }

    public WebElement addToWishListButton() {
        return driver.findElement(By.cssSelector("div:nth-child(1) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-wishlist-button"));
    }

    public WebElement wishlistButton() {
        return driver.findElement(By.cssSelector("a[href=\"/wishlist\"] > span[class=\"wishlist-label\"]"));
    }

    public WebElement wishlistQuantity() {
        return driver.findElement(By.cssSelector("a[href=\"/wishlist\"] > span[class=\"wishlist-qty\"]"));
    }

    public WebElement addFirstProductToCompareList() {
        return driver.findElement(By.cssSelector("div:nth-child(1) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button"));
    }

    public WebElement addSecondProductToCompareList() {
        return driver.findElement(By.cssSelector("div:nth-child(2) > div > div.details > div.add-info > div.buttons > button.button-2.add-to-compare-list-button"));
    }

    public WebElement productComparisonButton() {
        return driver.findElement(By.cssSelector("#bar-notification > div > p > a[href=\"/compareproducts\"]"));
    }
}
