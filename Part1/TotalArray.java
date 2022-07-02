package Part1;

public class TotalArray {
	public static void main(String args[]) {
		int array[] = {99, 88,77,66, 55, 44, 33};
		int total = 0;
		
		
		for (int counter = 0; counter < array.length; counter++) {
			total += array[counter]; 
			//+= adds up all the elements inside of the array 
			// while its being counted by the counter
			
		}
		
		System.out.printf( "Total of array elements: %d\n", total );
		
	}

}
