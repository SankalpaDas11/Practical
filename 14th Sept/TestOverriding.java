// creating parent class
class Overriding{
	void run() {
		System.out.println("--Running mode on--");
	}
}
// creating child class
public class TestOverriding {
	void run() {
		System.out.println("--Running mode off--");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating object of child class
		TestOverriding test = new TestOverriding();
		test.run();
		// creating object of oparent class
		Overriding Test = new Overriding();
		Test.run();
	}

}