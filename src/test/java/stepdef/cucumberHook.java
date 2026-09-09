package stepdef;

import base.baseTest;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;


public class cucumberHook extends baseTest {

    @Before
    public void beforeTest(){
        TestWeb();
    }

    @After
    public void afterTest(){
        driver.close();
    }
}
