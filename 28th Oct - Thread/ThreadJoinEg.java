package Thread;

class ThreadJoin extends Thread{
	public void run() {
		for(int i=1;i<=6;i++) {
			System.out.println(i);
		}
	}
}
public class ThreadJoinEg {

	public static void main(String[] args) {
		ThreadJoin t1=new ThreadJoin();
		ThreadJoin t2=new ThreadJoin();
		ThreadJoin t3=new ThreadJoin();
		t1.start();
		try {
		t2.start();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		t3.start();
	}
}