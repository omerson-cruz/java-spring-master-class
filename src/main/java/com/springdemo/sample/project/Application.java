package com.springdemo.sample.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	
	
	public static void main(String[] args) {
		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		int result = binarySearchImpl.binarySearch(new int[] {12, 4, 6}, 0);
		
		System.out.println(result);
		
//		SpringApplication.run(Application.class, args);
	}

}
