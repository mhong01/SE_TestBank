package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TestModuleRepository extends JpaRepository<TestModuleRepository, Integer>{
	
	List<TestModuleRepository> findTestModuleById(int id);
}
