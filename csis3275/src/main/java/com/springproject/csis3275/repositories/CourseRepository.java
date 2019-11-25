package com.springproject.csis3275.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.csis3275.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{

//	List<Course> findCourseById (int id);
	
	List<Course> findCoursesByCourseCode (String courseCode);
}
