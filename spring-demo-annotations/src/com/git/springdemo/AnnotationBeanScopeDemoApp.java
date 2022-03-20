package com.git.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retreive bean from spring container
		Coach coach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		// check if they are the same
		boolean result = (coach == alphaCoach);
		
		// print results
		System.out.println("Pointing the same object : "+result);
		System.out.println("theCoach : "+coach);
		System.out.println("alphaCoach : "+alphaCoach);
		
	}	

}
