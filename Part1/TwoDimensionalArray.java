package Part1;

import java.lang.reflect.Array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		int array1[][] = {{1,2,3}, {4,5,6}};
		
		/**
		 * 
		 * {123}
		 * {456}
		 * 
		 * 
		 * 2 rows
		 * 
		 * 3 different columns
		 * 
		 * 
		 */
		
		
		int array2[][] = {{1,2},{3},{4,5,6}};
		
		/**
		 * 
		 * {12}
		 * {3}
		 * {456}
		 * 
		 * 
		 * 3 rows
		 * 
		 * 2 columns for 1 
		 * 1 column for 2
		 * 3 columns for 3
		 * 
		 * 
		 */
		
		
		System.out.println("values in array1 by row are");
		outputArray(array1); //displays array1 by row
		
		
		System.out.println( "\nValues in array2 by row are" );
		outputArray(array2);
		
		
	}
	/**
	 * 
	 * @param array
	 * 
	 * every array is a dimenion of 1D arrays
	 */
	private static void outputArray(int array[][]) {
		/**
		 * 
		 * 
		 * Its common to do a nested for strucutre 
		 * for a multi dimensional array
		 * 
		 * 
		 */
		
		//itteratre for how many rows there are
		for (int row = 0; row < array.length; row++) { 
			
			//iterate through the columns, while 
			// less the column is less than the [row].length
			//
			//
			for (int column = 0; column < array[row].length; column++)
				System.out.printf("%d ", array[row][column]); 
			//you have two coniditons which then 
			// both need to do the system.out.println 
			
			System.out.println(); //print a new line character
		}
	}

}
