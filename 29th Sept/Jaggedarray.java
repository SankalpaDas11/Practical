package Array;

public class Jaggedarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a 2-D array
		int arr[][] = new int[3][];
		arr[0] = new int[5];
		arr[1] = new int[7];
		arr[2] = new int[9];
		// initializing the jagged
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=count++;
			}
		}
		//printing the jagged array
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println(" ");
		}
	}
}
