public class Copycons {
	// variable along with data type
	int age;
	String name;
	// constructor and initiaize
	Copycons(int a, String n) {
		age = a;
		name = n;
	}
	// copy con to initialize another obj
	Copycons (Copycons c) {
		age = c.age;
		name = c.name;
	}
	// method
	void show() {
		System.out.println(age + ", " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copycons c1 = new Copycons(22, "Sankalpa");
		Copycons c2 = new Copycons(c1);
		c1.show();
		c2.show();
	}

}
