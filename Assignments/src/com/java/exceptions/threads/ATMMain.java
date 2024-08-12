package com.java.exceptions.threads;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome Bank");
		Bank bank = new Bank();
		try {
			bank.withDraw(1000);
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Amount withdrawn successfully");
	    System.out.println("Good bye");
	}

}
