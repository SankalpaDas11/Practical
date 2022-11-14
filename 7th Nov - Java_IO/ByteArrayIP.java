package IO;

import java.io.ByteArrayInputStream;

public class ByteArrayIP {

	public static void main(String[] args) {
		byte[]array= {65,66,67,68,69,70};
		ByteArrayInputStream ba=new ByteArrayInputStream(array); 
		int i=0;
        while((i=ba.read())!=-1) {
        	char c=((char)i);
        	System.out.println("ASCII character : "+i +" , "+"value is : "+c);
 }}}