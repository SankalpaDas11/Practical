package IO;
import java.io.Serializable;

public class StudentObject implements Serializable{ // implementing Serializable interface
	int id;
	String sname;
	int fees;
	public StudentObject(int id, String sname, int fees) { // constructor with 3 parameters 
		this.id = id;
		this.sname = sname;
		this.fees = fees;
	}
}
