/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class StackInheritanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		StackClassInheritane stack = new StackClassInheritane();
		
		//using the push method
		stack.push(-1);
		stack.print();
		stack.push(0);
		stack.print();
		stack.push(1);
		stack.print();
		stack.push(5);
		stack.print();//inheriting methods form the LinkedList class 

		
		/**
		 * removing items from the stack
		 */
		try {
			Object removedObject = null;
			//we instantiate our object
			
			//every method has a beginning middle and end
			/**
			 * 
			 * 
			 * 
			 * 
			 */
			while(true) {
				removedObject = stack.pop();
				System.out.printf( "%s popped\n", removedObject );
				stack.print();
			}
		}
		catch ( EmptyListException emptyListException )
		{
			emptyListException.printStackTrace();
		}
		
	}
	
	

}
