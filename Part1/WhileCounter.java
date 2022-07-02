package Part1;

public class WhileCounter {

	public static void main(String[] args) {
		
		int counter = -1;
		
		while (counter <= 10) {
			System.out.printf("%d ", counter);
			++counter; 
			//remember ++ means, before means we will make 0 to 1, 
			// after means it will stay at zero until the next iterations
		}
		System.out.println();
	}

}
