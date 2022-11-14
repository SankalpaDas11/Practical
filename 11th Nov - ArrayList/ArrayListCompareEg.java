package ArrayList;

import java.util.ArrayList; 						// importing arraylist

public class ArrayListCompareEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al1 = new ArrayList<String>(); 	// taking one string type arraylist named al1
		
		//adding elements in the arraylist
		al1.add("Rose");
		al1.add("Sunflower");
		al1.add("Rose");
		al1.add(0,"Lily");
		al1.add(2,"Daisy");
		al1.add("Marigold");
		
		
		ArrayList<String>al2 = new ArrayList<String>(); 	// taking another string type arraylist named al2
		
		//adding elements in the arraylist
		al2.add("Rose");
		al2.add("Sunflower");
		al2.add("Rose");
		al2.add(0,"Lily");
		al2.add(2,"Daisy");
		al2.add("Marigold");
		
		boolean b1 = al1.equals(al2); 				// taking a boolean type variable to check whether both the arraylists are equal
		System.out.println(b1); 				// printing that boolean variable to show result
		
		al1.add("lotus"); 					// adding an extra element into 1st arraylist
		boolean b2 = al1.equals(al2); 				// checking for the 2nd time
		System.out.println(b2);					// showing result
	}

}
