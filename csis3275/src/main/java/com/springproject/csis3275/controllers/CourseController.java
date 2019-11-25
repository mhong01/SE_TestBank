package com.springproject.csis3275.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CourseController {
	
//	@Autowired
//	private CourseService courseService;
	
	@RequestMapping("/")
	public String indexAction(Model model) {
		return "Hello";
	}
	
}
