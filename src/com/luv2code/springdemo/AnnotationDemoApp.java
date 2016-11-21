package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		// get the bean from the spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach fitnessCoach = context.getBean("fitnessCoach", Coach.class);
		
		// call some method from the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(fitnessCoach.getDailyWorkout());
		
		// close the context
		context.close();
		
	}

}
