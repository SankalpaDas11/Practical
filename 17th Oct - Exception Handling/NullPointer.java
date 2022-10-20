package Exception;

public class NullPointer {
int a=10;
public static  NullPointer method() {//null pointer through method
	return null;
}
String s=null;//null pointer through string
int arr[]=null;//null pointer through array
public static void main(String[] args) {
	NullPointer obj= new NullPointer();
	NullPointer obj1= NullPointer.method();
	System.out.println(obj1.a);
	System.out.println(obj.s.length());
	System.out.println(obj.arr.length);
	
}
}
