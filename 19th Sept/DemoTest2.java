package Abstraction;

interface Dem { // interface declaration
	void display(); 
}
public class DemoTest2 implements Dem {
	public void display() {
		System.out.println("Display 1");
	}
	public static void main(String[] args) {
		Dem ob = new DemoTest2();
		ob.display();
	}
}
