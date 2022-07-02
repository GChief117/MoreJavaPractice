package Part1;

import java.util.Random;

public class StudentPoll {

	public static void main(String[] args) {
		int responses[];
		responses = new int[41];
		Random randomNumber = new Random();

		for (int j = 1; j < responses.length; j++) {
			responses[1 + randomNumber.nextInt(10)]++;
			System.out.printf("%s%10s\n", "Student", "Rating");
			System.out.printf("%4d%10d\n", j, responses[j]);
		}

	}

}
