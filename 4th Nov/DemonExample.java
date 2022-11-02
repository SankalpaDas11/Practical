package Thread;

public class DemonExample extends Thread{
	synchronized public void run() {
		if (Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName());
			System.out.println("I am Daemon");
		} else {
			System.out.println("I am User");
		}
	}
	public static void main(String[] args) {
		DemonExample t = new DemonExample();
		DemonExample t1 = new DemonExample();
		DemonExample t2 = new DemonExample();

		t1.setDaemon(true);
		t.start();
		t1.start();
		t2.start();
	}
}
