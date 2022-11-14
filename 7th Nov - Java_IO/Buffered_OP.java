package IO;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Buffered_OP {
public static void main(String[] args) {
	try{    
        FileOutputStream f=new FileOutputStream("D:\\test.txt");    
        BufferedOutputStream bos=new BufferedOutputStream(f);
       // f.write(65);  
        String s="I am Good i know";
        byte b[]=s.getBytes();
        f.write(b);
        f.close();    
        System.out.println("done");    
       }catch(Exception e)
      {System.out.println(e);}    
}
}