package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.driver;

public class P2_login {

    public WebElement emailTxtFld() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordTxtFld() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement loginButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }

    public WebElement loginSuccessfully(){
        return driver.findElement( By.cssSelector("a[class=\"ico-logout\"]"));
    }

    public WebElement loginErrorMsg() {
        return driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
    }
}
