package Abstraction;
// an abstract class which has abstract, non abstract method and costructor
abstract class AbstractNew{
	AbstractNew() { // constructor
		System.out.println("Constructor created");
	} 
	abstract void show(); // abstract method
	void method1() { // non abstract method
		System.out.println("method 1 created");
	}
}
public class Anything extends AbstractNew{
	void show() {
		System.out.println("method running successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractNew obj = new Anything();
		obj.method1();
		obj.show();
	}

}