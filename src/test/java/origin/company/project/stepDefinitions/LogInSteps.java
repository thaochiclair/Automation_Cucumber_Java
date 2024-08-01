package origin.company.project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import origin.company.project.requests.RequestFactory;
import origin.company.project.tests.TestBase;

import static org.junit.Assert.assertEquals;

public class LogInSteps extends TestBase {
    @When("I perform the POST request to log in the user")
    public void iPerformThePOSTRequestToLogInTheUser() {
        response = RequestFactory.add("https://api.realworld.io/api/users/login",requestBody);
    }

    @And("the user should signed in successfully into the system with the {string} as {string}")
    public void theUserShouldSignedInSuccessfullyIntoTheSystemWithTheAs(String fieldName, String value) {
        assertEquals(value, response.jsonPath().getString("user." + fieldName));
    }
}
