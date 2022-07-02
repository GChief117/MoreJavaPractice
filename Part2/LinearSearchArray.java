package Part2;

import java.util.Random;

public class LinearSearchArray {
	private int[] data;
	private static Random generator = new Random();
	
	
	//create array of given size and fill with random numbers
	public LinearSearchArray(int size) {
		data = new int[size]; //initalize array
		//fill the array with random ints in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	
	}//end linear array constructor
	
	
	
	
	
	
	public int linearSearch(int searchKey) {
		//loop throuh the array sequentially
		for (int index = 0; index < data.length; index++)
			if (data[index] == searchKey)
				return index;
		
		return -1; //if the integer was not found
		
	}
	
	
	
	
	
	//method to output values in array
	
	public String toString() {
		StringBuilder temporary = new StringBuilder();
		
		
		//itterating through array
		for(int element : data)
			temporary.append(element + " ");
		
		
		temporary.append("\n " ); //endline character
		return temporary.toString();
	}

}
