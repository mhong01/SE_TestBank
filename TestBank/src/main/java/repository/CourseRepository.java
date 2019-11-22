package repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import testbank.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

	List<Course> findCourseById (int id);
}
