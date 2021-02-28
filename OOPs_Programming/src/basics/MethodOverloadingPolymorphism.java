package basics;

public class MethodOverloadingPolymorphism {

	public static void main(String[] args) {
		Person01 p1 = new Person01();
		p1.age = 88;
		p1.name = "Ganesh";
		
		p1.walk();
		p1.walk(20);
	}

}

class Person01 {
	
	// Properties of Person class
	int age;
	String name;
	
	// All the Methods/Functions are called as "Behaviors" of a class
	void walk() {
		System.out.println(name + " is walking");
	}
	
	
	// Method Overloading or CompileTime Polymorphism
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
}

