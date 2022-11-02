package Thread;

public class RunnableCons implements Runnable{ 			// implementing runnable interface
	public void run() {
		System.out.println("Thread Activated");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = new RunnableCons();
		Thread obj = new Thread("Sank"); 		// using the constructor name (Thread name)
		obj.start(); 					// move to active state
		String str = obj.getName(); 			// thread name by invoking getName method
		System.out.println(str);
	}
}
