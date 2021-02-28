package basics;

public class ClassAndObjects {

	public static void main(String[] args) {
		
		// "p1" is Object of Person class
		Person p1 = new Person();
		p1.age = 28;
		p1.name = "Ramesh";
		
		// "p2" is Object of Person class
		Person p2 = new Person();
		p2.age = 54;
		p2.name = "Suresh";
		
		System.out.println(p1.age + " " + p1.name);
		System.out.println(p2.age + " " + p2.name);
		
		p1.walk();
		p2.eat();
	}
}

class Person {
	
	// Properties of Person class
	int age;
	String name;
	
	// All the Methods/Functions are called as "Behaviors" of a class
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat() {
		System.out.println(name + " is eating");
	}
	
}
