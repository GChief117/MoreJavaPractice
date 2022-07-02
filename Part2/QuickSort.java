/**
 * 
 */
package Part2;

import java.util.Random;

/**
 * @author gunnar_beck7
 * 
 * 
 * 
 *         Quicksort contains 2 steps:
 * 
 *         The partioning step
 * 
 *         and
 *         the recursive step
 *
 */
public class QuickSort {

	private int[] data; // array of values
	private static Random generator = new Random();

	public QuickSort(int size) {

		// create an array given size of integers
		data = new int[size];

		// add values in the array from 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	}

	// out quick sort algoirhtm

	public void quickSort(int[] array, int left, int right) {
		int index = partion(array, left, right);
		if (left < index - 1) {
			quickSort(array, left, index - 1);

		}
		if (index < right) { // sorting the right half
			quickSort(array, index, right);

		}

	}
	
	
	

	/**
	 * Partion method where we are suppose to find out pivot and then 
	 * 
	 * swaps between the left and right elements
	 * 
	 * while comparing the pivot
	 * 
	 * 
	 * if that is the case then you swap them all together
	 * '
	 * by calling on the swap method 
	 * 
	 * @param array
	 * @param left
	 * @param right
	 * @return
	 */
	private int partion(int[] array, int left, int right) {
		int pivot = array[(left + right) / 2]; // pick the pivot point
		while (left <= right) {

			// fidn the element on left that shoudlbe on right
			// left is going up the array to be switched with what is on the right
			while (array[left] < pivot)
				left++;

			// find element on right that shoudl be on the left
			while (array[right] > pivot)
				right--;

			// This is the part where we swap the elements and move left and right indicies
			if (left <= right) {
				swap(array, left, right); // swap elements
				left++;
				right--;
			}

		}

		return 0; //that is if there is nothing in the array or it is one 
		//always have a just in case conditon 
	}

	/**
	 * 
	 * Our swap method called in the partion method
	 * 
	 * we have our overall array
	 * 
	 * and the left and right data points inside of the given array[]
	 * 
	 * 
	 * then swap them accordingly
	 * 
	 * @param array
	 * @param left
	 * @param right
	 */
	private void swap(int[] array, int left, int right) {
		int temporary = array[left];
		array[left] = array[right];
		array[right] = temporary;

	}

}
