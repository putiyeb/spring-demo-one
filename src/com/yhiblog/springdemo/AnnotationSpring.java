package com.yhiblog.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationSpring {

	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("annotationContext.xml");
		
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("mySillyCoach", Coach.class);
		
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());

		System.out.println(theCoach);
		//close the context 

		context.close();
	}

}
