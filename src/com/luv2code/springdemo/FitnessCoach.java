package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class FitnessCoach implements Coach {
	
	HappyFortuneService happyFortuneService;

	@Override
	public String getDailyWorkout() {
		return "Run for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}


}
