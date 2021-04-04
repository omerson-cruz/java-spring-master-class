package com.springdemo.sample.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springdemo.sample.project.scope.ComponentDAO;

@SpringBootApplication
@ComponentScan("com.springdemo.sample.project.scope")
public class ScopeApplication {
	
	
	private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext =
				SpringApplication.run(ScopeApplication.class, args);
		
		ComponentDAO personDAO =
				applicationContext.getBean(ComponentDAO.class);
		
		ComponentDAO personDAO2 =
				applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", personDAO);
		LOGGER.info("{}", personDAO.getJdbcConnection());
		
		
		LOGGER.info("{}", personDAO2);
		LOGGER.info("{}", personDAO2.getJdbcConnection());


	}

}
