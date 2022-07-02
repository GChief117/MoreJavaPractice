/**
 * 
 */
package Part2;

import java.util.Random;

/**
 * @author gunnar_beck7
 *
 */
public class TreeTest {
	
	public static void main(String args[]) {
		Tree tree = new Tree();
		int value;
		Random randomNumber = new Random();
				
				
		System.out.println( "Inserting the following values: " );
		
		
		
		//insert 10 random integers from 0-99 in tree
		for(int i = 1; i <= 10; i++) { //10 integers
			value = randomNumber.nextInt(100);
			System.out.print( value + " " );
			tree.insertNode(value); 
		}
		
		
		System.out.println ( "\n\nPreorder traversal" );
		tree.preorderTraversal(); 
	
	
	
		System.out.println ( "\n\nInorder traversal" );
		tree.inorderTraversal();
	
	
		System.out.println ( "\n\nPostorder traversal" );
		tree.postorderTraversal();
		
	
	}

}
