package com.springdemo.sample.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.springdemo.sample.project.cdi.SomeCdiBusiness;


@SpringBootApplication
@ComponentScan("com.springdemo.sample.project.cdi")
public class CdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext =
				SpringApplication.run(CdiApplication.class, args);
		
		SomeCdiBusiness business =
				applicationContext.getBean(SomeCdiBusiness.class);
		
		LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());

	}

}
