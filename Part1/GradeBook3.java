package Part1;

import java.util.Scanner;

public class GradeBook3 {
	
	private String courseName;
	
	
	public GradeBook3(String name) {
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
		 * Set total to zero
		 * Set grade counter to one
		 */
		int total = 0;
		int gradeCounter = 0;
		int grade = 0;
		int average = 0;
		
		//middle
		/**
		 * while grade counter is less than or equal to 10
		 * 	prompt the user to enter the next grade
		 *  input the next grade
		 *  add the grade into the total
		 *  add one to the grade counter
		 */
		
		while(gradeCounter <= 10) {
			System.out.println("Enter grade");
			grade = input.nextInt(); //dont need int when calling a new method from a library
			total = total + grade;
			gradeCounter++;
		}
		
		
		
		//end
		/**
		 * set the class average to the total divided by 10
		 * print the class average
		 * 
		 */
		
		average = total/10;
		
		System.out.println("Total of the class average is " + average);
		
		System.out.println("Total of all grades " + total);

		
	}

}
