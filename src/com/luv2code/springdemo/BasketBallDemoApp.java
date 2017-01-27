package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasketBallDemoApp
{
   	public static void main(String[] args) {
   	
   	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BasketBallCoachConfig.class);
   
   	// retrieve the bean
   	Coach theCoach = context.getBean("basketBallCoach", Coach.class);
   	
   	// run methods
   	System.out.println(theCoach.getDailyWorkout());
   	System.out.println(theCoach.getDailyFortune());
   	
   	// close context
   	context.close();
	}
}
