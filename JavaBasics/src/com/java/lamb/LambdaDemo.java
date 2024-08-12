package com.java.lamb;

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IGames games = ()->{

			System.out.println("games for kids");
			System.out.println("games for adults");
		};
		
		games.voidshowGames();
	}

}
