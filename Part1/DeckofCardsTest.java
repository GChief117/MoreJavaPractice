package Part1;

public class DeckofCardsTest {

	public static void main(String[] args) {
		
		DeckOfCards myDeckOfCards = new DeckOfCards(); //calling on the constructor
		myDeckOfCards.shuffle(); //calls the shuffle method 
		
		
		//printing all 52 cards with 13 faces
		for (int i = 0; i < 13; i++) { //we deal with all 52 cards 13 at a time, you can just modify 
			// the for loop to have 52 instead of 13 to showcase all 52 in a single list
			System.out.printf("%-20s\n", myDeckOfCards.dealCard(), 
					myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), 
					myDeckOfCards.dealCard());
			
			
			///the -20s% reperesnts 20 cahracters for each section
			
			//this is just how we group it out
			
			//you can just do one .dealCard();
			
			//we are dealing with 4 different instances of suits
			//spades, clubs, hearts, diamonds
			
			//then have 13 faces
			
			//each of hem are jsut randomly generated
			
			
			//deal card gets a card object and converts it to a string
			
			//each deadCard method focuses on 13 
		}
		
	}

}
