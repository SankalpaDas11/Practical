package ArrayList;

import java.util.ArrayList; 	// importing ArrayList
import java.util.List;		// importing list

public class OverallArrayList {
	public static void main(String[] args) {
		List al = new ArrayList(); 			//non generic
		List<String> al1 = new ArrayList<String>(); 	// dclaring arraylist using list
		
		//method add()
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily"); 	// adding elements to a specified index location
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");
		
	}
}
