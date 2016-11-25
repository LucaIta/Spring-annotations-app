package com.luv2code.springdemo;

import java.util.Properties;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneServiceFromFile implements FortuneService {

	@Value("${fortunes}")
	private String[] fortunes = {
	};
	
	Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.length);
		String fortune = fortunes[index];
		return fortune;
	}
	
	@PostConstruct
	public String readFortunes() {
		System.out.println("inside @PostConstruct method" + fortunes[0]);
		System.out.println("inside @PostConstruct method" + fortunes[1]);
		System.out.println("inside @PostConstruct method" + fortunes[2]);
		return null;
	}

}

//private String[] data = {
//		"Diligence if the mother of good luck",
//		"The journey is the reward",
//		"Beware of the wolf in sheep's clothing"
//	};