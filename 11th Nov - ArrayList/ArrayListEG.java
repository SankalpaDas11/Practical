package ArrayList;

import java.util.ArrayList; // importing ArrayList

public class ArrayListEG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>(); // taking a string type arraylist named al
		
		// adding elements in the arraylist
		al.add("Rose");
		al.add("Sunflower");
		al.add("Rose");
		al.add(0,"Lily");
		al.add(2,"Daisy");
		al.add("Marigold");
		al.add(6,"Tulip");
		al.add("Jasmine");
		al.add("Orchid");
		al.add("Lotus");
		al.add(5,"Lavender");

		System.out.println(al); // printing the arraylist
		System.out.println("Size of the arraylist : " + al.size()); // printing the length of the arraylist
		System.out.println(al.get(6)); // fetching the element with index 6
		
		al.remove(6); // removing the element with index 6
		System.out.println(al); // printing the updated arraylist
		System.out.println("Size of the arraylist : " + al.size()); // printing the updated side of arraylist

	}

}
