package Part1;

import java.util.Random;

/**
 * 
 * @author gunnar_beck7
 *
 *         Here we are creating a 6 sided die
 */

public class RandomIntegers {
	public static void main(String args[]) {
		Random randomNumbers = new Random();
		int face;
		// since we will be declaring this as part of the Random
		// class methods we are calling from the Random Class

		// we will throw the dice 20x
		for (int counter = 1; counter <= 20; counter++) {

			face = 1 + randomNumbers.nextInt(6);

			System.out.printf(" %d ", face);

			// if the counter is disividble by 5,
			// start a new line of output
			if (counter % 5 == 0)
				System.out.println();
		}

	}
}
