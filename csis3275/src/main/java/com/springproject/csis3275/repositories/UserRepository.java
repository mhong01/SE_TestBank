package com.springproject.csis3275.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.csis3275.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	List<User> findUserById(int id);
}
