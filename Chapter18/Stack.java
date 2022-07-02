package Chapter18;


public class Stack<E> {
		private final int size;
		private int top;
		private E[] elements;
		
		
		
		//empty constructor with 10 elements
		public Stack() {
			this(10);//this helps declare how many will be in the stack
		}
		
		



		// constructor creates a stack of the specified number of elements
public Stack(int s) {
	size = s > 0 ? s : 10;
	top = -1;
	
	
	elements = (E[]) new Object[size];
}


public void push(E pushValue) {
	if (top == size - 1)
		throw new FullStackException(String.format("Stack is full, cannot push %s", pushValue ) );
	elements[ ++top ] = pushValue;
}


public E pop() {
	if (top == -1)
		throw new EmptyStackException("stack is empty, cannot pop");
	
	return elements[top--];
}


}
