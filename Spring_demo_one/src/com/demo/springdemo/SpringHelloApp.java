package com.demo.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

	public static void main(String[] args) {
		// Step 1:Load the spring configuration file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// Step 2:retrieve bean from spring container
		Coach theCoach=context.getBean("baseball",Coach.class);
	
		// Step 3:call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// Step 4:close the context
		context.close();
	}
	
}
