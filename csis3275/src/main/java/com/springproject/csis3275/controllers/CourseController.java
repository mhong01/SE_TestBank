package com.springproject.csis3275.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.Course;
import com.springproject.csis3275.services.CourseService;

@RestController
public class CourseController {
	
	private CourseService courseService;
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }
	
	@RequestMapping("/api/courses/")
	public List<Course> getCourses(Course courseØ) {
		
		return courseService.findAllCourses();
	}
	
}
