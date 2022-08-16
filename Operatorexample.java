package Operator;

public class Operatorexample {
	public static void main (String ...arg) {
		int a = 50 ; // initializing 1st value
		int b = 10 ; // initializing 2nd value
		// checking whether a is less than b by relational operator
		System.out.println(a<b); // < relational operator
		System.out.println(a++); // post fix 
		System.out.println(a); // printing new value of a 
		System.out.println(--b); //prefix
		System.out.println(a+b); // sum of a and b by '+' arithmetic operator
		// checking whether a is greater than b and a is not equal to b 
		System.out.println(a>b && a!=b); // && logical operator
	}
}
