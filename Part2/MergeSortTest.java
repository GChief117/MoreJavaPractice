package Part2;

public class MergeSortTest {

	public static void main(String[] args) {
		
		
		//create object to perform merge sort
		MergeSort sortArray = new MergeSort(10);
		
		
		
		//print unsourted array
		System.out.println( "Unsorted:" + sortArray + "\n" );
		
		sortArray.sort(); //sort array
		
		
		//print sorted array
		System.out.println( "Sorted:  " + sortArray );
	}

}
