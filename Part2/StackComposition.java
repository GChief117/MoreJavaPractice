/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class StackComposition {
	
	private LinkedList stackList;
	
	
	//no argument constructor
	public StackComposition(){
		stackList = new LinkedList("stack");
	}
	
	
	//add object to stack
	/**
	 * 
	 * @param object
	 */
	public void push(Object object) {
		stackList.insertAtFront(object);
	}
	
	
	//remove object from the stack
	/**
	 * 
	 * @return the removed Node form the stack list which is like a linked list when you add elements
	 * @throws EmptyListException
	 */
	public Object pop() throws EmptyListException{
		return stackList.removeFromFront();
	}
	
	//boolean for isEmpty
	public boolean isEmpty() {
		return stackList.isEmpty(); //calls on the isEmpty
	}
	
	
	//prints out the stack
	public void print() {
		stackList.print();
	}
	
	
	
}
