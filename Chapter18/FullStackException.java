package Chapter18;

public class FullStackException extends RuntimeException { //must implement RuntimeException, not just exception
	
	public FullStackException() {
		this("Stack is full");
	}
	
	
	public FullStackException(String exception) {
		super(exception);
	}

}
