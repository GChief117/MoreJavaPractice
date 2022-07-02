package Part2;

public class INsertionSortTest {

	public static void main(String[] args) {
		
		InsertionSort sortArray = new InsertionSort(10);
		
		System.out.println("Unsorted array:");
		System.out.println( sortArray ); //print unsorted array
		
		
		
		sortArray.sort(); //sort array
		
		
		System.out.println( "Sorted array:" );
		System.out.println( sortArray ); //print sorted array
	}//end main
}//end class Insertion
