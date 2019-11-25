package com.springproject.csis3275.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.Module;
import com.springproject.csis3275.services.ModuleService;

@RestController
public class ModuleController {
	
	private ModuleService moduleService;
    public ModuleController(ModuleService moduleService) {
        this.moduleService = moduleService;
    }

    @RequestMapping("/api/modules/")
    public List<Module> findAllModules (){
    	return moduleService.findAll();
    }

}
