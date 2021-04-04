package com.springdemo.sample.project;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springdemo.sample.project.basic.BinarySearchImpl;
import com.springdemo.sample.project.properties.SomeExternalService;
import com.springdemo.sample.componentscan.ComponentDAO;

@Configuration
@ComponentScan
//app.properties 
@PropertySource("classpath:app.properties")
public class PropertiesApplication {
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());  // spring will do this thing automagically
		
		// Application Context; ==> will maintain all of the Beans
		
//		SpringApplication.run will return an aApplication Context
		
//		ApplicationContext applicationContext =
//				SpringApplication.run(Application.class, args);

		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(PropertiesApplication.class))
		{
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			
			SomeExternalService service = applicationContext.getBean(SomeExternalService.class);
			
			System.out.println(service);
			System.out.println("environment configuration variable " + service.returnServiceURL());			
		}

	}

}
