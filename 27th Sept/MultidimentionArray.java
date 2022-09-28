package Array;

public class MultidimentionArray {
	public static void main(String[] args) {
		// int a[][] = new int[2][3];
		//int[][]b = new int[2][3];
		int b[][] = {{1,2},{1,5},{8,5}};
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				System.out.println(b[i][j]);
			}System.out.println();
		}
	}
}