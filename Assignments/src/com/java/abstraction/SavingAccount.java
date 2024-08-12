package com.java.abstraction;

public class SavingAccount extends Bank {

	public SavingAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Saving Account");
		balance = balance - amount;
		System.out.println("With draw amount " + amount);
		System.out.println("Your current balance is " + balance);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Saving Account");
		balance = balance + amount;
		System.out.println("deposited amount " + amount);
		System.out.println("Your current balance is " + balance);
	}

}
