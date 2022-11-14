package IO;

import java.io.FileInputStream;  
public class FileInput {  
     public static void main(String args[]){    
          try{    
            FileInputStream f=new FileInputStream("D:\\newTest.txt");    
          // int i=f.read();  
        //    System.out.print((char)i);    //for the first single character
          /*  int i=0;    
            while((i=f.read())!=-1){    //for the whole string
             System.out.print((char)i);              
            }*/
            for(int i=f.read();i>=0;i=f.read()) {
            		System.out.print((char)i);    	
            }
            f.close();
            } catch(Exception e){System.out.println(e);}    
         }    
        }