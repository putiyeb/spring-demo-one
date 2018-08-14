package com.yhiblog.springdemo;

import org.springframework.stereotype.Component;

@Component("mySillyCoach")
public class SillyCoach implements Coach {
	
	private FortuneService fortuneService;
	
	private int i;
	
	public void setI(int i) {
		this.i = i;
	}
	
	public int getI() {
		return i;
	}
	
	public SillyCoach() {
		
	}
	
	public SillyCoach(FortuneService fortuneService) {
		// TODO Auto-generated constructor stub
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 80 minutes on batting pratice";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "annotation"/* + fortuneService.getFortune()*/;
	}
	
	// add a init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach: inside doMyCleanupStuff");
	}
	
}
