package com.cognizant.spring_learn;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {


	public static void main(String[] args) {

//		displayCountry();
		SpringApplication.run(SpringLearnApplication.class);

	}

	public static String displayCountry() {

		ApplicationContext context =
				new ClassPathXmlApplicationContext("country.xml");

//		ApplicationContext context= new AnnotationConfigApplicationContext();
		Country country =
				context.getBean("country", Country.class);


		System.out.println(country);
		return country.toString();

	}
}
