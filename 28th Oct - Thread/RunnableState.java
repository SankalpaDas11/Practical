package Thread;

// using runnable interface
public class RunnableState implements Runnable{
	public void run() {
		System.out.println("Thread Activated");
	}
	public static void main(String[] args) { // main method
		RunnableState obj = new RunnableState();
		Thread t1 = new Thread(obj); //object of thread
		t1.start(); //starting thread
	}
}
