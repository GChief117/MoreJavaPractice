package Part1;

public class GradeBook2D {
	private String courseName; //"CS101 Introduction to Java Programming"
	private int grades[][];
	
	
	
	public GradeBook2D(String name, int[][] gradeArrays) {
		courseName = name; //"CS101 Introduction to Java Programming", 
		grades = gradeArrays; //what we will call in our test calls
	}
	
	
	public void setCourseName(String name) {
		courseName = name;
	}
	
	public String getCourseName() { //get methods use public String getXYZ(){}
		return courseName;
	}
	
	
	public void displayMessage() {
		System.out.printf( "Welcome to the grade book for\n%s!\n\n", 
				getCourseName());
	}
	
	public void processGrades() {
		outputGrades();
		
		
		System.out.printf( "\n%s %d\n%s %d\n\n",
				"Lowest grade in the grade book is", 
				getMinimum(), 
				"Highest grade in the grade book is", 
				getMaximum() );
		
		outputBarChater();
		
	}



	public int getMinimum() {
		int lowGrade = grades[0][0];
		
		for (int studentGrades[] : grades) { //one grade at a time
			for (int grade : studentGrades)
				if (grade < lowGrade)
					lowGrade = grade;
		}
		return lowGrade;
		
	}
	
	
	public int getMaximum() {
		int maxGrade = grades[0][0];
		
		for (int studentGrades[] : grades) { //we have a 1D array for student grades to 
			// see throuhgout each of the rows and oclumns which is the maxmimum 
			for (int grade : studentGrades)
				if (grade > maxGrade)
					maxGrade = grade;
		}
		return maxGrade;
	}
	
	
	public double getAverage(int setOfGrades[]) { //you get a 1D of array
		int total = 0;
		
		for (int grade : setOfGrades)
			total += grade; //sums all of the grades
		
		
		return (double) total / setOfGrades.length;
	}
	
	public void outputBarChater() {
		System.out.println("Overall grade distribution:");
		
		//stores freqyency of grades in each range of 10 grades
		int sections[] = new int[11]; //grades array
		
		//for each grade in Gradebook, increment the appropriate rate
		for (int studentGrades[] : grades) {
			for ( int grade : studentGrades)
				sections[grade/10]++; //divide by 10 and go for the frequency counter
			
		}
		
		
		
		
		//this part just outputs the bar chart
		for (int i = 0; i < sections.length; i++) {
			
			if (i == 10)
				System.out.printf( "%5d: ", 100 );
			else 
				System.out.printf( "%02d-%02d: ", i*10, i*10+9);	//label for range of numbers		
			
			//printing out he stars to showcase the frequency of grades added
			
			for (int stars = 0; stars < sections[i]; stars++)
				System.out.print("*");
			
			System.out.println();//start a new line of output 
			
			
		}
				
	}



	public void outputGrades() {
		System.out.println( "The grades are:\n" ); 
		System.out.print( "           " ); // align column heads		
		
		for(int test = 0; test <grades[0].length; test++) //assuming in the first row
			System.out.printf( "Test %d  ", test + 1 );
			
			System.out.println("Avergage");//student average column heading
		
			//create rows/columns of text represting array grades
			for (int student = 0; student < grades.length; student++) { 
				System.out.printf( "Student %2d", student + 1 );
				
				for (int test: grades[student])
					System.out.printf( "%8d", test );
				
				//call method getAverage to cauclate student's average grade;
				//pass row of grades as the argument to get Average
				double average = getAverage(grades[student]);
				System.out.printf( "%9.2f\n", average );
			}
		
		
	}
	
	
	

}
