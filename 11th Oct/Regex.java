package String;
import java.util.regex.*; 
public class Regex {
public static void main(String args[]){  
//1st way  
/*Pattern p = Pattern.compile(".s");//.(dot) represents  a single character  
Matcher m = p.matcher("ks");  
boolean b = m.matches();  
  
//2nd way  
boolean b2=Pattern.compile(".s").matcher("ks").matches();  
  
//3rd way  
boolean b3 = Pattern.matches(".s", "ks");  
  
System.out.println(b+" "+b2+" "+b3);  */
//character class
boolean b4=Pattern.matches("[amn]","m");
boolean b5=Pattern.matches("[^abc]", "e");
boolean b6=Pattern.matches("[a-zA-Z]","b");
System.out.println(b4+" "+b5+" "+b6);
}}