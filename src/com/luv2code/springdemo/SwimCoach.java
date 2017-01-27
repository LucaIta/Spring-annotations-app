package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	@Value("${foo.email}") // here I define which value to inject in the following variable, it will get it from "sport.properties" file. I think it gets it from whatever @PropertySource I define in the class where I have the context which retrieve this bean
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout()
	{
		return "Swim 1000 meters as a warmup";
	}

	@Override
	public String getDailyFortune()
	{
		return fortuneService.getFortune();
	}

	public String getEmail()
	{
		return email;
	}

	public String getTeam()
	{
		return team;
	}
	
	

}
