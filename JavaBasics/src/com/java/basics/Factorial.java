package com.java.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number");
		int number = scanner.nextInt();
		int factorial = 1;
		for(int i = number;i>0;i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		scanner.close();
	}

}
