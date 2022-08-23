public class Foreachloopeg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int arr[] = {1,2,3,4,5}; // declaring array
		for(int i : arr) {
			System.out.println(i); // printing the elements
			 sum = i + sum; // getting sum of elements
				
		} System.out.println(sum); // printing the sum of element
	}

}
