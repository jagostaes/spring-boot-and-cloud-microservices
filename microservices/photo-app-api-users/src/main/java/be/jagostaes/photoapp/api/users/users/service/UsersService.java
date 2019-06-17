package be.jagostaes.photoapp.api.users.users.service;

import be.jagostaes.photoapp.api.users.users.shared.UserDto;

public interface UsersService {
    UserDto createUser(UserDto userDetails);
}
