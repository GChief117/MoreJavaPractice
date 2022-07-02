package Part1;

import java.util.Scanner;

public class Comparrison {
	
	public static void main(String[] args) {
	//beginning
	Scanner input = new Scanner(System.in);
	int number1 = 0;
	int number2 = 0;
	
	//middle
	System.out.print("Enter first integer: "); //prompt
	number1 = input.nextInt();//reads next input from user
	System.out.print("Enter second integer: ");
	number2 = input.nextInt();
	
	
	if (number1 == number2) {
		System.out.printf("%d == %d%n", number1, number2);
	}
	
	if (number1 != number2) {
		System.out.printf("%d != %d%n", number1, number2);
	}
	
	if (number1 < number2) {
		System.out.printf("%d < %d%n", number1, number2);
	}
	
	if( number1 <= number2) {
		System.out.printf("%d <= %d%n", number1, number2);
	}
	
	if (number1 > number2) {
		System.out.printf("%d > %d%n", number1, number2);
	}
	
	if (number1 >= number2) {
		System.out.printf("%d >= %d%n", number1, number2);
	}

}
}
