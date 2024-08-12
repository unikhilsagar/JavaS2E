package Assignment;

public class Acount {
	double balance;
	
	/**
	 * @param balance
	 */
	public Acount(double balance) {
		this.balance = balance;
	}
 
	void withDraw(double amount) {
		balance = balance - amount;
		System.out.println("With draw amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	void deposit(double amount) {
		balance = balance + amount;
		System.out.println("deposisted amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	double getBalance() {
		return balance;
	}

}
