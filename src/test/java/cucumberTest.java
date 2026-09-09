import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"stepdef"},
        features = {"src/test/resources"},
        plugin = {"pretty","html:report/hasil-test.html", "json:report/hasil-test.json"}
)
public class cucumberTest {

}
