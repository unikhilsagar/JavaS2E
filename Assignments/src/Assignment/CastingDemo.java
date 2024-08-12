package Assignment;

class Animal{
	void makeSound(){
		System.out.println("no sound");
	}
	
}
class Dog extends Animal{
	void makeSound(){
		System.out.println("woof woof");
	}
	void play(){
		System.out.println("Play");
	}
}
class Cat extends Animal{
	void makeSound(){
		System.out.println("meow meow");
	}
}

public class CastingDemo {

	public static void main(String[] args) {
		
		Animal animal = new Dog();  // long x =100;
		animal.makeSound();
		Dog dog = (Dog)animal;    // int y = (int)x;
		dog.play();
		
		Cat cat = (Cat)animal;
		cat.makeSound();
		
		
		
		
	}
}
