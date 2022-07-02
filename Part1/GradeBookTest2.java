package Part1;

public class GradeBookTest2 {

	public static void main(String[] args) {
		//Gradebook2 object
		
		GradeBook2 gradeBook1 = new GradeBook2("CS101 Introduciton to Java");
		GradeBook2 gradeBook2 = new GradeBook2("CS101 Introduciton to Java");
		
		
		
		System.out.printf("gradeBook1 course name is: %s\n", gradeBook1.getCourseName());
		System.out.printf("gradeBook2 course name is: %s\n", gradeBook1.getCourseName());

	}

}
