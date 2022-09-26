package Array;

public class ArrayNext {
	// creating method which returns the array
	static int[] printarray() {
		return new int[] {20, 30, 50, 70};
	}
	public static void main(String[] args) {
		//calling method
		int arr[] = printarray();
		// traversing the array
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
