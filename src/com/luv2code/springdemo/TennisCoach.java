package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component // this is the annotation that tells Spring to register this bean
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneServiceFromFile")
	private FortuneService fortuneService;
	
//	@Autowired // what I'm doing here is that I'm autowiring it instead of telling by ID what dependency to inject with the config file
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
//	@Autowired
//	public void defineFortineService(FortuneService theFortuneService) { // this is a setter method with a different name to test that it works anyway
//		System.out.println(">> inside the defineFortineService() method");
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
