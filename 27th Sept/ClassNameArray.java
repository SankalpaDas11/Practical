package Array;
//to get the class name of the array in java
public class ClassNameArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaration and initialization of an array
		int arr[] = {1,2,3};
		Class c = arr.getClass(); // getting the class name
		String name = c.getName();
		System.out.println(c); // print the class name
	}

}
