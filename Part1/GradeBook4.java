package Part1;

import java.util.Scanner;

public class GradeBook4 {
	
	private String courseName;
	
	
	public GradeBook4(String name) {
		courseName = name;
	}
	
	
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	
	//gets have String assoicated with it
	
	

	public void displayMessage() {
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
	}
	
	//A class of ten students took a quiz. The grades (integers in the range 0 to 100) 
	// for this quiz are available to you. Determine the class average on the quiz 
	
	public void determineClassAverage() {
		
		Scanner input = new Scanner(System.in);
		
		
		///beginning
		/**
		* Initalize the total to zero
		* Intialize the counter to zero
		 */
		int total = 0;
		int gradeCounter = 0;
		int grade = 0;
		int average = 0;
		
		//middle
		
		
		//Promprt user to enter the first grade
		//Input the frist grade
		System.out.println("Enter grade: ");
		grade = input.nextInt();
		
		
		/**
		* While user has not been entered 
		*	Add this grade into the running total
		* 	Add one to the grade counter
		*	Prompt the user to enter the next grade
		* 	input the next grade
		 */
		while (grade != -1) {
			total = total + grade;
			gradeCounter++;
			System.out.println("Enter grade or -1 to quit pussy: ");
			grade = input.nextInt();
			
		}
		
		
		
		
		//end
		/**
		 * if the counter is not equal to zero
		 *	 Set the aberage to the total divded by the counter
		 *	 Printer average
		 * else
		 *	 print "no grades were entered"l
		 * 
		 */
		if (gradeCounter != 0) {
			average = total/gradeCounter;
			System.out.println("Heres is the average for the class: " + average);
			System.out.println("Heres is the total for the class: " + total);
			
		} else {
			System.out.println("No grades were entered bitch!");
		}
		

		
	}

}
