package Abstraction;
 interface Demo{
	void display();
}
public class DemoTest implements Demo {
	public void display() {
		System.out.println("display");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoTest ob = new DemoTest();
		ob.display();
	}

}
