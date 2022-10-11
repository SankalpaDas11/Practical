package String;
import java.util.Scanner;
//check equality by using equal() method
public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter first string : ");
		str1 = ab.nextLine();
		System.out.println("Enter second string : ");
		str2 = ab.nextLine();
		//comparing two input strings
		if(str1.equals(str2)) {
			System.out.println("Equal String");
		}
		else {
			System.out.println("Unequal String");
		}
	}

}