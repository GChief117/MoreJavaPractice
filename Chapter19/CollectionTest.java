package Chapter19;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionTest {
	private static final String[] colors = { "MAGENTA", "RED", "WHITE", "BLUE", "CYAN" };
	private static final String[] removeColors = { "RED", "WHITE", "BLUE" };
	
	
	
	//creating an ArrayList and add colors to it then manipulate it
	
	
	public CollectionTest() {
		List<String> list = new ArrayList<String>();
		List<String> removeList = new ArrayList<String>();
			
			//add elements in color array to list
		for (String color: colors)
				list.add(color);
		
		//removing the colors
		for (String color: removeColors)
			removeList.add(color);
		
		
		//outputting the colors
		for(int count = 0; count < list.size(); count++)
			System.out.printf( "%s ", list.get(count));
		
		
		//remvoe colors contained in removeList
		/**
		 * calls upon the removeColors method where an iterator is made
		 * and is called upon different collections
		 */
		removeColors(list, removeList);
		
		
		System.out.println( "\n\nArrayList after calling removeColors: " );
		
		//ouptu content of lists
		for(String color : list)
			System.out.printf("%s ", color );
	}
	
	
	/**
	 * Remove colors method
	 * @param collection1   regular list
	 * @param collection2   remove list
	 */
	private void removeColors(Collection<String> collection1, Collection<String> collection2) {
		
		Iterator<String> iterator = collection1.iterator();
		
		//loop while collection has items
		//Iterator determines if the next list has elements
		while(iterator.hasNext())
			//if collection2 already has stuff in the list
			if(collection2.contains(iterator.next()))
				iterator.remove();
		//remove the item in the lsit
		//if not, everything stays the same, because we are looking for 3 specific strings within the lists we have created

	}
	

	public static void main(String[] args) {
		new CollectionTest();
	}

}
