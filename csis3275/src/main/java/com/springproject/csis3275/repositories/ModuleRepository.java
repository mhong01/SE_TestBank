package com.springproject.csis3275.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.csis3275.model.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer>{

	List<Module> findModuleById (int id);
}
