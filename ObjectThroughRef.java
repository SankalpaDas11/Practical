class A{
	int age;
	String name;
}

public class ObjectThroughRef {

	public static void main(String[] args) {
		A obj=new A();
		obj.age=22;
		obj.name="Sankalpa";
		System.out.println(obj.age+ " " + obj.name);

	}

}