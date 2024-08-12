package com.java.inheritence;

class Aa {
	int a = 10;
	void display() {
		System.out.println("Aa");
	}
}

class Bb extends Aa {
	int b = 20;
	void display() {
		System.out.println("Bb = "+a);
	}
}

class Cc extends Bb {
	int c =30;
	@Override
	void display() {
		//super.display();
		System.out.println("Cc");
	}
}


public class Inheritence {
	public static void main(String[] args) {
		
		Aa a = new Aa();
		a.display();
		a = new Bb();
		a.display();
		a = new Cc();
		a.display();
		
	}
}
