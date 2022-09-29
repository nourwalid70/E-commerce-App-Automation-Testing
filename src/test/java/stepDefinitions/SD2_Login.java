package stepDefinitions;


import commercePages.P2_login;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class SD2_Login {
    P2_login login = new P2_login();

    @And("navigates to login page.")
    public void navigates_to_login_page() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(3000);
    }

    @When("^user enters Email \"(.*)\"$")
    public void user_enters_Email(String email){
        login.emailTxtFld().sendKeys(email);
    }

    @And("^user enters password \"(.*)\"$")
    public void user_enters_password(String password){
        login.passwordTxtFld().sendKeys(password);
    }

    @And("user clicks on log in button.")
    public void user_clicks_on_login_button() throws InterruptedException {
        login.loginButton().click();
        Thread.sleep(3000);
    }

    @Then("user could login successfully.")
    public void user_could_login_successfully(){
        String actualResult = login.loginSuccessfully().getText();
        String expectedResult = "Log out";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @Then("user could not login successfully.")
    public void user_could_not_login_successfully(){
        String actualResult = login.loginErrorMsg().getText();
        String expectedResult = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }

    @And("user returned to home page.")
    public void user_returned_to_home_page(){
        String actualResult = Hooks.driver.getCurrentUrl();
        String expectedResult = "https://demo.nopcommerce.com/";
        Assert.assertTrue(actualResult.contains(expectedResult));
        Assert.assertEquals(actualResult.contains(expectedResult),true);
    }
}
