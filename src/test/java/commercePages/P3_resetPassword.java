package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static stepDefinitions.Hooks.driver;

public class P3_resetPassword {
    public WebElement recoverPasswordButton() {
        return driver.findElement(By.cssSelector("button[class=\"button-1 password-recovery-button\"]"));
    }

    public WebElement resetPasswordSuccessfully() {
        return driver.findElement( By.cssSelector("p[class=\"content\"]"));
    }

    public WebElement couldNotResetPasswordSuccessfully() {
        return driver.findElement(By.cssSelector("div[class=\"bar-notification error\"] > p[class=\"content\"]"));
    }
}
