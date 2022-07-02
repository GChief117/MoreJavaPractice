package Part1;

public class GradeBook2DTest {

	public static void main(String[] args) {
		
		int gradesArray[][] = { { 87, 96, 70 },
					 { 68, 87, 90 },
					 { 94, 100, 90 },
					 { 100, 81, 82 },
					 { 83, 65, 85 },
					 { 78, 87, 65 },
					 { 85, 75, 83 },
					 { 91, 94, 100 },
					{ 76, 72, 84 },
					{ 87, 93, 73 } };
		
		
		//10 rows
		//3 columns
		
		
		/**
		 * 
		 * Rowing on the left
		 * 
		 * 
		 * Columning on the right
		 * 
		 */
		
		
		
		//passing a stirng and a 2D array we mae earlier
		GradeBook2D myGradeBook = new GradeBook2D("CS101 Introduction to Java Programming", gradesArray);
		myGradeBook.displayMessage(); //calling on the display message
		myGradeBook.processGrades(); //process grades method
		
		
	}

}
