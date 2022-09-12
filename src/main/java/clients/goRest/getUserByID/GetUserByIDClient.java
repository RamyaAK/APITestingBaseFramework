package clients.goRest.getUserByID;

import clients.goRest.getUserByID.response.GetUserByIDResponse;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import properties.SampleApiProperties;

import static io.restassured.RestAssured.given;

public class GetUserByIDClient {


    String url = String.format("%s/users/", SampleApiProperties.baseUrl);

    public GetUserByIDResponse getUserDetailsByID(int userID) {

        Response response = given()
                .header("Authorization", "Bearer e286853588adefeb34787414f93613bf30c5d4587e1ec9b988bbd4e3ba7dab00")
                .contentType(ContentType.JSON)
                .when()
                .get(url+userID);
        System.out.println(url);
        GetUserByIDResponse getUserByIDResponse = response.as(GetUserByIDResponse.class);
        getUserByIDResponse.setHttpStatusCode(response.getStatusCode());

        return getUserByIDResponse;
    }
}
