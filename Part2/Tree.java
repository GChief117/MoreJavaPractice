package Part2;
/**
 * 
 * Our class Tree 
 * 
 * @author gunnar_beck7
 *
 */
public class Tree {
	
	//we make the root which is the first tree node
	private TreeNode root;
	
	/**
	 * our blank constructor
	 */
	public Tree() {
		root = null; //initalize the object
	}
	
	//insert a new node in the binary search tree
	public void insertNode(int insertValue) {
		//if we are inserting a new value into root
		//we are creating the new root
		if (root == null)
			root = new TreeNode(insertValue);
		else //if there is a root created, but no value, then we insert the value in the root
			root.insert(insertValue);
	}
	
	
	/**
	 * this is our method to perform a traversal
	 * 
	 * 
	 */
	public void preorderTraversal() {
		preorderHelper(root);
		
	}
	/**
	 * 
	 * Preorder method is to perform traversal
	 * 
	 * which is a pair of ballsacks
	 * 
	 * @param node
	 */
	private void preorderHelper(TreeNode node) {
		
		if (node == null)
			return;
		
		System.out.printf("%d ", node.data );
		preorderHelper(node.leftNode);
		preorderHelper(node.rightNode);
	}
	
	
	
	
	
	
	
	
	//inorder traversal
	public void inorderTraversal() {
		inorderHelper(root);
	}

	/**
	 * 
	 * This is the in order helper
	 * 
	 * Which checks to see if the node of the tree is null
	 * 
	 * in order goes in a upside down V motion
	 * 
	 * 
	 * If it is return
	 * 
	 * inorder is code for traversing through the tree in order 
	 * 
	 * which is starting from the root and going down
	 * 
	 * Like a series of steps 
	 * 
	 * @param node
	 */
	private void inorderHelper(TreeNode node) {
		
		if (node == null)
			return;
		
		inorderHelper(node.leftNode); //traverse left subtree
		System.out.printf("%d ", node.data);
		inorderHelper(node.rightNode);
	}
	
	
	
	//begin postordertraversal
	public void postorderTraversal() {
		postorderHelper(root);
	}
	
	
	
	
	/**
	 * 
	 * 
	 * 
	 * SO IN THE CASE OF POSTORDER TRAVERSAL
	 * 
	 * 
	 * Goes in a backwards z format
	 * 
	 * 
	 * 
	 * WHEN IT IS CALLING AND BEING REDECLARD AS A HELPER METHOD
	 * 
	 * 
	 * WHICH IS TRAVERSING THROUHG THE TREE
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * @param node
	 */
	
	// recursive method to perform postorder traversal
	private void postorderHelper(TreeNode node) {
		if (node == null)
			return;
		postorderHelper(node.leftNode); //traverse through the left node
		postorderHelper(node.rightNode); //traverse through the right node
		System.out.printf( "%d ", node.data ); //output the data
	}
	
	
	

}
