
public class Staticmethod {
	int rollno;
	String name;
	float fee;
	static String college = "Football";
	// constructor
	Staticmethod ( int rollno, String name, float fee) {
		this.rollno = rollno;
		this.name = name;
		this.fee = fee;
	}
	static void change () {
		college = "Soccer";
	}
	//method
	void display() {
		System.out.println(rollno + ", " + name + ", " + fee + ", " + college);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// objects
		change();
		Staticmethod s1 = new Staticmethod(111, "Ronaldo", 5000);
		Staticmethod s2 = new Staticmethod(222, "Messi", 6000);
		s1.display();
		s2.display();
	}
}
