package Part2;

import java.util.Scanner;

public class BinarySearchTest {

	public static void main(String args[]) {

		// create a scanner
		Scanner input = new Scanner(System.in);

		int searchInt; // search the key
		int position; // locaiton of search key in array

		// create array and output it
		BinaryArray searchArray = new BinaryArray(15);
		System.out.println(searchArray);

		// get input from the user
		System.out.print("Please enter an integer value (-1 to quit): ");
		searchInt = input.nextInt();
		System.out.println();

		// repeatdly input an integer;
		// -1 terminates the program
		while (searchInt != -1) {

			// use binary search to try to find integer

			position = searchArray.binarySearch(searchInt);

			// return value of -1 indicates integer was not found
			if (position == -1)
				System.out.println("The integer " + searchInt + " was not found.\n");
			else // the case where the integer was found
				System.out.println("The integer " + searchInt + 
						" was found in position " + position + ".\n");

			// get input from user
			System.out.print("Please enter an integer value (-1 to quit): ");
			searchInt = input.nextInt(); // read an int from user
			System.out.println(); // print out the result

		} // end while
	}// end main

} // end the whole class
