import java.util.Scanner;
public class While_dowhile_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//scanner class
		Scanner input =  new Scanner(System.in);
		// take input from user
		System.out.println("Enter the number: ");
		int num = input.nextInt();
		while(num>0) {
			// add only positive numbers
			sum+=num;
			System.out.println("Enter the number:");
			num = input.nextInt();
		} System.out.println("Sum is:" + sum);
		input.close();
	}

}