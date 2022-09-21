package Encapsulation;
// fully encapsulated class
public class Student {
	private String name;
	
	// for getting the name
	public String getName() {
		return name;
	}
	
	//for setting the name
	public void setName (String name) {
		this.name = name;
		System.out.println("Name successfully updated");
	}
}
