package com.yhiblog.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		theCoach = context.getBean("myCoach2", Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		BaseballCoach theCoach3 = context.getBean("myCoach2", BaseballCoach.class);
		BaseballCoach theCoach2 = context.getBean("myCoach2", BaseballCoach.class);
		
		theCoach3.setI(5);
		theCoach2.setI(15);
		

		TrackCoach theCoach4 = context.getBean("myCoach", TrackCoach.class);
		TrackCoach theCoach5 = context.getBean("myCoach", TrackCoach.class);
		
		context.close();
		theCoach4.setI(225);
		theCoach5.setI(225);
		
		System.out.println(theCoach2.getI());
		System.out.println(theCoach3.getI());
		System.out.println(theCoach2 == theCoach3);
		System.out.println(theCoach4.getI());
		System.out.println(theCoach5.getI());
		System.out.println(theCoach4 == theCoach5);
		
		System.out.println(theCoach2);
		System.out.println(theCoach3);
		System.out.println(theCoach4);
		System.out.println(theCoach5);
		//close the context 


	}

}
