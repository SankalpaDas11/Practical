public class Defaultcons {
	int age;
	String name;
	void show() {
		System.out.println(age + " " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultcons d = new Defaultcons();
		Defaultcons d1 = new Defaultcons();
		d.show();
		d1.show();
	}

}