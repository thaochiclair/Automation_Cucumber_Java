package origin.company.project.requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RequestFactory {
    public static Response add(String path, Object requestPayload) {
        Response res = RestClient.doPostRequestWithPayLoad(path, ContentType.JSON, requestPayload);
        return res;
    }

    public static Response get(String path, Map<String, String> params) {
        Response resget = RestClient.doGetRequestWithParams(path, params, ContentType.JSON);
        return resget;
    }

    public static Response update(String path, Object requestPayload) {
        Response resupdate = RestClient.doPutRequestWithPayLoad(path, ContentType.JSON, requestPayload);
        return resupdate;
    }

    public static Response delete(String path) {
        Response resdelete = RestClient.doDeleteRequestWithPathParams(path);
        return resdelete;
    }
}
