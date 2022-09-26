package Array;
// anonymous array in java
public class ArrayAnonymous {
	public static void main(String[] args) {
		display(new int[] {10, 20, 30, 40, 50}); // passing anonymous array
	}
	
	// creating a method which receives an array as a parameter
	static void display(int arr[]) { // no need to declare the array while passing an array to the method.
		for(int i=0; i<=arr.length-1;i++) {
			System.out.println(arr[i]);
		}
	}
}
