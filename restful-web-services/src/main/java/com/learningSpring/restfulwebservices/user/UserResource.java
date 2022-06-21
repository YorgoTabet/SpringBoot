package com.learningSpring.restfulwebservices.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserResource {


    @Autowired
    private UserDAO service;
    //Get /users
    // Retrieve All Users
    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return service.findAll();
    }

    //Retrieve User (int id)
    @GetMapping(path = "/users/{id}")
    public User getUser(@PathVariable int id){
        return service.findOne(id);
    }
    // Save user
    @PostMapping(path = "/users")
    public User addUser(@RequestBody User user){
        return service.save(user);
    }
}
