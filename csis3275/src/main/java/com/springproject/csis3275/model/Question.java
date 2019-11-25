package com.springproject.csis3275.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Question")
public class Question {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int questionId;
	
	@ManyToOne
	@JoinColumn(name = "test_id")
	private TestModule testModule;
	
	private String description;
	
	private String options;
	
	private String answer;

	private double grade;
	
	private Date createdDate;

	public int getQuestionId() {
		return questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public TestModule getTestModule() {
		return testModule;
	}

	public void setTestModule(TestModule testId) {
		this.testModule = testId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOptions() {
		return options;
	}

	public void setOptions(String options) {
		this.options = options;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	
}
