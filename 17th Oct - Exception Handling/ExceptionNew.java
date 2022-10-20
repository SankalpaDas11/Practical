package Exception;

public class ExceptionNew {

public static void main(String args[]){    
	   try{  
		   String s=null;
		   System.out.println(s.length());
	   // int a[]=new int[5];    
	  //  a[5]=30/0;    
	   }    
	      
	   catch(ArrayIndexOutOfBoundsException e){
		   System.out.println("task1 is completed");
		   }    
	   catch(ArithmeticException e){
		   System.out.println("task 2 completed");
		   }  
	   catch(Exception e){
		   System.out.println("common task completed " + e);
		   }
	   System.out.println("rest of the code...");    
	 }    
	}   