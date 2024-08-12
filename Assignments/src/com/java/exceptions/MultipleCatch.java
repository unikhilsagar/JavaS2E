package com.java.exceptions;

public class MultipleCatch {

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
		} catch (ArithmeticException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(RuntimeException e) {
			System.out.println("Other exception");
		} catch(Exception e) {
			System.out.println("Other exception");
		}
	}

}
