package org.smokejumper.algorithm.utility;

public class DataProvider {
	
	public int[] getIntegerArray( int size, int minRange, int maxRange ) {
		int[] theArray = new int[size];
		
		for (int index = 0; index < theArray.length; index++) {
			theArray[index] = (int)( Math.random() * ( maxRange - minRange) + 1) + minRange;
		}
		
		return theArray;
	}

	public int[] getIntegerArrayWithOutDup( int size, int minRange, int maxRange ) {
		// TODO To be implemented
		return null;
	}
	
	public void printArray( int[] theArray ) {
		for (int index = 0; index < theArray.length; index++) {
			System.out.print(theArray[index] + " ");
		}
		System.out.println("\n");
	}
}