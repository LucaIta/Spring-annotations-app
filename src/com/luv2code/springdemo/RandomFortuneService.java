package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
		"Diligence if the mother of good luck",
		"The journey is the reward",
		"Beware of the wolf in sheep's clothing"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];
		return myFortune;
	}

}
