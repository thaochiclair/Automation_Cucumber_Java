package origin.company.project.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class RestClient {
    public static Response doPostRequestWithPayLoad(String requestPath, ContentType contentType, Object body) {
        return given()
                .log()
                .everything()
                .contentType(contentType)
                .with()
                .accept(contentType)
                .body(body)
                .when()
                .post(requestPath)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    public static Response doGetRequestWithParams(String requestPath, Map<String, String> params, ContentType contentType) {
        return given()
                .queryParams(params)
                .log()
                .everything()
                .contentType(contentType)
                .with()
                .accept(contentType)
                .when()
                .get(requestPath)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    public static Response doPutRequestWithPayLoad(String requestPath, ContentType contentType, Object body) {
        return given()
                .log()
                .everything()
                .contentType(contentType)
                .with()
                .accept(contentType)
                .body(body)
                .when()
                .put(requestPath)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }

    public static Response doDeleteRequestWithPathParams(String requestPath) {
        return given()
                .log()
                .everything()
                .with()
                .when()
                .delete(requestPath)
                .then()
                .log()
                .all()
                .extract()
                .response();
    }
}
