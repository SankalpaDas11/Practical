package Thread;

//using thread class
public class ThreadState extends Thread {
	public void run() {
		System.out.println("Thread activated");
	}
	public static void main(String[] args) {
		ThreadState obj = new ThreadState(); //creating object of ThreadState 
		obj.start(); // starting thread 
	}
}
