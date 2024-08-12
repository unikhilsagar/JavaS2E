package com.java.basics;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter a number");
		int number = scanner.nextInt();
		
		if(number <=0 || number ==1) {
			System.out.println(number);
		} 
		
		int a =0,b=1;
		
		for(int i=2;i<=number;i++) {
			int next = a+b;
			a=b;
			b=next;
		}
		System.out.println(b);
		scanner.close();
	}

}
