package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketBallCoachConfig
{
	
	@Bean
	public FortuneService basketBallFortuneService() {
		return new BasketBallFortuneService();
	}
	
	@Bean
	public BasketBallCoach basketBallCoach() {
		return new BasketBallCoach(basketBallFortuneService());
	}

}
