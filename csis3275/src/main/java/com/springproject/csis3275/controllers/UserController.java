package com.springproject.csis3275.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.services.UserService;

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
    
    @RequestMapping("/api/students/")
    public List<User> findAllStudents() {
        return userService.findAllStudents();
    }
}
