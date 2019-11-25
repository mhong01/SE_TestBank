package com.springproject.csis3275.services;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.repositories.UserRepository;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAllUsers() {
        return userRepository.findAll();
    }
}
