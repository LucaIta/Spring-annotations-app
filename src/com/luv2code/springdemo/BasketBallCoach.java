package com.luv2code.springdemo;

public class BasketBallCoach implements Coach
{
	
	private FortuneService theFortune;
	
	public BasketBallCoach(FortuneService myFortune) {
		theFortune = myFortune;
	}

	@Override
	public String getDailyWorkout(){
		return "practice things!";
	}

	@Override
	public String getDailyFortune(){
		return theFortune.getFortune();
	}

}
