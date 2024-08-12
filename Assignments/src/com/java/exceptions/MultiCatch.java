package com.java.exceptions;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Welcome");
			String val = args[0];
			System.out.println(val);
			int num = Integer.parseInt(val);
			System.out.println(num);
			int result = 10 / num;
			System.out.println(result);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(NumberFormatException e) {
			System.out.println("Please enter proper number");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter a value");
		} catch(RuntimeException e) {
			System.out.println("Other exception");
		} catch(Exception e) {
			System.out.println("Other exception");
		}
		
		
		System.out.println("Final line");
	}

}
