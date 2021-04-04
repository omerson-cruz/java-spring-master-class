package com.springdemo.sample.project.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	@Qualifier("bubble")

	private SortAlgorithm sortAlgorithm; 
	
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

	/* Using a SETTER INJECTION instead of the Constructor Injection */	
	// Implicitly it will do Setter Injection by default
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}	
//	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
//		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		
		// Search the array 
		// Return the result 
		
		return 3;
	}
//	
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("postConstruct");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("pre Destroy");
//	}
}
