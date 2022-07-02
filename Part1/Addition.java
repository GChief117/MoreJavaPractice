package Part1;

import java.util.Scanner;

public class Addition {
	
	public static void main (String args[]) {
		
		//this is a declaration, input is a variable in the location 
		//of the computers memory which can be stored later
		Scanner input = new Scanner(System.in);
		
		//beginning
		int number1;//first number to ad
		int number2;//second number to add
		int sum;
		
		
		//middle
		System.out.print("Enter first integer: "); //prompt
		number1 = input.nextInt();//reads next input from user
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		
		
		sum = number1 + number2; //add numbers
		
		//end
		//return
		System.out.printf("Sum is %d\n ", sum);
		
	}

}


