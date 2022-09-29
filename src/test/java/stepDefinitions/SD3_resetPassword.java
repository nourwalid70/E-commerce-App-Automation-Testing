package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import commercePages.P2_login;
import commercePages.P1_registration;
import commercePages.P3_resetPassword;
import org.junit.Assert;

import static stepDefinitions.Hooks.driver;

public class SD3_resetPassword {
    P1_registration register = new P1_registration();
    P2_login login = new P2_login();
    P3_resetPassword resetPassword = new P3_resetPassword();

    @And("navigates to forget password page.")
    public void navigates_to_forget_password_page() throws InterruptedException {
        driver.navigate().to("https://demo.nopcommerce.com/passwordrecovery");
        Thread.sleep(3000);
    }

    @When("user enters a valid Email.")
    public void user_enters_a_valid_email_address() {
        login.emailTxtFld().sendKeys("tester@yahoo.com");
    }

    @When("user enters an invalid Email.")
    public void user_enters_an_invalid_email_address() {
        login.emailTxtFld().sendKeys("tester@gmail.com");
    }

    @And("user clicks on recover button.")
    public void user_press_on_recover_button() throws InterruptedException {
        resetPassword.recoverPasswordButton().click();
        Thread.sleep(3000);
    }

    @Then("user could reset password successfully.")
    public void user_could_reset_password_successfully() {
        String actualResult = resetPassword.resetPasswordSuccessfully().getText();
        String expectedResult = "Email with instructions has been sent to you.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @Then("user could not reset password successfully.")
    public void user_should_not_be_able_to_reset_password() {
        String actualResult = resetPassword.couldNotResetPasswordSuccessfully().getText();
        String expectedResult = "Email not found.";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
