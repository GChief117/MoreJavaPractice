/**
 * 
 */
package Part2;

/**
 * @author gunnar_beck7
 *
 */
public class Employee {
	//reference 4 objects in the class
	private String firstName;
	private String lastName;
	private Date birthDate;
	private Date hireDate;
	
	
	
	///you make a constructor to initalize and make a special feature of strings
	public Employee(String first, String last, Date dateOfBirth, Date dateOfHire) {
		firstName = first; //references to string objects
		lastName = last; //refer to the same object
		//objects in java are dynamically allocated
		birthDate = dateOfBirth;
		hireDate = dateOfHire;
		
	}
	
	public String toString() {
		return String.format( "%s, %s Hired: %s Birthday: %s", 
				lastName, firstName, hireDate, birthDate);
	}
	


	
	

}
