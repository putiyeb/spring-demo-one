package com.yhiblog.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String name;
	private String email;
	
	public void setName(String name) {
		System.out.println("CricketCoach: inside setter method: setName");
		this.name = name;
	}
	
	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method: setEmail");
		this.email = email;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}

	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}

	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method: setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Peatice fast bowling for 15 minutes today";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Cricket: " + fortuneService.getFortune();
	}
	

}
