package Abstraction;
abstract class Abstract { // parent class
	abstract void method() ; // abstract method
}
class TestAbs extends Abstract {
	void method() { // non abstract method
		System.out.println("method running successfully");
	}
}
public class NewTest extends Abstract{
	void method() {
		System.out.println("new test mwthod running successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract abs = new NewTest();
		abs.method();
	}

}
