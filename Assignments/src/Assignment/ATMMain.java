package Assignment;

import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to US Bank ATM");
		
		
		Scanner scanner = new Scanner(System.in);
		
		boolean exit = false;
		
		Acount account = new Acount(4000);
		do {
			System.out.println("Please Enter options");
			System.out.println("1. Account ");
			System.out.println("2. Saving ");
			System.out.println("3. Current ");
			
			int choice = scanner.nextInt();
			
			if(choice == 1) {
				
				System.out.println("Please Enter options");
				System.out.println("1. WithDraw ");
				System.out.println("2. deposit ");
				System.out.println("3. fetch balance ");
				System.out.println("4. exit");
				
				int option = scanner.nextInt();
				
				if(option == 1) {
					System.out.println("enter amount to withdraw");
					double amt = scanner.nextDouble();
					account.withDraw(amt);
				} else if(option == 2) {
					System.out.println("enter amount to desposit");
					double amt = scanner.nextDouble();
					account.deposit(amt);
				} else if(option == 3) {
					System.out.println("your current balance " + account.getBalance());
				} else if(option == 4) {
					exit = true;
				}
				
			} else if(choice == 2) {
				account = new SavingAccount(4000);
				System.out.println("Please Enter options");
				System.out.println("1. WithDraw ");
				System.out.println("2. deposit ");
				System.out.println("3. fetch balance ");
				System.out.println("4. exit");
				
				int option = scanner.nextInt();
				
				if(option == 1) {
					System.out.println("enter amount to withdraw");
					double amt = scanner.nextDouble();
					account.withDraw(amt);
				} else if(option == 2) {
					System.out.println("enter amount to desposit");
					double amt = scanner.nextDouble();
					account.deposit(amt);
				} else if(option == 3) {
					System.out.println("your current balance " + account.getBalance());
				} else if(option == 4) {
					exit = true;
				}
			} else if(choice == 3) {
				account = new CurrentAccount(4000);
				System.out.println("Please Enter options");
				System.out.println("1. WithDraw ");
				System.out.println("2. deposit ");
				System.out.println("3. fetch balance ");
				System.out.println("4. exit");
				
				int option = scanner.nextInt();
				
				if(option == 1) {
					System.out.println("enter amount to withdraw");
					double amt = scanner.nextDouble();
					account.withDraw(amt);
				} else if(option == 2) {
					System.out.println("enter amount to desposit");
					double amt = scanner.nextDouble();
					account.deposit(amt);
				} else if(option == 3) {
					System.out.println("your current balance " + account.getBalance());
				} else if(option == 4) {
					exit = true;
				}
			} else {
				System.out.println("enter wrong option. Please try again");
			}
		} while(!exit);
		
		
		
		
	}

}
