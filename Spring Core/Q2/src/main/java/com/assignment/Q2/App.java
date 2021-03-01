package com.assignment.Q2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	private static ApplicationContext context;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		context = new ClassPathXmlApplicationContext("spring-config.xml");
        Questions questions= (Questions)context.getBean("questions");
        System.out.println("Question Id : " +questions.getQuestionId());
        System.out.println("Question : " +questions.getQuestion());
        System.out.println("Answers : " +questions.getAnswers());
	}

}
