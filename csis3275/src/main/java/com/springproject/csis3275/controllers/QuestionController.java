package com.springproject.csis3275.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springproject.csis3275.model.Question;
import com.springproject.csis3275.services.QuestionService;

@RestController
public class QuestionController {
	
	private QuestionService questionService;
	
	public QuestionController (QuestionService questionService) {
		this.questionService = questionService;
	}

	@RequestMapping("/api/questions/")
	public List<Question> getAllQuestions(){
		return questionService.getAllQuestions();
	}
}
