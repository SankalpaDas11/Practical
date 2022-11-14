package IO;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

public class ByteArrayOP {

	public static void main(String[] args) {
		try{    
	        FileOutputStream f1=new FileOutputStream("D:\\test.txt");    
	        FileOutputStream f2=new FileOutputStream("E:\\test.txt");    
	        ByteArrayOutputStream bos=new ByteArrayOutputStream();
	        bos.write(65);  
	        bos.writeTo(f1);
	        bos.writeTo(f2);
	        bos.close();    
	        System.out.println("done");    
	       }catch(Exception e)
	      {System.out.println(e);}    

	}

}