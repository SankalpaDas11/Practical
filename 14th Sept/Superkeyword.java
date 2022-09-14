class Football { // parent class
	String name = "India";
}
class Player extends Football { // child class
	String name = "Sunil Chhetri";
	void displayname() { // child class method
		System.out.println(name); // printing child class variable
		System.out.println(super.name); // printing parent class variable
	}
}
public class Superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player Stricker = new Player(); // object of child class
		Stricker.displayname(); // calling method
	}

}