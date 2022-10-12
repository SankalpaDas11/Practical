package String;
public class MutableStringExample {
public static void my() {
	StringBuffer s=new StringBuffer("hello");
	s.append("world");
	System.out.println(s);
	s.insert(2, "dev");
	System.out.println(s);
	s.replace(1, 4, "java");
	System.out.println(s);
	System.out.println(s.capacity());
	StringBuilder s1=new StringBuilder("world");
	s1.replace(1, 4, "java");
	System.out.println(s1);
	s1.delete(1, 3);
	System.out.println(s1);
	s1.reverse();
	System.out.println(s1);
}
public static void  main(String[] args) {
	my();
}}