package com.springproject.csis3275.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.Course;
import com.springproject.csis3275.repositories.CourseRepository;

@Service
public class CourseService{

	private CourseRepository courseRepository;
	
	public CourseService (CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}
	
//	public List<Course> findCourseById (int courseId) {
//		return courseRepository.findCourseById(courseId);
//	}
	
	public List<Course> findCourseByCourseCode (String courseCode){
		return courseRepository.findCoursesByCourseCode(courseCode);
	}
	
	public List<Course> findAllCourses(){
		return courseRepository.findAll();
	}
	
	public boolean saveCourse (Course course) {
		try {
			courseRepository.save(course);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
