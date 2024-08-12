package com.java.collections;

public class Book implements Comparable<Book>{
	private String title;
	private String author;
	private String category;
	private int bookId;
	private double price;
	/**
	 * @param title
	 * @param author
	 * @param category
	 * @param bookId
	 * @param price
	 */
	public Book(String title, String author, String category, int bookId, double price) {
		
		this.title = title;
		this.author = author;
		this.category = category;
		this.bookId = bookId;
		this.price = price;
	}
	/**
	 * 
	 */
	public Book() {
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", category=" + category + ", bookId=" + bookId
				+ ", price=" + price + "]";
	}
	@Override
	public int compareTo(Book book) {
		// TODO Auto-generated method stub
		return this.getTitle().compareTo(book.getTitle());
	}
	
	
}
