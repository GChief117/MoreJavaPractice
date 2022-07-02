/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class EmptyListException extends RuntimeException {
	
	
	//no-argument constructor
	public EmptyListException() {
		this("List");
	}
	
	/**
	 * List with String name 
	 * @param name
	 */
	public EmptyListException(String name) {
		super(name + " is empty");
	}

}
