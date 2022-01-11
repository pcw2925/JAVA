package qwed;

public class ClassCast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog =new Dog();
		changeDog(dog);
		
		Cat cat =new Cat();;
		changeDog(cat);
		
		
	}	
	public static void changeDog(Animal animal) {
		
		Dog dog =(Dog) animal;
	
	}
}
	
class Animal {}
class Dog extends Animal {}	
class Cat extends Animal {}