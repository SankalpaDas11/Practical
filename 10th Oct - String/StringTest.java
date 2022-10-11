package String;
import java.util.Scanner;
public class StringTest {
	public void show() { //method
		Scanner s = new Scanner(System.in); // Scanner class
		System.out.print("Enter String : "); // asking input
		String A = s.next(); // 1st string input
		String B = s.next(); // 2nd string input
		System.out.println(A.length() + B.length()); // Concatenating 1st string length with 2nd string length
		System.out.println((A.compareTo(B)>0) ? "Yes" : "No"); //compare to
		System.out.println(A.substring(0,1).toUpperCase()+A.substring(1)+ " "+B.substring(0,1).toLowerCase()+
				B.substring(1)); // substring java
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringTest T = new StringTest();
		T.show();
	}

}