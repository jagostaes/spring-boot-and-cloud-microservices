package be.jagostaes.app.ws.mobileappws.ui.controller;

import be.jagostaes.app.ws.mobileappws.ui.model.request.UserDetailsRequestModel;
import be.jagostaes.app.ws.mobileappws.ui.model.response.UserRest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {

    @GetMapping
    public String getUsers(@RequestParam(value = "page", defaultValue = "1") int page,
                           @RequestParam(value = "limit", defaultValue = "50") int limit,
                           @RequestParam(value = "sort",defaultValue ="desc", required = false) String sort) {
        return "get user was called with page = " + page + " and limit = " + limit + " and sort = " + sort;
    }

    @GetMapping(path = "/{userId}",
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
                    } )
    public ResponseEntity<UserRest> getUser(@PathVariable String userId){
        UserRest returnValue = new UserRest();
        returnValue.setFirstname("Jago");
        returnValue.setLastname("Staes");
        returnValue.setEmail("jago.staes@gmail.com");

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PostMapping(
            consumes = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
            },
            produces = {
                    MediaType.APPLICATION_XML_VALUE,
                    MediaType.APPLICATION_JSON_VALUE
                    } )
    public ResponseEntity<UserRest> createUser(@RequestBody UserDetailsRequestModel userDetails){
        UserRest returnValue = new UserRest();
        returnValue.setFirstname(userDetails.getFirstName());
        returnValue.setLastname(userDetails.getLastName());
        returnValue.setEmail(userDetails.getEmail());

        return new ResponseEntity<UserRest>(returnValue, HttpStatus.OK);
    }

    @PutMapping
    public String updateUser(){
        return "update user was called";
    }

    @DeleteMapping
    public String deleteUser(){
        return "delete user was called";
    }
}
