package IO;
import java.io.*;
public class ObjectInputEgSR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			ObjectInputStream oi = new ObjectInputStream(new FileInputStream("F://test.txt"));
			StudentObject s = (StudentObject) oi.readObject();
			System.out.println("id : " + s.id + " Name : " + s.sname + " fees : " + s.fees);
			oi.close();
		} 
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
