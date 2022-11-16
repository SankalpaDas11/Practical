package Linked_List;

import java.util.LinkedList; 	// importing LinkedList
import java.util.Iterator;		// importing iterator	

public class LinkedListEg1 {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>(); // creating new linkedlist named 'll'
		
		// adding elements by add() method
		ll.add("India");
		ll.add("Japan");
		ll.add("Russia");
		ll.add("USA");
		ll.add("France");
		
		Iterator<String> itr = ll.iterator(); // iterator object 
		while(itr.hasNext())
			System.out.println(itr.next()); // printing elements
	}
}
