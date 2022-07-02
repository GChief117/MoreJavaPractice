/**
 * 
 */
package Part2;

import java.util.Arrays;
import java.util.Random;

/**
 * @author gunnar_beck7
 *
 */
public class BinaryArray {
	private int[] data;
	private static Random generator = new Random();

	public BinaryArray(int size) {
		data = new int[size];

		// filling in the data
		//randomly generate an array list of integers 
		//
		for (int i = 0; i < size; i++)
			data[i] = 10 + generator.nextInt(90); 

		Arrays.sort(data);
	}

	public int binarySearch(int searchElement) {
		int low = 0; // low search area of data
		int high = data.length - 1; // high search area
		int middle = (low + high + 1) / 2; // middle of the element since we have the lenth to include which is why we
											// have + 1
		int location = -1; // return the value; -1 if not found

		do {
			System.out.print(remainingElements(low, high));

			// output sapces for alignment
			for (int i = 0; i < middle; i++)
				System.out.print("    ");
			System.out.println(" * "); // indicate current midle

			// if the element is found in the middle
			if (searchElement == data[middle])
				location = middle;
			// if the element is found in the upper half
			else if (searchElement < data[middle])
				location = middle;
			else
				low = middle + 1; // if the elmenet is found in the lower half

			// recalulate the middle
			middle = (low + high + 1) / 2;

		}

		while ((low <= high) && (location == -1));
		return location;
	}

	public String remainingElements(int low, int high) {

		StringBuilder temporary = new StringBuilder();

		// output spaces for alignment
		for (int i = 0; i < low; i++)
			temporary.append("      ");

		// output elements left in array
		for (int i = low; i <= high; i++)
			temporary.append(data[i] + " ");

		temporary.append("\n");
		return temporary.toString();
	}

	public String toString() {
		return remainingElements(0, data.length - 1);

	}
}
