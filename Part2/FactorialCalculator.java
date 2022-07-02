package Part2;

public class FactorialCalculator {
	
	public long factorial (long number) {
		if (number <= 1) //test for base case
			return 1; //return base case
		else // recursion step is here because of factorial
			return number * factorial(number - 1); 
		//
	} //end method facotiral
	
	
	public void displayFactorials() {
		for (int counter = 0; counter <= 10; counter++)
			System.out.printf("%d! = %d\n", counter, factorial(counter)); //calling facotrial method
		//at the facotiral that is where teh recursion part is occuring 
	}

}

//facotrial variables grow really fast