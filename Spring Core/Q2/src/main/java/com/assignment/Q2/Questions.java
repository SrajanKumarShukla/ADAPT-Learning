package com.assignment.Q2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Questions {
	private int questionId;
	private String question;
//	common code
	public int getQuestionId() {
		return questionId;
	}
	public void setQuestionId(int questionId) {
		this.questionId=questionId;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question=question;
	}
//	List injection
//	private List<String> answers;
//	public List<String> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(List<String> answers) {
//		this.answers = answers;
//	}
//	Set injection
//	private Set<String> answers;
//	public Set<String> getAnswers() {
//		return answers;
//	}
//	public void setAnswers(Set<String> answers) {
//		this.answers = answers;
//	}
//	Map injection
	private Map<String,String> answers;
	public Map<String,String> getAnswers() {
		return answers;
	}
	public void setAnswers(Map<String,String> answers) {
		this.answers = answers;
	}
	
}
