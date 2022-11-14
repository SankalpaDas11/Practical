package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

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
		
		//printing with different types of iteration
		
		System.out.println("Traversing using for loop");
		for(int i = 0; i <al.size(); i++) 
			System.out.println(al.get(i));
		
		System.out.println("Traversing using for each loop");
		for(String a : al) 
			System.out.println(a);
		
		System.out.println("Traversing using for iterator");
		Iterator itr = al.iterator();
		while(itr.hasNext()) 
			System.out.println(itr.next());
		
		System.out.println("Traversing using for iterator-forward");
		ListIterator <String> itr1 = al.listIterator();
		while(itr1.hasNext()) 
			System.out.println(itr1.next());
		
		System.out.println("Traversing using for iterator-forward");
		ListIterator <String> itr2 = al.listIterator(al.size());
		while(itr1.hasPrevious()) 
			System.out.println(itr1.previous());
	}

}
