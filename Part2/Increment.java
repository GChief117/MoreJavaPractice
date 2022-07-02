package Part2;

public class Increment {
	
	private int total = 0; //total of all increments
	private final int INCREMENT; //no =0, put the intalizaiton in teh construct
	
	//constructor to implment initialize incrementValue
	public Increment (int incrementValue) {
		INCREMENT = incrementValue; //for a intialized constant variable (once) 
	}
	
	//add INCREMENT to toal
	public void addIncrementToTotal() {
		total += INCREMENT;
	}
	
	//return string representation of an INcrement object's data
	public String toString() {
		return String.format("total = %d", total);
	}

}
