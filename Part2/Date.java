package Part2;

public class Date {
	private int month;
	private int day;
	private int year;
	
	
	//constructr: call checkMonth to confrim proper value for month
	//cal checkDay to conforim proper value for day
	public Date (int theMonth, int theDay, int theYear) {
	month = checkMonth(theMonth); //be sure your parameters are checked
	year = theYear;
	day = checkDay(theDay); //be sure your parameters are checked
	
	
	System.out.printf("Date object constructor for date %s\n", this);

}


	//method to be called 
	//you can have different methods call up within the constructor
	private int checkMonth(int testMonth) {
		if (testMonth > 0 && testMonth <= 12) //there are 12 months
			return testMonth;
		else {
			System.out.printf("Invalid month (%d) set to 1.", testMonth);
			return 1;
		}
	}
	
	//same thing with checkDay
	//focusing on the days specifically
	
	//we have this array raised in sequential order
	
	private int checkDay (int givenDay) {
		//months 1-12 will leave to 13 indecies of an array 
		//we are making an array of days per month
		int daysPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
				
	
	if (givenDay > 0 && givenDay <= daysPerMonth[month])
		return givenDay;
	//leap year
	if (month == 2 && givenDay == 29 && (year %400 == 0||
			(year % 4 == 0 && year % 100 != 0 )))
		return givenDay;
	
	
	System.out.printf("Invalid day (%d) set to 1.", givenDay);
	return 1;
	}
	
	
	//return a String of the form month/day/year
	public String toString() {
		return String.format("%d/%d/%d",month, day, year);
	}
	
	/**
	 * 
	 * Notes, use conditional operators
	 * 
	 * 
	 * to declare a behavior/condition for what variable 
	 * you are constructing in our constructor
	 * 
	 * || means in definite, there is no and, its one or the other which satisfy
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	
	
}
	
	
