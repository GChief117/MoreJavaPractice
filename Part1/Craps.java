package Part1;

import java.util.Random;

public class Craps {
	
	//beginning
	//where are fields are decalred
	
	private Random randomNumbers = new Random();
	
	private enum Status {CONTINUE, WON, LOST};
	
	private final static int SNAKE_EYES = 2;
	private final static int TREY = 3;
	private final static int SEVEN = 7;
	private final static int YO_LEVEN = 11;
	private final static int BOX_CARS = 12;
	
	
	
	
	
	
	//middle
	//where local variables are declared
	
	
	//rolling dice
	
	public int rollDice() {
		
		int die1 = 1 + randomNumbers.nextInt(6);
		int die2 = 1 + randomNumbers.nextInt(6);
		
		int sum = die1 + die2;
		
		System.out.printf( "Player rolled %d + %d = %d\n",
				die1, die2, sum );
		
		
		return sum;

		
	}

	//where we are declaring the enum 
	//this is the method which will allow us to call our enum status'
	public void play() {
		int point = 0;
		Status gameStatus;
		
		int sum = rollDice();
		
		
		switch (sum) {
			case SEVEN:
			case YO_LEVEN:
				gameStatus = Status.WON;
			case SNAKE_EYES:
			case TREY:
			case BOX_CARS:
				gameStatus = Status.LOST;
			default:
				gameStatus = Status.CONTINUE;
				point = sum;
				System.out.printf( "Point is %d\n", point );
				break;

		}	
		while (gameStatus == Status.CONTINUE) {
			sum = rollDice();
			if (sum == point)
				gameStatus = Status.WON;
			else if (sum == SEVEN)
				gameStatus = Status.LOST;			
		}
		
		if (gameStatus == Status.WON)
			System.out.println( "Player wins" );
		else
			System.out.println( "Player loses" );
		
	}
	
	
	
	

}
