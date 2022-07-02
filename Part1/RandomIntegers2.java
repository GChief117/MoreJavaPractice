package Part1;

import java.util.Random;

/**
 * 
 * @author gunnar_beck7
 *
 *         Here we are creating a 6 sided die
 */

public class RandomIntegers2 {
	public static void main(String args[]) {
		Random randomNumbers = new Random();
		int face;
		
		int chance1 = 0;
		int chance2 = 0;
		int chance3 = 0;
		int chance4 = 0;
		int chance5 = 0;
		int chance6 = 0;
		
		
		for (int counter = 0; counter <= 6000; counter ++) {
			
			face = 1 + randomNumbers.nextInt(6); 
			//we have values 1-6, sepcified for random number
			
			if (face == 1) {
				chance1++;
			}else if (face == 2) {
				chance2++;
			}else if (face == 3) {
				chance3++;
			}else if (face == 4) {
				chance4++;
			}else if (face == 5) {
				chance5++;
			}else if (face == 6) {
				chance6++;
			}
			
			
		}
		
		System.out.println( "Face\tFrequency" ); 
		System.out.printf( "1\t%d\n2\t%d\n3\t%d\n4\t%d\n5\t%d\n6\t%d\n", 
				chance1, chance2, chance3, 
				chance4, chance5, chance6);
		
		}

	}
