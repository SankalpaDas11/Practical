package ArrayList;

import java.util.ArrayList; // importing ArrayList
import java.util.Arrays; // importing arrays
import java.util.List; // importing list

public class ArrayListConvert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> al = new ArrayList<String>(); // taking a new arraylist named al
		
		// adding elements in al
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily");
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		
		System.out.println("--List to array--");
		String [] arr = al.toArray(new String[al.size()]); // taking a string type array named arr with same length of al
		for (String s : arr)
			System.out.println(s); // printing array "arr"
		
		System.out.println("Array to list");
		List<String> al1 = new ArrayList<String>(); // taking a String type list
		al1 = Arrays.asList(arr); // converting to list
		System.out.println(al1); // printing the new list
	}

}
