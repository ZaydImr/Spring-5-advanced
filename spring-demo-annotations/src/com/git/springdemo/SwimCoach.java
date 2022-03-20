package com.git.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;

	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("Email : "+ email);
		System.out.println("Team : "+ team);
		return "Swim coach daily workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
