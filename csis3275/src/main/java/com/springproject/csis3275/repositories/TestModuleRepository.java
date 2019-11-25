package com.springproject.csis3275.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.csis3275.model.TestModule;


@Repository
public interface TestModuleRepository extends JpaRepository<TestModule, Integer>{
	
	List<TestModule> findTestModuleById(int id);
}
