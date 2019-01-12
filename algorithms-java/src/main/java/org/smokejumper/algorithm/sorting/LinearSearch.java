package org.smokejumper.algorithm.sorting;

import org.smokejumper.algorithm.utility.DataProvider;

/*
 * This is the most basic search algorithm.
 * This works well even if there are duplicate values in the list.
 */

public class LinearSearch {
	
	DataProvider dataProvider = new DataProvider();
	
	public static void main(String[] args) {
		LinearSearch search = new LinearSearch();
		search.performSearch();
	}

	private void performSearch() {
		int[] theArray = dataProvider.getIntegerArray(20, 25, 50);
		
		System.out.println("Initial Array");
		dataProvider.printArray(theArray);

		performSearch( theArray, 31 );		
	}

	public void performSearch(int[] theArray, int theNumber) {
		boolean isNumberFound = false;
		String foundIndexes = new String();
		for( int index = 0; index < theArray.length; index++ ) {
			if ( theArray[index] == theNumber ) {
				isNumberFound = true;
				foundIndexes = foundIndexes + index + " ";
			}
		}
		
		if ( isNumberFound )
			System.out.println("The number is found at index : "+ foundIndexes );
		else
			System.out.println("Numner not found");
	}
}
