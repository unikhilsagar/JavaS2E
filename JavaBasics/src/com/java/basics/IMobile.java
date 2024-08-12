package com.java.basics;

public interface IMobile {
	void call();
	void sendSMS();
	default void payBills() {
		System.out.println("Pay bills");
	}
	
	default void payGames() {
		System.out.println("Play bricksgames");
	}
	
	

}
