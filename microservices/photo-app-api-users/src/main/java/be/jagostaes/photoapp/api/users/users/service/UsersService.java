package be.jagostaes.photoapp.api.users.users.service;

import be.jagostaes.photoapp.api.users.users.shared.UserDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UsersService extends UserDetailsService {
    UserDto createUser(UserDto userDetails);
    UserDto getUserDetailsByEmail(String email);
}
