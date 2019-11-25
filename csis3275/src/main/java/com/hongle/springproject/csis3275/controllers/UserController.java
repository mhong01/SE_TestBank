package com.hongle.springproject.csis3275.controllers;

import com.hongle.springproject.csis3275.model.User;
import com.hongle.springproject.csis3275.services.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
