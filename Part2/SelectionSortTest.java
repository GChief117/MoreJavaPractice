package Part2;

public class SelectionSortTest {
	
	public static void main(String[] args) {
		//create object to perform seleciton sort
		SelectionSort sortArray = new SelectionSort(10);
		
		
		System.out.println("Unsorted Array");
		System.out.println(sortArray);
		
		
		sortArray.sort(); //sortArray
		
		System.out.println("Sorted array:");
		System.out.println(sortArray);
	}

}
