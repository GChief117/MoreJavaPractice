/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class FactorialCaclulatorRandI {
	public long facotrial(long number) {
		long result = 1;
		
		
		
		//iterative declaration of method facotiral
		for (long i = number; i >= 1; i--)
			result *= i;
		
		return result;
	}
	
	
	//output facotrials for values 0-10
	public void displayFacotrials() {
		for (int counter = 0; counter <= 10; counter++)
			System.out.printf( "%d! = %d\n", counter, facotrial(counter));
	}

}
