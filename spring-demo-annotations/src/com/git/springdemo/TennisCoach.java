package com.git.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public TennisCoach() {
		System.out.println(">> Inside Tennis default constructor");
	}
	
	/*
	// define a setter method
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	
	// define my init method
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println(">> TennisCoach : inside of doMyStartUpStuff()");
	}
	
	// define my destroy method
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println(">> TennisCoach : inside of doMyCleanUpStuff()");
	}

	@Override
	public String getDailyWorkout() {
		System.out.println("Email : "+email+" , Team : "+team);
		return "Tennis Coach Daily Workout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
