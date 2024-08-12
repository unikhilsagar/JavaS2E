package com.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class BookMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Books> list = new ArrayList<>();
		
		list.add(new Books("Harry Potter and soccers stone","J K Rowling",12.89));
		list.add(new Books("A casual Vacany","J K Rowling",15.89));
		list.add(new Books("A game of thrones","Gorge RR Martin",13.00));
		list.add(new Books("Harry Potter and the Chamber of Secrets","J K Rowling",11.21));
		
		
		for(Books obj:list) {
			if(obj.getAuthor().equals("J K Rowling")) {
				System.out.println(obj);
			}
		}
		
		System.out.println("Iterator output");
		
		Iterator<Books> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			Books temp = iterator.next();
			if(temp.getAuthor().equals("J K Rowling")) {
				System.out.println(temp);
			}
		}
		
	}

}
