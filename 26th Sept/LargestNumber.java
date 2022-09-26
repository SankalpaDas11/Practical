package Array;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {10,20,30}; // initializing an array
		System.out.println("largest number : " + largestNumber(a)); // calling the static method 
	}
	public static int largestNumber(int a[]) { // method to find the largest element
		int max = a[0]; 
		for(int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}

}
