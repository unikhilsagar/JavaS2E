package com.java.basics;

public class FeaturePhone implements IMobile {

	@Override
	public void call() {
		// TODO Auto-generated method stub
		System.out.println("calling people");
	}

	@Override
	public void sendSMS() {
		// TODO Auto-generated method stub
		System.out.println("send message");
	}

	@Override
	public void payBills() {
		// TODO Auto-generated method stub
		System.out.println("pay phone bill");
		IMobile.super.payBills();
	}

	@Override
	public void payGames() {
		// TODO Auto-generated method stub
		System.out.println("play mario game");
		IMobile.super.payGames();
	}

}
