package com.springdemo.sample.project.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm{
	public int[] sort(int[] numbers) {
		// Logic for quick sort
		return numbers;
	}
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		return 0;
	}
}
