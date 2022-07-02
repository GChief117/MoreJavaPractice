package Part2;

public class EmployeestaticTest {

	public static void main(String[] args) {
		System.out.printf("Employees before instantiation: %d\n", Employeestatic.getCount());
		
		
		Employeestatic e1 = new Employeestatic("Susan", "Baker");
		Employeestatic e2 = new Employeestatic("Susan", "Baker");
		
		
		System.out.println( "\nEmployees after instantiation: " );
		System.out.printf( "via e1.getCount(): %d\n", e1.getCount());//always declare the method with ()
		System.out.printf( "via e2.getCount(): %d\n", e2.getCount() );
		System.out.printf( "via Employee.getCount(): %d\n", Employeestatic.getCount() ); //sepereate with commas because of the parameters 
		// which have been declared in the constructor we introducted for emploeestatic e1 and employeestatic e2
		
		
		System.out.printf("\nEmployee 1: %s %s\nEmployee 2: %s %s\n\n", 
				e1.getFirstName(), e1.getLastName(),
				e2.getFirstName(), e2.getLastName());
		
		
		
		e1 = null;
		e2 = null;
		
		
		
		System.gc();
		
		System.out.printf("\nEmployees after System.gc(): %d\n", Employeestatic.getCount());

	
	
	
	}

}
