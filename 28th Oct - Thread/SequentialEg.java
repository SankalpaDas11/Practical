package Thread;

public class SequentialEg {
	public void run() {
		for(int i = 1; i<=5; i++) {
			try {
				Thread.sleep(200); // the thread sleep/stop working for a specific amount of time
			}
			catch(InterruptedException e) {
				System.out.println(e); // printing exception if any kind of exception happens
			}
			System.out.println(i); //printing the digit
		}
	}
	public static void main(String[] args) { //main method
		// TODO Auto-generated method stub
		SequentialEg t1 = new SequentialEg(); // creating 1st object 
		SequentialEg t2 = new SequentialEg(); // creating 2nd object
		SequentialEg t3 = new SequentialEg(); // creating 3rd object
		t1.run();
		t2.run();
		t3.run();
	}
}
