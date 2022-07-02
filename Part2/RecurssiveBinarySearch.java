/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class RecurssiveBinarySearch {

	// This is binary sarch
	/**
	 * 
	 * needs to be a sorted array
	 * 
	 * 
	 * thbinary searhc first has three parameters
	 * 
	 * low
	 * mid
	 * and high
	 * 
	 * 
	 * and while there are conidtions we need to satisfy for the three
	 * 
	 * we first need to find the midpoint
	 * 
	 * 
	 * we declare teh mid as low + high /2
	 * 
	 * once we fidun the middle of the array
	 * 
	 * 
	 * we then need to find the target and cut out the other part
	 * 
	 * @param array
	 * @param x
	 * @return mid
	 */

	public int binarySearch(int[] array, int x) {
		int low = 0;
		int high = array.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2; 
			if (array[mid] < x) {
				low = mid + 1;  //low is going to get cut off/ and its above one
			} else if (array[mid] > x) {
				high = mid - 1; //high is going to get cut off
			} else {
				return mid;
			}

		}
		return -1;// if there is an error

	}

	
	
	/**
	 * binarySearchRecurrsion 
	 * 
	 * Binary search recusion works just like quick sort
	 * 
	 * 
	 * binary search recursion does divide and conquer the only differnece is it finds the mid
	 * 
	 * 
	 * not the pivot
	 * 
	 * and there is a connection between the two 
	 * @param array
	 * @param x  is the key
	 * @param low
	 * @param high
	 * @return
	 */
	public int binarySearchRecursive(int[] array, int x, int low, int high) {
		if (low > high)
			return -1;

		int mid = (low + high) / 2;

		if (array[mid] < x) {
			return binarySearchRecursive(array, x, mid + 1, high); //increment

		} else if (array[mid] > x) {
			return binarySearchRecursive(array, x, low, mid - 1); //decrement
		} else {
			return mid; //that is the case if x, which the key is  the element

		}

	}

}