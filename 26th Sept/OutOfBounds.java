package Array;

public class OutOfBounds {
	public static void main(String[] args) {
		int a[]= {10,3,5}; // initialization, declaration and object creation
		for(int i = 0; i <= a.length; i++) { // loop to print values of the array
			System.out.println(a[i]); // it will show an exception since we dont have element with index 3
		} 
	}
}
