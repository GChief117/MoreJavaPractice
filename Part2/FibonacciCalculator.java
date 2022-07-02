package Part2;

public class FibonacciCalculator {
	public long fibonacci(long number) {
		if((number == 0) || (number == 1))
			return number;
		else//recursion step
			return fibonacci(number - 1) + fibonacci(number - 2);
		//fibonacci is fibonacci(n-1) + fibonacci(n-2)
	}
	
	public void displayFibonacci() {
		for (int counter = 0; counter <= 10; counter++)
			System.out.printf("Fibonacci of %d is: %d\n", counter,fibonacci(counter));
	}

}
