package origin.company.project.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import origin.company.project.requests.RequestFactory;
import origin.company.project.tests.TestBase;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class SignUpSteps extends TestBase {

    @Given("the user registration details with username as {string}, and password as {string}, and email as {string}")
    public void registerValidUsernamePw(String username, String password, String email) {
        requestBody = new HashMap<>();
        Map<String, String> user = new HashMap<>();
        user.put("username", username);
        user.put("email", email);
        user.put("password", password);
        requestBody.put("user",user);
    }

    @When("I perform the POST request to register the user")
    public void iPerformThePOSTRequestToRegisterTheUser() {
        response = RequestFactory.add("/users",requestBody);
    }

    @And("the user should be registered successfully with the {string} as {string}")
    public void theUserShouldBeRegisteredSuccessfullyWithTheAs(String fieldName, String value ) {
        assertEquals(value, response.jsonPath().getString("user." + fieldName));
    }


}
