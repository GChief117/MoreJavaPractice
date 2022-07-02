package Part1;

import java.util.Scanner;

public class Analysis {
	
	public void ProcessExamResults() {
		
		Scanner input = new Scanner(System.in);
		
		
		int student = 1; //we start with 1
		int testResults = 0;
		int gradeCounterPassed = 0;
		int gradeCounterFailed = 0;
		
		while (student <= 10) {
			System.out.println("Enter grade if its a 1 or 2 for P/F: ");
			testResults = input.nextInt();
			
			if (testResults == 1) {
				gradeCounterPassed++;
			}
			else {
				gradeCounterFailed++;
			}
			
			student++;
			
		}
		System.out.println("Here are the amount fo students who passed: " + gradeCounterPassed);
		System.out.println("Here are the amount fo students who failed: " + gradeCounterFailed);
		if (gradeCounterPassed >= 8) {
			System.out.println("Were going to raise the tuition because we got too many fucking smart students.");
		}
		else {
			System.out.println("There is no need to, were good.");
		}
		
		
		
	}

}
