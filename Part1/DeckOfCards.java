package Part1;

import java.util.Random;

public class DeckOfCards {
	
	private Card deck[]; //1D array of type cards, we never said how many cards are there yet
	//every element is set to null until we set how many spaces and numbers are inside or objects
	private int currentCard = 0; //index of next Card to be dealt, deals with the card specifying the index
	private final int NUMBER_OF_CARDS = 52; //constant number of Cards 
	private Random randomNumbers; //this is a private field
	
	//constructor to fill the cards
	public DeckOfCards() {
		
		//two seperate arrays
		String faces[] = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		String suits[] = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		//arrays must always have the [] to be dcalred as local vvariables or fields
		//this is where we are creating the actual array of cards
		deck = new Card[NUMBER_OF_CARDS]; //number of Crads elements which are elements final int is in all caps
		//current card is set to 0 already when intalized
		randomNumbers = new Random(); //we creawte a random Number local variable
		
		//our cards are being set from 0 to 51
		for (int i = 0; i < deck.length; i++)
			deck[i] = new Card(faces[i % 13], suits [i /13]); //2 dimensions for 1 array,
							//we are also calling on the faces and suits of the card consturctor which is public in our Cards class
							//to then allow us to run through with faces and suits
		
		
		//SUITS  means hearts, diamonds, clubs, and spades
		//faces means the number of the cards including kings, jack, queen, so there are 13 
	}

	
	//one pass algorithm to shuffle the cards
	public void shuffle() {
		//we are creating a new deck
		currentCard = 0;
		
		
		//itteratre throughout our deck fo cards
		for (int first = 0; first < deck.length; first++) {
			//every card we are looking at
			//we will look at the second card we look at and swap those cards
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS); 
			//this is how we generate the next random card
			
			
			
			//swap current card with randomly selected card
			Card temp = deck[first]; //we call on the card array
			
			
			//this is the part where we swap the two cards 
			deck[first] = deck[second]; 
			deck[second] = temp;
			
		}
	}

	
	//deal one card
	//dealing cards mean showing the card we are picking out
	public Card dealCard() {
		//this is the case until we have reached the end of the deck
		//its divided up into 13 cards, and there are 52 cards since we have 4 suits and 13 faces
		if (currentCard < deck.length)
			return deck[currentCard++]; //going to keep going
		else
			return null; //indiicates no more cards on deck
	}
}
