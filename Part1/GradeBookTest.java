package Part1;

import java.util.Scanner;

public class GradeBookTest {
	public static void main (String args[]) {
		//beginning
		Scanner input = new Scanner(System.in);
		GradeBook myGradebook = new GradeBook();//calls back from out class and all the methdos associated it 
		//in a sense we made a mini consutructor in this class
		//with our object we created
		
		//middle
		//what the code is doing 
		System.out.printf("Initial course name is: %s\n\n", 
				myGradebook.getCourseName());
		
		System.out.println("Please enter the course name: ");
		String nameOfCourse = input.nextLine(); //generic string
		myGradebook.setCourseName(nameOfCourse);
		System.out.println();//outputs a blank line
		
		
		
		
		//end
		myGradebook.displayMessage(nameOfCourse); //keep camel case
		
		
		
	}
	
	

}
