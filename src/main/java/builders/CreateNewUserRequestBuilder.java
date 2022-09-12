package builders;

import clients.goRest.createNewUser.request.CreateNewUserRequest;
import org.apache.commons.lang3.RandomStringUtils;

public class CreateNewUserRequestBuilder {
    public CreateNewUserRequest createNewUserRequest;

    public CreateNewUserRequestBuilder() {
        createNewUserRequest = new CreateNewUserRequest();
        createNewUserRequest.setName(getName());
        createNewUserRequest.setEmail(getEmailId());
        createNewUserRequest.setGender("male");
        createNewUserRequest.setStatus("active");
    }

    public CreateNewUserRequest build() {
        return createNewUserRequest;
    }
    public static String getName() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return ("Jo" + generatedString);
    }

    public static String getEmailId() {
        String generatedString = RandomStringUtils.randomAlphabetic(1);
        return (getName() + generatedString + ".hot@gorest.co.in");
    }


}
