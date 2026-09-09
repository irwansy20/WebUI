package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {

    WebDriver web;

    By usernameText = By.cssSelector("input#user-name");
    By password = By.cssSelector("input#password");
    By button = By.id("login-button");

    public LoginPage(WebDriver web){
        this.web = web ;
    }

    public void goLogin(){
        web.get("https://www.saucedemo.com/");
    }
    public void inputUsername(String user){
        web.findElement(usernameText).sendKeys(user);
    }

    public void iputPass(String pass){
        web.findElement(password).sendKeys(pass);
    }

    public void clickLogin(){
        web.findElement(button).click();
    }

    public void errorMessage(String error) {
        assertTrue(web.getPageSource().contains(error));
    }

    public void errorMessageIfBlank(String errormsg) {
        assertTrue(web.getPageSource().contains(errormsg));
    }
}
