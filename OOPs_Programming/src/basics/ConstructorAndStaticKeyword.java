package basics;

public class ConstructorAndStaticKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person02 p1 = new Person02();
		p1.age = 88;
		Person02.name = "Ganesh";
		
		p1.walk();
		Person02.eat();
		
		System.out.println("\n");
		Person02 p2 = new Person02("Parvati", 26);
		
		/*
		 * "static variable" or "static method" does not belongs to Object,
		 * instead they belong to only Class.
		 * Hence "static variable or method" can be called by using only
		 * ClassName and Not by ClassObject.
		 * */
	}

}

class Person02 {
	
	// Properties of Person class
	int age;
	static String name;
	
	// Constructor without Arguments
	public Person02() {
		System.out.println("Ganesh is the son of Shiva");
	}
	
	/*
	 * Constructor is defaultly called everytime when new Object 
	 * is created.
	 * If the Constructor is not created in the class then Java will
	 * create it own default empty Constructor.
	 * Constructor can be Overloaded.
	 * ConstructorName should be same as ClassName.
	 * Constructors are used Initialize the Properties of the Class.
	 * */
	
	// Constructor_2 with Arguments
	public Person02(String name, int age) {
		Person02.name = name;
		this.age = age;
		System.out.println("Shiva is husband of " + Person02.name);
	}
	
	
	// All the Methods/Functions are called as "Behaviors" of a class
	void walk() {
		System.out.println(name + " is walking");
	}
	
	// "static" keyword
	static void eat() {
		System.out.println(name + " is eating");
	}
}
