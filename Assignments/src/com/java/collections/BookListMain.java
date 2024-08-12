package com.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BookListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Book> bookList = Arrays.asList(
					new Book("Harry Potter","J K Rowling","fiction",112,32.90),
					new Book("A game of thrones","Gorge RR Martin","fiction",112,32.90),
					new Book("Suitable Boy","Vikram Seth","fiction",112,32.90),
					new Book("Half Loin","Vinay Sithapathy","non-fiction",112,32.90),
					new Book("Let us C","Yashwant kantekar","academic",112,32.90)
					
				);
		
		Collections.sort(bookList);
		
		for(Book book:bookList) {
			System.out.println(book);
		}
		
		
		
	}

}
