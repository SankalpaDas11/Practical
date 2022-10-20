package Exception;

public class ExceptionExample {

	public static void main(String[] args) {
	try {
	//	int a=67/0;	//ArithmeticException
	//	System.out.println(a);
	/*int array[]=new int[4];
		array[7]=50;//ArrayIndexOutOfBoundsException
		System.out.println(array[7]);*/
		String s="i am good";
		int num=Integer.parseInt(s);//NumberFormatException
		System.out.println(num);
	}
catch (ArithmeticException e){
	System.out.println(e);
}
	catch(ArrayIndexOutOfBoundsException e) {
	System.out.println(e);
	}
	finally {
		System.out.println("use of finally block");
	}
	System.out.println("code will run");
	}
}
