
public class Staticvariable {
	int rollno;
	String name;
	float fee;
	static String college = "Football";
	// constructor
	Staticvariable ( int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	//method
	void display() {
		System.out.println(rollno + ", " + name + ", " + fee + ", " + college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// objects
		Staticvariable s1 = new Staticvariable(111, "Ronaldo", 5000);
		Staticvariable s2 = new Staticvariable(222, "Messi", 6000);
		s1.display();
		s2.display();
	}

}
