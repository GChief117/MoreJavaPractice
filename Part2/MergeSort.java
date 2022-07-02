package Part2;

import java.util.Random;

public class MergeSort {
	// initalize classes
	private int[] data;
	private static Random generator = new Random();

	public MergeSort(int size) {
		data = new int[size]; // create space for array

		// fill array with random ints in range 10-99
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90);
	} // end MergeSort constructor

	// ca;;s recursive split method to begin merge sorting
	public void sort() {
		sortArray(0, data.length - 1); // split entire array
	}
	
	
	
	
	
	
	
	
	
	
	

	/**
	 * 
	 * splits array sorts subsarrays
	 * 
	 * 
	 * merge subarrays into sorted array
	 * 
	 * and merges subarrays into sorted array
	 * 
	 * 
	 * @param low
	 * @param high
	 */
	public void sortArray(int low, int high) {
		// test base case; size of array equals 1
		if ((high - low) >= 1) { // if not base case
			int middle1 = (low + high) / 2; // calcualte middle of array
			int middle2 = middle1 + 1; // calculate next element over

			// output split step
			System.out.println("split: " + subarray(low, high));
			System.out.println("split: " + subarray(low, middle1));
			System.out.println("split: " + subarray(middle2, high));
			System.out.println();

			// split array in half; sort each half(recusrive calls)
			sortArray(low, middle1);
			sortArray(middle2, high);

			// merge two sorted arrays after split calls reutn
			merge(low, middle1, middle2, high);
		}
	}
	
	
	
	
	
	/**
	 * 
	 * @param left
	 * @param middle1
	 * @param middle2
	 * @param right
	 */
	public void merge(int left, int middle1, int middle2, int right) {
		int leftIndex = left; // index into left array
		int rightIndex = middle2; // index into right array
		int combinedIndex = left; // index into temporary working array
		int[] combined = new int[data.length]; // working array

		// output two subarrays before merging
		System.out.println("merge:    " + subarray(left, middle1));
		System.out.println("       " + subarray(middle2, right));

		// merge ararys until reaching end of either
		while (leftIndex <= middle1 && rightIndex <= right) {
			// place smaller of two current elements into results
			// and move to net space in arrays
			if (data[leftIndex] <= data[rightIndex])
				combined[combinedIndex++] = data[leftIndex++];
			else
				combined[combinedIndex++] = data[rightIndex++];

		}

		// if left array is empty
		if (leftIndex == middle2)
			// copry the rest of the right array
			while (rightIndex <= right)
				combined[combinedIndex++] = data[rightIndex++];
		else // right array is empty
				// copy the left array
			combined[combinedIndex++] = data[leftIndex++];

		// copy values back into orignal array
		// and combine them together to merge
		for (int i = left; i <= right; i++) // stars from the left and workup
			data[i] = combined[i];

		// output merged array
		System.out.println("        " + subarray(left, right));
		System.out.println();
	}// end method merge

	
	
	
	
	
	/**
	 * 
	 * method to put certain values in array
	 * 
	 * @param low
	 * @param high
	 * @return
	 */
	private String subarray(int low, int high) {
		StringBuilder temporary = new StringBuilder();

		// output spaces for alignment
		for (int i = 0; i < low; i++)
			temporary.append("     ");

		// output elements left in array
		for (int i = low; i <= high; i++)
			temporary.append("" + data[i]);
		return temporary.toString();
	}
	
	
	
	//dont forget the two string
	public String toString() {
		return subarray(0, data.length - 1);
	}

}
