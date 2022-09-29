package commercePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static stepDefinitions.Hooks.driver;

public class P1_registration {
    public WebElement femaleCheckBox() {
        return driver.findElement(By.id("gender-female"));
    }

    public WebElement firstNameTxtFld() {
        return driver.findElement(By.id("FirstName"));
    }

    public WebElement lastNameTxtFld() {
        return driver.findElement(By.id("LastName"));
    }

    public WebElement birthDay() {
        return driver.findElement(By.name("DateOfBirthDay"));
    }

    public WebElement day() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthDay\"] > option[value=\"11\"]"));
    }

    public WebElement birthMonth() {
        return driver.findElement(By.name("DateOfBirthMonth"));
    }

    public WebElement month() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthMonth\"] > option[value=\"8\"]"));
    }

    public WebElement birthYear() {
        return driver.findElement(By.name("DateOfBirthYear"));
    }

    public WebElement year() {
        return driver.findElement(By.cssSelector("select[name=\"DateOfBirthYear\"] > option[value=\"1999\"]"));
    }

    public WebElement emailTxtFld() {
        return driver.findElement(By.id("Email"));
    }

    public WebElement passwordTxtFld() {
        return driver.findElement(By.id("Password"));
    }

    public WebElement confirmPassTxtFld() {
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerButton() {
        return driver.findElement(By.id("register-button"));
    }

    public WebElement registrationCompletedMsg() {
        return driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }
}
