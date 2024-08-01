package origin.company.project.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "origin/company/project/stepDefinitions",
        plugin = {
                "pretty",
                "html:test-output.html",
                "json:target/cucumber-report/cucumber.json"
        }
)

public class TestRunner {


}
