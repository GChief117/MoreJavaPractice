package Part1;

public class Interest {
	
	public static void main(String args[]) {
		double result;
		double money = 1000.0;
		double rate = 0.05;
		
		
		System.out.printf( "%s%20s\n", "Year", "Amount on deposit" );
		
		for ( int i = 1; i <= 10; i++) {
			result = money * Math.pow(1.0 + rate,  i);
			
			System.out.printf( "%4d%,20.2f\n", i, result);
			
			
			
			
		}
		
	}

}
