package Part2;


/**
 * Think of teh queue
 * 
 * @author gunnar_beck7
 *
 */
public class Queue {
	
	private LinkedList queueList;//inherites the methods form linkedList
	
	
	
	public Queue() {
		queueList = new LinkedList("queue");
		
		//giving a name to the new LinekdList
	}
	
	
	/**
	 * 
	 * @param object
	 */
	public void enqueue(Object object) {
		queueList.insertAtBack(object);
	}
	
	
	
	/**
	 * 
	 * @returnthe removed front form the queue after being dequed
	 * @throws EmptyListException
	 */
	public Object dequeue() throws EmptyListException {
		return queueList.removeFromFront();
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return queueList.isEmpty();
	}
	
	
	/**
	 * 
	 */
	public void print() {
		queueList.print();
	}
	
	

}
