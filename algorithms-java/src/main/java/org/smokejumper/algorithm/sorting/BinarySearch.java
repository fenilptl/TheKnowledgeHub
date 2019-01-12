package org.smokejumper.algorithm.sorting;

import org.smokejumper.algorithm.utility.DataProvider;

/*
 * This is better then linear search.
 * Prerequisite: Needs the input list as sorted.
 * Limitation: Doesn't work when there are duplicates in the list.
 */

public class BinarySearch {
	
	DataProvider dataProvider = new DataProvider();
	
	public static void main(String[] args) {
		BinarySearch search = new BinarySearch();
		search.performSearch();
	}

	private void performSearch() {
		int[] theArray = dataProvider.getIntegerArrayWithOutDup(20, 25, 50);
		
		System.out.println("Initial Array");
		dataProvider.printArray(theArray);

		performSearch( theArray, 31 );		
	}

	public void performSearch(int[] theArray, int theNumber) {
		// To Do
	}
}
