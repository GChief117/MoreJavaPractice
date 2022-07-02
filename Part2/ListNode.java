/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class ListNode {
	
	
	
	//out node class will have access memebers where the lsit can access them directly
	Object data; //data form the node
	ListNode nextNode; //refers to object
	
	//constructor creates a listnode that refers to an object
	ListNode(Object object){
		this(object, null); //this(object, null)
		//we set all the initial objects to null to start with 
	}

	/**
	 * 
	 * This is our constructor
	 * 
	 * 
	 * which creatses a ListNode 
	 * 
	 * 
	 * @param object
	 * @param node
	 */
	public ListNode(Object object, ListNode node) {
		data = object; //the data is a generic type object
		nextNode = node; //this is how we redeclare the noe to be a node
	}
	
	/**
	 * We have out get object fro Object
	 * @return data from Node
	 */
	Object getObject() {
		return data; //get object refers to the data
	}
	
	/**
	 * 
	 * Refers to the next ndoe in the list
	 * 
	 * @return nextNode from the Node
	 */
	ListNode getNext() {
		return nextNode; //is also refering to a generic node which is compiled within the linkedlist 
	}


	


}
