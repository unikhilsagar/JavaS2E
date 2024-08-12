package com.java.abstraction;

public class CurrentAccount extends Bank {

	public CurrentAccount(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withDraw(double amount) {
		// TODO Auto-generated method stub
		System.out.println("current Account");
		balance = balance - amount;
		System.out.println("With draw amount " + amount);
		System.out.println("Your current balance is " + balance);
	}

	@Override
	void deposit(double amount) {
		// TODO Auto-generated method stub
		System.out.println("current Account");
		balance = balance + amount;
		System.out.println("deposited " + amount);
		System.out.println("Your current balance is " + balance);
	}

}
