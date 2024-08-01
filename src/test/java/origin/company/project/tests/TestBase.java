package origin.company.project.tests;

import io.restassured.response.Response;
import static io.restassured.RestAssured.baseURI;

import java.util.Map;

public class TestBase {

    protected static Response response;
    protected static Map<String, Object> requestBody;
    public TestBase() {
        baseURI = "https://api.realworld.io/api";
    }


}
