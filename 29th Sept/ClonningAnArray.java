package Array;

public class ClonningAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {44, 4, 5, 6}; // declaring and initializing an array
		System.out.println("Print the actual array : ");
		for(int i : arr) {
			System.out.println(i);
		}
		int[] carr=arr.clone(); // creating clone
		for(int i : arr) {
			System.out.println(i);
		}
		System.out.println("Both are equal or not");
		System.out.println(arr==carr); // checking
	}

}
