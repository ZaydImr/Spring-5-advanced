package com.git.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
		"Test 1",
		"Test 2",
		"Test 3"
	};
	
	private Random myRandom = new Random();
	
	@Override
	public String getFortune() {
		// pich a random string from the array
		int index = myRandom.nextInt(data.length);
		return data[index];
	}

}
