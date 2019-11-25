package com.springproject.csis3275.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.Module;
import com.springproject.csis3275.repositories.ModuleRepository;

@Service
public class ModuleService {

	private ModuleRepository moduleRepository;
	
//	public List<Module> findModuleById(int id){
//		return moduleRepository.findModuleById(id);
//	}
	
	public List<Module> findAll(){
		return moduleRepository.findAll();
	}
	
	public boolean saveModule(Module module) {
		try {
			moduleRepository.save(module);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}	
}
