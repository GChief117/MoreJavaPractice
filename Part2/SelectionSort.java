/**
 * 
 */
package Part2;

import java.util.Random;

/**
 * @author gunnar_beck7
 *
 */
public class SelectionSort {

	private int[] data; //array of values
	private static Random generator = new Random();

	public SelectionSort(int size) {
		
		//create an array given size of integers
		data = new int[size];

		//add values in the array from 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	}

	/**
	 * Our sort value
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public void sort() {
		int smallest; //index of smallest element
		//loops through the data from first to last index
		for (int i = 0; i < data.length - 1; i++) {
			smallest = i; //the smallest is selected first

			
			//for when the smallest is slelected first,
			//we search through our array, for the next few integers
			/**
			 * 
			 * hence the plust one
			 * 
			 * and then compare each of the values to see which
			 * 
			 * index is in the smallest amount of data
			 * 
			 * 
			 */
			for (int index = i + 1; index < data.length; index++)
				if (data[index] < data[smallest])
					smallest = index;

			swap(i, smallest); // swap smallet element into position
			printPass(i + 1, smallest); // output pass of algoirthm
		}
	}
	
	
	/**
	 * This is our swap method
	 * with first and second as our parameters
	 * @param first
	 * @param second
	 */

	public void swap(int first, int second) {
		int temporary = data[first];  //store the first integer we found into a temporary space
		data[first] = data[second]; //since we have data being replaced based on indecie spaces we have first and second
		data[second] = temporary; //therefore, put temporary in second, since they are swapping positions
	}

	/*
	 * printing the pass method
	 */
	public void printPass(int pass, int index) {

		System.out.print(String.format("after pass %2d: ", pass));

		for (int i = 0; i < index; i++)
			System.out.print(data[i] + "   ");

		System.out.print(data[index] + "* ");

		// finish outputting array
		for (int i = index + 1; i < data.length; i++)
			System.out.print(data[i] + "  ");

		System.out.print("\n                  ");

		// indicate amount of array that is sorted
		for (int j = 0; j < pass; j++)
			System.out.print("--   ");
		System.out.println("\n");
	}

	public String toString() {
		StringBuilder temporary = new StringBuilder();

		/// iterate through array
		for (int element : data)
			temporary.append(element + "    ");

		temporary.append("\n");
		return temporary.toString();
	}

}
