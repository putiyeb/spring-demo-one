package com.yhiblog.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach myCoach = context.getBean("myCricketCoach", Coach.class);
		
		CricketCoach myCricketCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		System.out.println(myCoach.getDailyFortune());
		System.out.println(myCricketCoach.getDailyWorkout());
		
		System.out.println(myCricketCoach.getEmail());
		System.out.println(myCricketCoach.getName());
		
		context.close();
	}

}
