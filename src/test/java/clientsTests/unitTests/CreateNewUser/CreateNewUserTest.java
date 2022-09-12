package clientsTests.unitTests.CreateNewUser;

import builders.CreateNewUserRequestBuilder;
import clients.goRest.createNewUser.CreateNewUserClient;
import clients.goRest.createNewUser.request.CreateNewUserRequest;
import clients.goRest.createNewUser.response.CreateNewUserResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateNewUserTest {

    @Test
    public void createNewUserTest() throws JsonProcessingException {
        String jsonResult;

        CreateNewUserRequest createNewUserRequest = new CreateNewUserRequestBuilder().build();
        CreateNewUserResponse createNewUserResponse = new CreateNewUserClient().createNewUser(createNewUserRequest);

        jsonResult = new ObjectMapper().writeValueAsString(createNewUserResponse);
        System.out.println(jsonResult);

        Assert.assertEquals(createNewUserResponse.getHttpStatusCode(),201);
        Assert.assertEquals(createNewUserResponse.getStatus(), "active");
    }
}
