package com.springdemo.sample.project;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.springdemo.sample.project.basic.BinarySearchImpl;
import com.springdemo.sample.componentscan.ComponentDAO;

@Configuration
@ComponentScan
public class Application {
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());  // spring will do this thing automagically
		
		// Application Context; ==> will maintain all of the Beans
		
//		SpringApplication.run will return an aApplication Context
		
//		ApplicationContext applicationContext =
//				SpringApplication.run(Application.class, args);

		try (AnnotationConfigApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(Application.class))
		{
			BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
			
			int result = binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 0);
			
			System.out.println(result);
// Output: 
//	com.springdemo.sample.project.BubbleSortAlgorithm@450794b4
//	3

			ComponentDAO componentDAO = new ComponentDAO();
			System.out.println(componentDAO);
			
			// when using the "try { }" block we dont need to close the "applicationContext" using the Spring Core
			// it is similar to the "using" block of the C# .NET. try {} block implements the auto closable interface
			//		applicationContext.close();  
			
			
		}
		
		

		
	}

}
