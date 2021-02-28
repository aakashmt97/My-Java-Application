package basics;

public class ThisKeyword {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person03 p1 = new Person03(50);
	}

}

class Person03 {
	
	// Properties of Person class
	int age;
	static String name;
	
	// Constructor_1 without Arguments
	public Person03() {
		System.out.println("Ganesh is the son of Shiva");
	}

	/* Constructor_2: Using "this()" to call other Constructor of 
	 * same class.
	 * */
	public Person03(int age) {
		this();
		this.age = age;
		System.out.println("Ganesh is " + this.age + " years old");
	}

}
