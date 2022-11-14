package IO;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputExample {
	public static void main(String[] args) {
		try {
			StudentObject s = new StudentObject(13,"Sankalpa",1500); // creating object of StudentObject class
			FileOutputStream fout = new FileOutputStream("F://test.txt"); //creating object of file output with output path
			ObjectOutputStream obj = new ObjectOutputStream(fout); // passing the object of Fileoutput in ObjectOutputStream
			obj.writeObject(s); // passing the object of studentObject class in objectoutput
			obj.close();
			System.out.println("done");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
