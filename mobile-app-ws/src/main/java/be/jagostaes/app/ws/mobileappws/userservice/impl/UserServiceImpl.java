package be.jagostaes.app.ws.mobileappws.userservice.impl;

import be.jagostaes.app.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import be.jagostaes.app.ws.mobileappws.ui.model.response.UserRest;
import be.jagostaes.app.ws.mobileappws.userservice.UserService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setFirstname(userDetails.getFirstName());
        returnValue.setLastname(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        String userId = UUID.randomUUID().toString();
        returnValue.setUserId(userId);

        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);

        return returnValue;
    }
}
