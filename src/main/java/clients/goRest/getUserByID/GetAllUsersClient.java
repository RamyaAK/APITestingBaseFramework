package clients.goRest.getUserByID;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class GetAllUsersClient {
    String url = String.format("%s/users", SampleApiProperties.baseUrl);

    public Map<String,Object> getAllUsers(){
        List<Response> response = given()
                .header("Authorization", "Bearer e286853588adefeb34787414f93613bf30c5d4587e1ec9b988bbd4e3ba7dab00")
                .contentType(ContentType.JSON)
                .when()
                .get(url)
                .as(List.class);

        System.out.println(url);
        System.out.println(response.size());

        Map<String,Object> map = (Map<String, Object>)response;
        System.out.println(map);
        return map;
    }
}
