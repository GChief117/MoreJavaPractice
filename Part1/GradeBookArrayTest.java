package Part1;

public class GradeBookArrayTest {

	public static void main(String[] args) {
		
		//we are given an array
		
		int gradeArrays[] = {99,88,77,55,22,99,88,77, 24};
		
		GradeBookArray myGradeBook = new GradeBookArray("CS101 Introduction to Java Programming", gradeArrays);
		
		myGradeBook.displayMessage();
		myGradeBook.processGrades();
		
	}

}
