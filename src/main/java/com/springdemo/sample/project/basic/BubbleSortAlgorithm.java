package com.springdemo.sample.project.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
		
	public BubbleSortAlgorithm() {
		super();
	}

	public int[] sort(int[] numbers) {
		// Logic for bubble sort
		
		return numbers;
	}
}
