package Thread;

public class ThreadPriority extends Thread{
	public void run() {
		for(int i = 0; i<5; i++) {
			try {
				Thread.sleep(800); 		// waiting span 
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i); 			//printing digit
		}
	}
	public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority(); 	// creating objects
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		
		t2.setPriority(MAX_PRIORITY); 					// setting maximum priority to second Thread i.e. 10
		System.out.println(t2.getPriority());				// printing the priority of the second thread by getPriority method
		System.out.println(Thread.currentThread().getPriority());	//printing the priority of the current thread
		
		t1.start(); 							// move to active state
		t2.start();
		t3.start();
	}
}
