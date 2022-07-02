package Part2;

import java.util.Scanner;

public class LinearSearchArrayTest {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int searchInt; //search the key
		int position; //searhc the locaiton of the key in array
		
		
		LinearSearchArray searchArray = new LinearSearchArray(10);
		System.out.println(searchArray);
		
		
		//get input from user
		System.out.print("Please enter an integer "
				+ "value (-1 to quit): " );
		searchInt = input.nextInt();
		
		
		
		
		while (searchInt != -1) {
			position = searchArray.linearSearch(searchInt);
			
			if (position == -1) //if the integer wasnt found
				System.out.println("The integer " + 
			searchInt + " was not found.\n");
			else  //string is found 
				System.out.println( "The integer " + searchInt +
						" was found in position " + position + ".\n" );
			
			
			System.out.print("Please enter an integer "
					+ "value (-1 to quit): " );
			searchInt = input.nextInt();
					
			
		}
	}

}
