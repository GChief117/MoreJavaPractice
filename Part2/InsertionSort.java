/**
 * 
 */
package Part2;

import java.util.Random;

/**
 * @author gunnar_beck7
 *
 */
public class InsertionSort {

	private int[] data;// array of values
	private static Random gneerator = new Random();

	// create array of given size and fill with random integer
	public InsertionSort(int size) {
		data = new int[size];

		// fill array with random ints in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + gneerator.nextInt(90);

	}// ending the constructor

	// sort array using insertion sort
	public void sort() {
		int insert;// temporary holding value

		// loop over data.lkength - 1 elements
		for (int next = 1; next < data.length; next++) {
			// store the data vallue in current element
			insert = data[next];

			// initalize locaiton to place element
			int moveItem = next;

			// search for place to put current element
			while (moveItem > 0 && data[moveItem - 1] > insert) {
				// shift element right one slot
				data[moveItem] = data[moveItem - 1];
				moveItem--;
			} // end while

			data[moveItem] = insert; //place inserted element
			printPass(next, moveItem); //output pass of algorithm
		} //end for
	}//end sort method

	
	//print pass of algorithm 
	public void printPass(int pass, int index) {
		System.out.print(String.format("after pass %2d: ", pass));
		
		
		//output elements tll swapped item
		for(int i = 0; i < index; i++)
			System.out.print( data[ i ] + " " );
		
		
		System.out.print( data[ index ] + "* " ); //indicate swap
		
		//finish outputting array
		for(int i = index + 1; i < data.length; i++)
			System.out.print(data[i] + " ");
		
		
		System.out.print("\n                "); //for alignment
		
		
		//indicate amount of array that is sorted
		for(int i = 0; i <= pass; i++)
			System.out.print( "--  ");
		System.out.println("\n");
	}
	
	
	public String toString() {
		StringBuilder temporary = new StringBuilder();
		
		//iterate through array
		for (int element : data)
			temporary.append(element + " ");
		
		temporary.append("\n");
		return temporary.toString();
	}

}
