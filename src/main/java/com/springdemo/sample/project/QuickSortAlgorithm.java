package com.springdemo.sample.project;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// Logic for quick sort
		return numbers;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		// TODO Auto-generated method stub
		return 0;
	}
}
