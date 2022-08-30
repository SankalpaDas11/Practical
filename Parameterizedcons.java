public class Parameterizedcons {

	int age;
	String name;
	
	Parameterizedcons(int a, String n) {
		age = a;
		name = n; }
	void show() {
		System.out.println(age + ", " + name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parameterizedcons d = new Parameterizedcons(22, "Sankalpa");
		Parameterizedcons d1 = new Parameterizedcons(2, "Kaju");
		d.show();
		d1.show();

	}

}
