package com.springproject.csis3275.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.TestModule;
import com.springproject.csis3275.repositories.TestModuleRepository;

@Service
public class TestModuleService {

	private TestModuleRepository testModuleRepository;

//	public List<TestModule> findTestModuleById (int id){
//		return testModuleRepository.findTestModuleById(id);
//	}
	
	public TestModuleService (TestModuleRepository testModuleRepository) {
		this.testModuleRepository = testModuleRepository;
	}
	
	public List<TestModule> findAllTestModule (){
		return testModuleRepository.findAll();
	}
	
	public boolean saveTestModule (TestModule testModule) {
		try {
			testModuleRepository.save(testModule);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
