package clientsTests.unitTests;

import clients.goRest.getUserByID.GetAllUsersClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.testng.annotations.Test;

import java.util.Map;

public class GetAllUsersTest {

    @Test
    public void getAllUsersTest() throws JsonProcessingException {

        Map<String,Object> mapResponse= new GetAllUsersClient().getAllUsers();

        Map<String,Object> firstResponse = (Map<String, Object>)mapResponse.get(0);

       // String jsonResult = new ObjectMapper().writeValueAsString(getAllUsersResponse);
        System.out.println(firstResponse);











    }}
