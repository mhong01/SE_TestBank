package com.springproject.csis3275.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.TestModule;
import com.springproject.csis3275.services.TestModuleService;

@RestController
public class TestModuleController{

	private TestModuleService testModuleService;
	
	public TestModuleController (TestModuleService testModuleService) {
		this.testModuleService = testModuleService;
	}
	
	@RequestMapping("/api/testmodules/")
	public List<TestModule> getAllTestModules(){
		return testModuleService.findAllTestModule();
	}

}
