class Add{
	static int add (int a, int b) {
		return a+b;
	}
	// changing the no. of argument or the datatype of argument
	static double add (double a, double b, double c) {
		return a+b+c;
	}
}
public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Add.add(2, 3));
		System.out.println(Add.add(2.5, 3.7, 5.1));
	}

}