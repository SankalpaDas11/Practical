package Array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaring a source array
		char[]copyFrom = {'d','e','c','f','f','e','i','n'};
		// declaring a destination array
		char[]copyTo = new char[7];
		System.arraycopy(copyFrom, 1, copyTo, 0, 7);
		// print the destination array
		System.out.println(String.valueOf(copyTo));
	}
}
