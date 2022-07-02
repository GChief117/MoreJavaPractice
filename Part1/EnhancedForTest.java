package Part1;

public class EnhancedForTest {

	public static void main(String[] args) {
		
		int array[] = {89,321,4,51,2,556,67,9};
		
		int sum = 0;
		
		
		for (int number : array)
			sum += number;
		
		
		/**
		 * the for each is equivalent to 
		 * 
		 * 
		 * for (int i = 0; i < array.length; i++)
		 * 		sum += array[i];
		 * 
		 * 
		 * 
		 */
		
		
		System.out.printf( "Total of array elements: %d\n", sum);
	}

}
