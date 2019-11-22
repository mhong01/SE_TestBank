package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testbank.model.Module;

@Repository
public interface ModuleRepository extends JpaRepository<Module, Integer>{

	List<Module> findCourseById (int id);
}
