package com.java.basics;


import java.util.Arrays;

public class GreatestofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {19,12,90,122,7,98,44};
		 
		Arrays.sort(array);
		System.out.println("greatest number " + array[array.length - 1]);
		System.out.println("greatest number " + array[0]);
		
		for(int i =1;i<=20;i++) {
			if(i%2==0) {
				
				System.out.println(i);
			}
		}
		
		for(int i =1;i<=20;i++) {
			if(i%2==1) {
				
				System.out.println(i);
			}
		}
	}

}
