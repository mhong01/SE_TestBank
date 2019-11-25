package com.springproject.csis3275.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springproject.csis3275.model.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {

//	List<Question> findQuestionById(int id);
}
