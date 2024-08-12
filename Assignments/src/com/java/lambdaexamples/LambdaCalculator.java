/**
 * 
 */
package com.java.lambdaexamples;

/**
 * 
 */
public class LambdaCalculator{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator add = (x,y)->System.out.println("Add = " + (x+y));
		Calculator sub = (x,y)->System.out.println("Sub = " + (x-y));
		Calculator mul = (x,y)->System.out.println("mul = " + (x*y));
		Calculator div = (x,y)->System.out.println("div = " + (x/y));
		
		add.calculator(10, 5);
		sub.calculator(10, 5);
		mul.calculator(10, 5);
		div.calculator(10, 5);
	}

	

}
