package Part1;

public class GradeBookArray {
	
	private String courseName;
	private int grades[];//one dimensional array
	
	
	public GradeBookArray (String name, int gradesArray[]) {
		courseName = name; //grades array variable
		grades = gradesArray; //refere the object to the array
	}
	
	
	public void setCourseName(String name) {
		courseName = name;//sotre the course name 
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	
	public void displayMessage() {
		System.out.printf( "Welcome to the grade book for\n%s!\n\n", getCourseName());
	}
	
	//displaying messages usually utlizes getCourseName
	
	public void processGrades() {
		outputGrades();
		
		
		System.out.printf("\nClass average is %.2f\n", getAverage());
		
		System.out.printf("Lowest grade is %d\nHighest grade is %d\n\n", 
				getMinimum(), getMaximum());
		
		
		outputBarChart();//showcase the grade distribution
		
	}

	
	private int getMinimum() {
		int lowGrade = grades[0];//element zero
		
		for (int grade : grades){
		if(grade < lowGrade)
			lowGrade = grade;
		}
		
		return lowGrade;
	}

	public int getMaximum() {
		int maxGrade = grades[grades.length - 1]; //initalize the assumption 
		
		for (int grade : grades){
		if(grade > maxGrade)
			maxGrade = grade; //assigning the highgrade
		}
		
		
		return maxGrade;
	}



	//the average is doubled 
	private double getAverage() {
		int total = 0;  //you need a local variable for 
		// a method you are returning a value
		
		for (int grade : grades)
			total += grade;
		
		return (double) total / grades.length;
		
	}
	
	
	
	
	public void outputBarChart() {
		
		System.out.println( "Grade distribution:" );
		
		
		int rate[] = new int[11]; //contains 0-10 values 
		//there is initalization of the frequency of each grade
		
		for (int grade: grades)
			rate[grade/10]++; //each grade is divded by 10 
		
		
		
		for (int count = 0; count < rate.length; count++) {
			if (count == 10) //if we have reached the 10th rate, the 100th spot
				System.out.printf("%5d: ", 100 );
			
			//
			else
				System.out.printf( "%02d-%02d: ", 
						count * 10, count * 10 + 9);
			//
			
			
			//aestericks are made to represent the frequency
			for (int stars = 0; stars < rate[count]; stars++)
				System.out.print( "*");
			
			System.out.println();
			
		}
		
	}


	public void outputGrades() {
		System.out.println( "The grades are:\n" );
		
		for (int student = 0; student < grades.length; student++) {
			 System.out.printf( "Student %2d: %3d\n", student + 1, grades[student]);
		}
		
	}
	

}
