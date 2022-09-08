class Footballer { // class 1 - parent class A
	void running() {
		System.out.println("Footballers are fit");
	}}
	class Forward extends Footballer { // class 2 - parent class B (child of class A)
		void run() {
			System.out.println("Forwards are fit and can run fast");
		}}
	class Stricker extends Forward { // child class
		void speed() {
			System.out.println("Strickers are fit and can run fast and can score");
		}}
	

public class Multilevelin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stricker Lewandowski = new Stricker();
		Lewandowski.running();
		Lewandowski.run();
		Lewandowski.speed();
	}

}