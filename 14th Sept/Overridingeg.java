class One { //parent class
	int Marks() {
		return 100;
	}
}
class Two extends One { // 1st child
	int Marks() {
		return 90;
	}
}
class Three extends One { // 2nd child
	int Marks() {
		return 80;
	}
}
class Four extends One { // 3rd child
	int Marks() {
		return 70;
	}
}
class Five extends One { // 4th child
	int Marks() {
		return 60;
	}
}
public class Overridingeg { // 5th child

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		One one = new One(); // object of the parent class
		// objects of children classes
		Two two = new Two();
		Three three = new Three();
		Four four =  new Four();
		Five five = new Five();
		// calling methods
		System.out.println(one.Marks());
		System.out.println(two.Marks());
		System.out.println(three.Marks());
		System.out.println(four.Marks());
		System.out.println(five.Marks());
	}}
