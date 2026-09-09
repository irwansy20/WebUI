package stepdef;

import base.baseTest;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import page.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class homeStepDef extends baseTest {

    HomePage homePage;

    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
        homePage = new HomePage(driver);
        homePage.validate();
        }
}
