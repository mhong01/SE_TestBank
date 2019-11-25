package com.hongle.springproject.csis3275.services;

import com.hongle.springproject.csis3275.model.User;
import com.hongle.springproject.csis3275.repositories.UserRepository;
import org.springframework.stereotype.Service;

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
