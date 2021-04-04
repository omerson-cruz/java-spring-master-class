package com.springdemo.sample.project.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named 
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao someCDIDAO;
	
	// These are Setter and Getter Injection 
	public SomeCdiDao getSomeCDIDAO() {
		return someCDIDAO;
	}

	public void setSomeCDIDAO(SomeCdiDao someCDIDAO) {
		this.someCDIDAO = someCDIDAO;
	}

	
	
}
