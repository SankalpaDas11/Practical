import java.util.Scanner;

public class Userdefinedmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 1st number : ");
		// taking 1st input from user
		int num1 = sc.nextInt();
		System.out.print("Enter 2nd number : ");
		//taking second input from user
		int num2 = sc.nextInt();
		//method
		addition(num1, num2); //calling method 
	}

	public static void addition(int num1, int num2) {
		// TODO Auto-generated method stub
		// method body
		int num = num1 + num2; //logic
		System.out.println("The result is :" + num); //printing result
	}}
