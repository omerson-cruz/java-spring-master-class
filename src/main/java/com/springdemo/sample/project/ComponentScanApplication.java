package com.springdemo.sample.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springdemo.sample.componentscan.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.springdemo.sample.componentscan")
public class ComponentScanApplication {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext =
				SpringApplication.run(ComponentScanApplication.class, args);
		
		ComponentDAO componentDAO =
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}", componentDAO.getJdbcConnection());

	}

}
