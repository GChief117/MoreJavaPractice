/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class QueueTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//queue is created from the queue
		Queue queue = new Queue();
		
		//use enqueu method
		queue.enqueue(-1);
		queue.print();
		queue.enqueue(0);
		queue.print();
		queue.enqueue(1);
		queue.print();
		queue.enqueue(5);
		
		
		
		//removing the objects
		//use a try and catch
		try {
			Object removedObject = null;
			
			//while the condition is true for an object where there is nothing
			/**
			 * 
			 * removeObject is created
			 * Howeer we set it for the queue to deque
			 * 
			 */
			while(true) {
				removedObject = queue.dequeue();
				System.out.printf("%s dequeued\n", removedObject );
				queue.print();
			}
		}
		catch (EmptyListException emptyListException) {
			emptyListException.printStackTrace();
		}
		
	}

}
