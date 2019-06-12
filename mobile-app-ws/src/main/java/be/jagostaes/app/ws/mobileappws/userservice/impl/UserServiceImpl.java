package be.jagostaes.app.ws.mobileappws.userservice.impl;

import be.jagostaes.app.ws.mobileappws.shared.Utils;
import be.jagostaes.app.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import be.jagostaes.app.ws.mobileappws.ui.model.response.UserRest;
import be.jagostaes.app.ws.mobileappws.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    Map<String, UserRest> users;
    Utils utils;

    public UserServiceImpl() {
    }

    @Autowired
    public UserServiceImpl(Utils utils) {
        this.utils = utils;
    }

    @Override
    public UserRest createUser(UserDetailsRequestModel userDetails) {
        UserRest returnValue = new UserRest();
        returnValue.setFirstname(userDetails.getFirstName());
        returnValue.setLastname(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        String userId = utils.generateUserId();
        returnValue.setUserId(userId);

        if (users == null) users = new HashMap<>();
        users.put(userId, returnValue);

        return returnValue;
    }
}
