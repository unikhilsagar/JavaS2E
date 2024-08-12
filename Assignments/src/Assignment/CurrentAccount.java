package Assignment;

public class CurrentAccount extends Acount {

	public CurrentAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void withDraw(double amount) {
		System.out.println("Current account");
		balance = balance - amount;
		System.out.println("With draw amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	@Override
	void deposit(double amount) {
		System.out.println("Current account");
		balance = balance + amount;
		System.out.println("deposisted amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	double getBalance() {
		return balance;
	}

}
