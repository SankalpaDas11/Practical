class Cricketer { // class 1 - parent class
	void run() {
		System.out.println("Cricketers can bat");
	}}
class Batsman extends Cricketer { // class 2 - child class
	void running() {
		System.out.println("Batsmans gather runs for team");
			}
	}
	
public class SimpleInheritence { // class 3 - to call above classes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Batsman Saurav = new Batsman(); // object of the child class
		Saurav.run(); // calling parent class mathod
		Saurav.running(); // calling child class method
	}
}
