package Part1;

public class Card {
	
	private String face;
	private String suit;
	
	
	//we initlize with the constructor 
	
	//stirngs are objects not primitive, strings typicallly 
	// get null unless we create a constructor we get for an isntance cariable
	
	//similar in the case of integer when set to 0
	
	//strings are set to null when intalized
	//its not unitle they are parametrized into a constrctor they are re-declard and finally intalized
	public Card(String cardFace, String cardSuit) {
		face = cardFace; //face is intalized
		suit = cardSuit; //suite is initalized 
		
	}
	
	//the to String method
	//everyting in js hava has a string representation
	public String toString() { //if you define a toString method 
		return face + " of " + suit; //going to return our string as one string
	}
	
	
	/**
	 * example of to string:
	 * 
	 * to string is going to return the following string 
	 * 
	 * to string allows us to convert our integer, double, or object
	 * it gets converted to a string
	 * 
	 * 
	 * such as 9 == Nine
	 * or 4 to == Four
	 * 
	 * 
	 * You are never really creating a class from objects
	 * Instead you are extending different classes from the Java library
	 * 
	 * 
	 */
	
	

}
