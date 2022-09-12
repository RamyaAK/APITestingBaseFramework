package clientsTests.unitTests.GetUsersByIDTest;

import builders.CreateNewUserRequestBuilder;
import clients.goRest.createNewUser.CreateNewUserClient;
import clients.goRest.createNewUser.request.CreateNewUserRequest;
import clients.goRest.createNewUser.response.CreateNewUserResponse;
import clients.goRest.getUserByID.GetUserByIDClient;
import clients.goRest.getUserByID.response.GetUserByIDResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetUserByIDTest {
    @Test
    public void testGetUserByID() throws JsonProcessingException {

        // create a new user and fetch that same user by ID

        CreateNewUserRequest  createNewUserRequest = new CreateNewUserRequestBuilder().build();
        CreateNewUserResponse createNewUserResponse = new CreateNewUserClient().createNewUser(createNewUserRequest);

        System.out.println("UserId= "+createNewUserResponse.getId());

        GetUserByIDResponse getUserByIDResponse = new GetUserByIDClient().getUserDetailsByID(createNewUserResponse.getId());

        String jsonResult = new ObjectMapper().writeValueAsString(getUserByIDResponse);

        System.out.println(jsonResult);

        Assert.assertEquals(getUserByIDResponse.getStatus(), "active");
        Assert.assertEquals(getUserByIDResponse.getHttpStatusCode(),200);
    }
}
