package Array;

public class ArrayExample {
	public static void main(String[] args) {
		/*int a[] = new int[3]; // declaration array and object creation
		// initialization
		a[0] = 10;
		a[1] = 3;
		a[2] = 5;*/
		//traversing array
		int a[]= {10,3,5}; // initialization, declaration and object creation
		for(int i = 0; i < a.length; i++) { // loop to print values of the array
			System.out.println(a[i]);
		} 
		// traversing by for each loop
		for(int i : a) {
			System.out.println(i);
		}
	}
}