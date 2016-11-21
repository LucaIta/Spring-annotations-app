package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach") // this is the annotation that tells Spring to register this bean
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backend volley";
	}

}
