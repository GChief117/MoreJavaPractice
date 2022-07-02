package Part1;

public class VariableTest {
	
	
	//we will be doing a variable-length arugment lsits
	//using an ellipsis in a method's parameter list is more concise
	
	//will culcaute the total of all the values and reutnr the ouput
	
	//...is the compiler will automatically count up the number of variables, and count up the number of variables, then create an array of appropriate length and assigne to 
	
	//calculating the average
	
	//you need to keep all the variable tyeps the dame
	public static double average(double...numbers) {
		double total = 0.0;
		
		
		//calculate total using the enhanced for statment
		for (double d : numbers)
			total += d;
		
		//add it to the toal
		
		//then return the total of values 
		return total / numbers.length;
		
		
	}
	
	
	public static void main (String args[]) {
		double d1 = 10.0;
		double d2 = 20.0;
		double d3 = 30.0;
		double d4 = 40.0;
		
		
		System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n", d1, d2, d3, d4 );

		System.out.printf( "Average of d1 and d2 is %.1f\n", average(d1, d2));
		
		System.out.printf( "Average of d1, d2, & d3 is %.1f\n", average(d1, d2, d3));

		System.out.printf( "Average of d1 through d4 is %.1f\n", average(d1, d2, d3, d4));

	}

}
