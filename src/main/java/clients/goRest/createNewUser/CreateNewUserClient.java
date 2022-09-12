package clients.goRest.createNewUser;

import clients.goRest.createNewUser.request.CreateNewUserRequest;
import clients.goRest.createNewUser.response.CreateNewUserResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;

public class CreateNewUserClient {
    public CreateNewUserResponse createNewUser(CreateNewUserRequest createNewUserRequest) {


        String url = String.format("%s/users", SampleApiProperties.baseUrl);

        Response response = given()
                .header("Authorization", "Bearer e286853588adefeb34787414f93613bf30c5d4587e1ec9b988bbd4e3ba7dab00")
                .when()
                .contentType(ContentType.JSON)
                .body(createNewUserRequest)
                .post(url);

        CreateNewUserResponse createNewUserResponse = response.as(CreateNewUserResponse.class);
        createNewUserResponse.setHttpStatusCode(response.getStatusCode());
        return createNewUserResponse;
    }
}
