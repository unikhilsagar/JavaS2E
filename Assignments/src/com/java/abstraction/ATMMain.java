package com.java.abstraction;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to US Bank ATM");

		Scanner scanner = new Scanner(System.in);

		boolean exit = false;

		Bank bank = null;
		do {
			System.out.println("Please Enter options");

			System.out.println("1. Saving ");
			System.out.println("2. Current ");

			int choice = scanner.nextInt();

			if (choice == 1) {
				bank = new SavingAccount(4000);
				System.out.println("Please Enter options");
				System.out.println("1. WithDraw ");
				System.out.println("2. deposit ");
				System.out.println("3. fetch balance ");
				System.out.println("4. exit");

				int option = scanner.nextInt();

				switch (option) {
					case 1:
						System.out.println("enter amount to withdraw");
						double amt = scanner.nextDouble();
						bank.withDraw(amt);
						break;
					case 2:
						System.out.println("enter amount to desposit");
						double amount = scanner.nextDouble();
						bank.deposit(amount);
						break;
	
					case 3:
						System.out.println("your current balance " + bank.getBalance());
						break;
	
					default:
				}
			} else if (choice == 2) {
				bank = new CurrentAccount(4000);
				System.out.println("Please Enter options");
				System.out.println("1. WithDraw ");
				System.out.println("2. deposit ");
				System.out.println("3. fetch balance ");
				System.out.println("4. exit");

				int option = scanner.nextInt();

				switch (option) {
					case 1:
						System.out.println("enter amount to withdraw");
						double amt = scanner.nextDouble();
						bank.withDraw(amt);
						break;
					case 2:
						System.out.println("enter amount to desposit");
						double amount = scanner.nextDouble();
						bank.deposit(amount);
						break;
	
					case 3:
						System.out.println("your current balance " + bank.getBalance());
						break;
	
					default:
				}

			} else {
				System.out.println("enter wrong option. Please try again");
			}
		} while (!exit);

		scanner.close();
	}

}
