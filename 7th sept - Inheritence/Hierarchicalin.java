class Footballer1 { // class 1 - parent class A
	void fit() {
		System.out.println("Footballers are fit");
	}}
	class Forward1 extends Footballer1 { // class 2 - 1st child of parent class A
		void run() {
			System.out.println("Forwards are fit and can run fast");
		}}
	class Stricker1 extends Footballer1 { // class 3 - 2nd child of class A
		void score() {
			System.out.println("Strickers are fit and can run fast and can score");
		}}
	
public class Hierarchicalin { // another class to call the above classes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stricker1 Lewandowski = new Stricker1(); // object of class 3
		// calling methods of class 3
		Lewandowski.fit(); 
		Lewandowski.score();
		Forward1 Messi = new Forward1(); // object of class 2
		// calling methods of class 2
		Messi.fit();
		Messi.run();
	}

}
