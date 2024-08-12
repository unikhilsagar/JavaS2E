package com.java.abstraction;

public abstract class Bank {
	double balance;

	/**
	 * @param balance
	 */
	public Bank(double balance) {
		this.balance = balance;
	}
	
	abstract void withDraw(double amount);
	
	abstract void deposit(double amount);
	
	double getBalance() {
		return balance;
	}
	
	
	
	
}
