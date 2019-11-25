package com.springproject.csis3275.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springproject.csis3275.model.Question;
import com.springproject.csis3275.repositories.QuestionRepository;

@Service
public class QuestionService {

	private QuestionRepository questionRepository;
	
	public QuestionService (QuestionRepository repository) {
		this.questionRepository = repository;
	}
	
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}
}
