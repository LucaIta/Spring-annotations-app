package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // this is the annotation that tells Spring to register this bean
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
//	@Autowired // what I'm doing here is that I'm autowiring it instead of telling by ID what dependency to inject with the config file
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println(">> inside default constructor");
	}
	
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">> inside the setFortuneService() method");
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
