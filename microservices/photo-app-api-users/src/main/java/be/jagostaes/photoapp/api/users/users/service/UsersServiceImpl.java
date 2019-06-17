package be.jagostaes.photoapp.api.users.users.service;

import be.jagostaes.photoapp.api.users.users.shared.UserDto;

import java.util.UUID;

public class UsersServiceImpl implements UsersService {
    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());

        return null;
    }
}
