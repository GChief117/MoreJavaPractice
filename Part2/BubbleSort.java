package Part2;

import java.util.Random;

public class BubbleSort {
	
	
	private int[] data;
	private static Random generator = new Random();
	
	
	public BubbleSort(int size) {
		
		//creating an array given size of integers
		data = new int[size];
		
		
		//add values in the array from 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	
		
	}
	
	
	/**
	 * 
	 * Bubble Sort
	 * 
	 * 
	 * 
	 */
	
	public void sort() {
		
		//beginning 
		//smallest integer
		int smallest = 0;
		
	
		
		//middle
		/**
		 * when the smallest is selected the smallest will
		 * 
		 * 
		 * "bubble" its way to the beginnign fo the array
		 * 
		 * 
		 * Meanwhile the 
		 * 
		 * 
		 * There are two nested for loops
		 * 
		 * 
		 * and 
		 * 
		 * 
		 * if a pair is increasing in order or the values are equal
		 * 
		 * the bubble sort leaves the values as they are
		 * 
		 * if a pair is in decreasing order
		 * 
		 * the bubble sort swaps their values in the aray
		 * 
		 * 
		 * 
		 * 
		 * The first pass compares teh two elements of the array
		 * 
		 * 
		 * and swaps the values if necessary, that is if the value compared on the left is smaller than the right
		 * 
		 * 
		 * 
		 * bottom of the array is the right
		 * 
		 * 
		 * top is hte lft
		 * 
		 * 
		 * 
		 * 
		 */
		
		//loops through the given array
		for(int i = 0; i < data.length - 1; i++)
			for(int j = 0; j < data.length - i - 1; j++)
				//data bieng compared from the left to the right directly
				if(data[j] > data[j + 1]) {
					int temporary = data[j]; //holding spot for the data value
					data[j] = data[j + 1]; 
					data[j + 1] = temporary;
					
				}
	
	
					
		
		
		//end
		
		
		
		
		
		
	}
	
	
	
	

}
