package com.springproject.csis3275.services;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Service;
import org.w3c.dom.stylesheets.LinkStyle;

import com.springproject.csis3275.model.User;
import com.springproject.csis3275.repositories.UserRepository;


@Service
public class UserService {

	private UserRepository userRepository;
	
	public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

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
	
	public List<User> findAllStudents(){
		List<User> allUsers = findAllUsers();
		List<User> students = new ArrayList<>();
		for (User user : allUsers) {
			if (user.getUserType() != 0) {
				students.add(user);
			}
		}
		return students;
	}
	
}
