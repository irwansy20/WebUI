package stepdef;

import base.baseTest;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import page.LoginPage;


public class loginStepDef extends baseTest {

    LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goLogin();
    }

    @When("user input username text box with {string}")
    public void userInputUsername(String username) {
       loginPage.inputUsername(username);
    }

    @When("user input password text box with {string}")
    public void userInputPassword(String password) {
        loginPage.iputPass(password);
    }

    @When("user click login button")
    public void userClickLoginButton() {
       loginPage.clickLogin();
    }

    @Then("user see error message {string}")
    public void userSeeErrorMessage(String error) {
        loginPage.errorMessage(error);
    }

    @Then("user see error message if blank {string}")
    public void userSeeErrorMessageIfBlank(String errormsg) {
        loginPage.errorMessageIfBlank(errormsg);
    }
}