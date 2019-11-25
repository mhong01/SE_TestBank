package com.springproject.csis3275.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.repositories.UserRepository;


@Service
public class UserService {

	private UserRepository userRepository;
	
	public List<User> findUserById (int id){
		return userRepository.findUserById(id);
	}
		
	public boolean saveUser(User user) {
		try {
			userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<User> findAllUsers() {
		
		return userRepository.findAll();
	}
	
}
