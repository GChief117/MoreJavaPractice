package Part1;

import java.util.Random;

//Using the Elements of an Array as Counters

public class RollDie {
	
	public static void main (String args[]) {
		
		Random randomNumber = new Random();
		int frequency[] = new int[7];
		
		//i represents the roll
		for (int i = 1; i <= 6000; i++) {
			++frequency[1 + randomNumber.nextInt(6)];
			
			
			System.out.printf("%s%10s\n", "Face", "Frequency" );
			
			//j represents the face
			for (int j = 1; j < frequency.length; j++) {
				System.out.printf( "%4d%10d\n", j, frequency[ j ]);
			}
			
		}
		
		
		
	}
	

}
