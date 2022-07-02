package Part2;

public class ListTest {
	
	public static void main(String args[]) {
		

	
	LinkedList list = new LinkedList();
	
	
	
	//insert integersr to the list
	list.insertAtFront(-1);
	list.print();
	list.insertAtFront(0);
	list.print();
	list.insertAtBack(1);
	list.print();
	list.insertAtBack(5);
	list.print();
	
	
	/**
	 * remove objets from list
	 * print after each removal
	 */
	
	try {
		Object removedObject = list.removeFromFront();
		System.out.printf( "%s removed\n", removedObject );
		list.print();
		
		
		removedObject = list.removeFromFront();
		System.out.printf( "%s removed\n", removedObject );
		list.print();
		
		removedObject = list.removeFromBack();
		System.out.printf( "%s removed\n", removedObject );
		list.print();
		
		
		removedObject = list.removeFromBack();
		System.out.printf( "%s removed\n", removedObject );
		list.print();
		
	
			
			
			
		} //end try
	catch (EmptyListException emptyListException) {
		emptyListException.printStackTrace();
		
	}
	
	
	

}

}