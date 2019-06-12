package be.jagostaes.app.ws.mobileappws.userservice;

import be.jagostaes.app.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import be.jagostaes.app.ws.mobileappws.ui.model.response.UserRest;

public interface UserService {
    UserRest createUser(UserDetailsRequestModel userDetails);
}
