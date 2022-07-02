package Part1;

public class Sum {

	public static void main(String[] args) {
		
		int total = 0;
		
		for (int number = 2; number <= 20; total += number, number += 2); 
			//total += number; //the sum of even integers from 0 to 20 
		
		System.out.printf("Sum is %d\n", total);
		
		
		
	}

}
