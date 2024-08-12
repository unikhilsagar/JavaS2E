package Assignment;

public class SavingAccount extends Acount{
	
	
	public SavingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw(double amount) {
		System.out.println("Saving account");
		balance = balance - amount;
		System.out.println("With draw amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	@Override
	void deposit(double amount) {
		System.out.println("Saving account");
		balance = balance + amount;
		System.out.println("deposisted amount " + amount);
		System.out.println("Your current balance is " + balance);
	}
	
	double getBalance() {
		return balance;
	}
}
