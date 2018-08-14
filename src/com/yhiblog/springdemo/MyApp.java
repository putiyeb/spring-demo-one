package com.yhiblog.springdemo;

public class MyApp {

	public static void main(String[] args) {
		// create the object
		
		Coach theCoach = new BaseballCoach();
		
		// use the object
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
//		theCoach = new TrackCoach();
		
//		System.out.println(theCoach.getDailyWorkout());

	}

}
