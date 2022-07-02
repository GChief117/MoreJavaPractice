package Part1;

public class GradeBook2 {
	
	private String courseName;
	
	
	public GradeBook2(String name) {
		courseName = name;
	}
	
	
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	
	public String getCourseName() {
		return courseName;
	}
	
	//gets have String assoicated with it
	
	

	public void displayMessage(String courseName) {
		System.out.printf("Welcome to the grade book for \n%s!\n", getCourseName());
	}

}
