package Thread;

public class ThreadCons {
	public static void main(String[] args) {
		Thread obj = new Thread("Sankalpa"); // using the constructor Thread (String name)
		obj.start(); // move to active state
		String str = obj.getName(); //thread name by invoking getName method
		System.out.println(str); 
	}
}
