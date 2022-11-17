package Lambda;

interface FunctionalInterface {
	int add(int a , int b);
}
public class LambdaEg {
	public static void main(String[] args) {
		FunctionalInterface obj = (a,b)->{return (a+b);
		//System.out.println("I am functional interface implemented by lambda expression");
		};
		System.out.println((obj.add(40,50)));
		//obj.add
	}
}
