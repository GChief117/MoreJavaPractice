package Part2;

public class Employeestatic {
	
	private String firstName;
	private String lastName;
	private static int count = 0;
	
	//there is no need to redeclare
	public Employeestatic (String first, String last) {
		firstName = first;
		lastName = last;
		count++; //we can isntead still update
		System.out.printf("Employee constructor: %s %s; count = %d\n", 
				firstName, lastName, count);
	}
	
	
	protected void finalized() {
		count--; //decrement static count of employees 
		System.out.printf( "Employee finalizer: %s %s; count = %d\n",
				firstName, lastName, count);
		
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public static int getCount() {
		return count;
	}
	
	
	

}
