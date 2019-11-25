package com.springproject.csis3275.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.services.UserService;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/api/users/")
    public List<User> greeting() {
        return userService.findAllUsers();
    }
}
