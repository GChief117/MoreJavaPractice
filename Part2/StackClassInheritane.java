package Part2;

public class StackClassInheritane extends LinkedList {
	
	
	//blank constructor
	public StackClassInheritane() {
		super("stack");
	}
	
	
	
	//adding an object to the stack
	public void push(Object object) {
		insertAtFront(object);
	}
	
	
	public Object pop() throws EmptyListException{
		return removeFromFront();
	}
	

}
