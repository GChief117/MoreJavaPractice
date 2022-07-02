package Chapter19;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	private static final String colors[] = { "black", "yellow", "green", "blue", "violet", "silver" };
	private static final String colors2[] = { "gold", "white", "brown", "blue", "gray", "silver" };

	
	
	
	
	
	//constructors must have the same name as the class
	public LinkedListTest() {
		List<String> list1 = new LinkedList<String>();
		List<String> list2 = new LinkedList<String>();

		
		//add elements to the list link
		for(String color: colors)
			list1.add(color);
		
		
		//add list to colors2
		for(String color: colors2)
			list2.add(color);
		
		
		list1.addAll(list2); 
		//concatenate the lists. putting them together as one list
		list2 = null;
		printList(list1);
		
		
		//you can create methods via
		//method name(parameter in the inside 
		// which has been created by the local variable inside of the 
		// class constructor
		convertToUppercaseStrings(list1); //convertto uppercase
		printList(list1);
		
		
		System.out.print("\nDeleting elements 4 to 6...");
		removeItems(list1, 4, 7);
		printList(list1); //print list with elements which are removed
		printReversedList(list1);
		
		
		
		

	}



	/**
	 * 
	 * @param list
	 */
	private void printList(List<String> list) {
		System.out.println( "\nlist: " );
		
		for(String color : list)
			System.out.printf("%s ", color );
		System.out.println();
		
	}


	/**
	 * 
	 * @param list
	 */
	private void convertToUppercaseStrings(List<String> list) {
		ListIterator<String> iterator = list.listIterator();
		
		
		//after we created out object
		
		//loop through
		while(iterator.hasNext()) {
			String color = iterator.next();
			iterator.set(color.toUpperCase());
		}
	}
	
	


	/**
	 * 
	 * Make a generic method 
	 * 
	 * specifically though
	 * 
	 * 
	 * @param list
	 * @param start
	 * @param end
	 */
	private void removeItems( List<String> list, int start, int end ) {
		list.subList(start,end).clear(); //remove items in the lsit
	}



	/**
	 * 
	 * @param list
	 */
	private void printReversedList(List<String> list) {
		ListIterator<String> iterator = list.listIterator(list.size());
		
		
		System.out.println("\nReversed List:" );
		
		
		while(iterator.hasPrevious())
			System.out.printf("%s", iterator.previous());
		
	}


	
	public static void main(String args[]) {
		new LinkedListTest();
		
	}
}
