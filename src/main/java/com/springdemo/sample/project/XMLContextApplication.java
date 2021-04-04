package com.springdemo.sample.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.sample.project.basic.BinarySearchImpl;
import com.springdemo.sample.project.xml.XmlPersonDAO;
import com.springdemo.sample.componentscan.ComponentDAO;



/*
 * Using XML configuration instead of Java Spring
 * 
 */
public class XMLContextApplication {
	
	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("applicationContext.xml"))
		{
			XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);
			

			System.out.println(personDao);
			
			System.out.println(personDao.getXmlJdbcConnection());

			
			// when using the "try { }" block we dont need to close the "applicationContext" using the Spring Core
			// it is similar to the "using" block of the C# .NET. try {} block implements the auto closable interface
			//		applicationContext.close();  
			
			
		}
		
		

		
	}

}
