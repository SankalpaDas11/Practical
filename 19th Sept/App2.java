package Abstraction;

// creating an interface 
interface Interface1 {
	// by default all the methods are public
	void show();
	void display();
	void print();
}

//creating abstract class that implements one of the methods
abstract class AbsClass implements Interface1{
	@Override
	public void show() {
		System.out.println("Inside show method");
	}
}
// creating a subclass of the abstract class
// methods
class Class2 extends AbsClass {
	@Override
	public void display() {
		System.out.println("Inside display method");
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Inside show method");
	}
}
 public class App2 {
	public static void main(String[] args) {
		Interface1 obj = new Class2();
		obj.show();
		obj.display();
		obj.print();
	}
}