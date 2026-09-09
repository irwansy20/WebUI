package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePage {

    private WebDriver web;

    By item = By.xpath("//*[@id=\"item_0_title_link\"]/div");

    public HomePage(WebDriver web) { this.web = web;}

    public void validate(){
        assertTrue(web.findElement(item).isDisplayed());
    }
}
