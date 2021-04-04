package com.springdemo.sample.project.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class SomeExternalService {
	
	// get the value from property file
	@Value("${external.service.url}")
	private String url;
	
	public String returnServiceURL() {
		return url;
	}
}
