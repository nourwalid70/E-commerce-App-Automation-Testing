package stepDefinitions;

import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import commercePages.P1_registration;

public class SD1_Registration {
P1_registration register = new P1_registration();

    @And("navigates to registration page.")
        public void navigates_to_registration_page() throws InterruptedException {
            Hooks.driver.navigate().to("https://demo.nopcommerce.com/register?returnUrl=%2F");
            Thread.sleep(3000);
        }

    @When("user select gender type.")
        public void user_select_gender_type(){
            register.femaleCheckBox().click();
        }

    @And("user enters valid firstName.")
    public void user_enters_valid_firstName() {
        register.firstNameTxtFld().sendKeys("nour");
        }

    @And("user enters valid lastName.")
    public void user_enters_valid_lastName() {
        register.lastNameTxtFld().sendKeys("waled");
    }

    @And("user select valid date of birth.")
    public void user_select_valid_date_of_birth() {
        register.birthDay().click();
        register.day().click();
        register.birthMonth().click();
        register.month().click();
        register.birthYear().click();
        register.year().click();
    }

    @And ("user enters valid Email.")
    public void user_enters_valid_email() {
        register.emailTxtFld().sendKeys("tester@yahoo.com");
    }

    @And ("user enters valid password.")
    public void user_enters_valid_password() {
        register.passwordTxtFld().sendKeys("1203@N");
    }

    @And ("user enters the same valid password again.")
    public void user_reenter_valid_password() {
        register.confirmPassTxtFld().sendKeys("1203@N");
    }

    @And ("user clicks on register button.")
    public void user_clicks_on_register_button() throws InterruptedException {
        register.registerButton().click();
        Thread.sleep(3000);
    }

    @Then("user could register successfully.")
    public void user_could_register_successfully() {
        String actualResult = register.registrationCompletedMsg().getText();
        String expectedResult = "Your registration completed";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user returned to register result page.")
    public void user_returned_to_register_result_webpage() {
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/registerresult/1?returnUrl=/";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

}
