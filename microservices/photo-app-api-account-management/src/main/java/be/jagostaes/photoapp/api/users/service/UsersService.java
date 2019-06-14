package be.jagostaes.photoapp.api.users.service;

import be.jagostaes.photoapp.api.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
