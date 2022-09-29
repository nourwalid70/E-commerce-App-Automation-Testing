package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P4_search {
    public WebElement searchAbout() {
        return driver.findElement(By.cssSelector("h2[class=\"product-title\"]  > a[href=\"/leica-t-mirrorless-digital-camera\"]"));
    }
}
