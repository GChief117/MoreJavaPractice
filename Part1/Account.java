package Part1;

public class Account {
	
	private double balance;
	
	
	//constructor
	
	//constructors dont have a void in their method
	public Account (double initialBalance) {
		if (initialBalance > 0.0) 
			balance = initialBalance;
		
	}
	
	public void credit(double amount) {
		balance = balance + amount;
	}
	
	
	public double getBalance() {
		return balance;
	}

}
