public class StudenthasA {
	int id;
	String name;
	AddresshasA Address;
	public StudenthasA(int id, String name, AddresshasA Address) {
		this.id = id;
		this.name = name;
		this.Address = Address;
	}
	void show() {
		System.out.println(id + ": " + name);
		System.out.println(Address.city + ", " + Address.state + ", " + Address.country + ", " + Address.area);
	}
	public static void main(String ...args) {
		AddresshasA ad = new AddresshasA("Uttarpara","WB","Ind","Bh");
		StudenthasA sd = new StudenthasA(11, "Sankalpa", ad);
		sd.show();
	}
}
