package origin.company.project.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import origin.company.project.tests.TestBase;

import static org.junit.Assert.assertEquals;

public class CommonSteps extends TestBase {

    @Then("the status code {int} should return")
    public void theStatusCodeShouldReturn(int statusCode) {
        assertEquals(statusCode, response.getStatusCode());
    }


}
