package com.java.lamb;

class User implements IGreeter{

	@Override
	public void sayHello(String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
	}
	
}

public class AnonyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IGreeter greeter = new User();
		greeter.sayHello("Sri");
		
		IGreeter ngreeter = new IGreeter() {

			@Override
			public void sayHello(String username) {
				// TODO Auto-generated method stub
				System.out.println("Welcome " + username);
			}
			
		};
		
		ngreeter.sayHello("Sai");
		
		ngreeter = (username)->System.out.println("Welcome " + username);

	}

}
