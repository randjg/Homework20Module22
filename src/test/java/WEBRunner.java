import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"WEB/stepDef"},
        features = {"src/test/resources/WEB"}
)

public class WEBRunner {
}
