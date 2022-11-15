package ArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
class Bank{
	long acno;
	String name;
	double acblnc;
	int age;
	Bank(long acno,String name,double acblnc,int age){ // constructor of bank class
		this.acno=acno;
		this.name=name;
		this.acblnc=acblnc;
		this.age=age;
	}
}
public class UserDefinedEg {
public static void main(String[] args) {
	
	// creating objects of bank class passing appropriate inputs
	Bank b1=new Bank(123536,"dev",3003.8,24);
	Bank b2=new Bank(178373,"abc",3113.8,25);
	Bank b3=new Bank(172846,"def",3223.8,26);
	Bank b4=new Bank(486336,"ijk",3443.8,27);
	Bank b5=new Bank(457383,"lmn",3553.8,28);
	Bank b6=new Bank(769853,"dgh",3663.8,29);
	
	//taking a new arraylist to store the objects of bank class
	ArrayList<Bank>al=new ArrayList<Bank>();
	
	// adding bank objects in the arraylist
	al.add(b1);
	al.add(b2);
	al.add(b3);
	al.add(b4);
	al.add(b5);
	al.add(b6);
	Iterator itr=al.iterator(); //creating object of iterator
	while(itr.hasNext()) {
		Bank obj= (Bank) itr.next(); //casting
		System.out.println(obj.acno+" "+obj.name+" "+obj.acblnc+" "+obj.age); // printing elements inside objects
	}
}
}