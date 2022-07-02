/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class LinkedList {
	private ListNode firstNode; // firstNode object is created
	private ListNode lastNode; // lastNode object is created
	private String name; // string like "list" used in printing

	// constructor creating empty list with "list" as the name

	/**
	 * 
	 * Our counstructor
	 * 
	 */
	public LinkedList() {
		this("list");
	}

	/**
	 * 
	 * Our LinkedList constructor
	 * 
	 * 
	 * It will take a series of names ot start
	 * 
	 * @param listName
	 */
	public LinkedList(String listName) {
		name = listName;
		firstNode = lastNode = null; // both end points are intilized
	}

	/**
	 * Inserting an object at the front
	 * 
	 * @param insertItem
	 */

	// insert objct at front of List
	public void insertAtFront(Object insertItem) {
		if (isEmpty()) // first and last nodes refer to the same object
			firstNode = lastNode = new ListNode(insertItem);
		else // firstNode refers to new node
			firstNode = new ListNode(insertItem, firstNode);
	}
	
	
	

	/**
	 * Inserting an object in the back
	 * 
	 * @param insertItem
	 */
	public void insertAtBack(Object insertItem) {
		if (isEmpty()) // firstnode and last node refer to the same object
			//always have those conditions where there is nothing in palce
			//worse case scenario
			//this is the case when there is nothing in place
			firstNode = lastNode = new ListNode(insertItem);
		else// last node's object is new, if the last node is not empty
			lastNode = lastNode.nextNode = new ListNode(insertItem);
		// nextNode is the variable we get for when we have our getNext method
	}
	
	
	
	

	// remove first node from List
	public Object removeFromFront() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		Object removedItem = firstNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else
			firstNode = firstNode.nextNode;

		return removedItem; // return removed node data
	} // end method removeFromFront
	
	
	
	
	
	
	

	// remove last node from List
	public Object removeFromBack() throws EmptyListException {
		if (isEmpty()) // throw exception if List is empty
			throw new EmptyListException(name);

		
		//create a new object here
		Object removedItem = lastNode.data; // retrieve data being removed

		// update references firstNode and lastNode
		if (firstNode == lastNode)
			firstNode = lastNode = null;
		else // locate new last node
		{
			
			//we need to make a listnode from the first 
			//we make the current equal to the first node
			ListNode current = firstNode;
			

			/**
			 * While the current node doesnt equal the last node
			 * 
			 * the current node is not the next node
			 * is the next node
			 * 
			 * 
			 * we redeclare the firstnode to be the current node
			 * 
			 * 
			 */
			while (current.nextNode != lastNode)
				current = current.nextNode;
			/**
			 * we then make the last node the first node
			 * 
			 * then set current node to null
			 * 
			 * sinece it is being removed
			 */
			lastNode = current; // current is new lastNode
			current.nextNode = null;
		} // end else
		/**
		 * 
		 * Since this isnt a void method
		 * 
		 * we remove the item 
		 * 
		 */
		return removedItem; // return removed node data
	} // end method removeFromBack

	
	
	
	
	
	// determine whether list is empty
	/**
	 * 
	 * This is our isEmpty method
	 * 
	 * which checks for the decision
	 * 
	 * 
	 * if the linkedlist we have is empty
	 * 
	 * it is null
	 * 
	 * 
	 * we dont have to take into consideraiton the last node
	 * 
	 * 
	 * because we jsut have the first node
	 * 
	 * 
	 * and therefore set it to null 
	 * 
	 * 
	 * return, because this is not a void method but a primitive type 
	 * 
	 * 
	 * we have to return null
	 * 
	 * 
	 * to make it empty
	 * 
	 * 
	 * @return null
	 */
	
	
	public boolean isEmpty() {
		return firstNode == null; // return true if list is empty
	} // end method isEmpty
	
	
	
	

	// output list contents
	public void print() {
		if (isEmpty()) {
			System.out.printf("Empty %s\n", name);
			return;
		} // end if

		System.out.printf("The %s is:", name);
		ListNode current = firstNode;

		// while not at end of list, output current node's data
		while (current != null) {
			System.out.printf("%s", current.data);
			current = current.nextNode;
		} // end while

		System.out.println("\n");
	} // end method print
} // end class List