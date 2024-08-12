package com.java.collections;

public class Books {
	private String title;
	private String author;
	private double price;
	/**
	 * @param title
	 * @param author
	 * @param price
	 */
	public Books(String title, String author, double price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}
	/**
	 * 
	 */
	public Books() {
		super();
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
	
}
