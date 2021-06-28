package org.example.spring_annotation;

import org.example.spring_annotation_demo.Coach;
import org.example.spring_annotation_demo.CricketCoach;
import org.example.spring_annotation_demo.Person;
import org.example.spring_annotation_demo.SwimmingCoach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
			/*
			 * Person person = context.getBean("person", Person.class);
			 * System.out.println(person);
			 * 
			 * person.setEmail("john@email.com"); person.setFirstName("john");
			 * person.setLastName("doe"); person.setPersonId(100);
			 * System.out.println(person);
			 */
			
			Coach thecoach=context.getBean("cricketCoach",CricketCoach.class);
			System.out.println(thecoach.getDailyworkOut());
			System.out.println(thecoach.getDailyFortune());

		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}