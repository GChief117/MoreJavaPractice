package Part2;

public class TreeNode {
	
	TreeNode leftNode;
	int data;
	TreeNode rightNode;
	
	/**
	 * Our TreeNode constructor with nodeData
	 * @param nodeData
	 */
	public TreeNode(int nodeData) {
		data = nodeData;
		leftNode = rightNode = null; //in thec case where node has no chidlren
		//you can see it resembles LinkedList
		
	}
	
	
	public void insert(int insertValue) {
		//insert in left subtree
		if (insertValue < data) {
			//inserting value when there is nothign at the treenode
			if(leftNode == null)
				leftNode = new TreeNode(insertValue);
			//if there is something in there we traverse
			else//continue traversing left subtree
				leftNode.insert(insertValue);
			
		}
		//new statmement, but a different if statement which works in the context of the method
		//same thing with the left node]
		//except we are focusing on the right
		//but in this case, its if teh insert value is greater than the data
		else if (insertValue > data) {
			if(rightNode ==null)//determine if the right subtree is o
				rightNode = new TreeNode(insertValue);
			else
				rightNode.insert(insertValue);
		}
		
	}
	

}




