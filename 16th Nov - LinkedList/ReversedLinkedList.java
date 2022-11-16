package Linked_List;

import java.util.Iterator;
import java.util.LinkedList;

public class ReversedLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> ll = new LinkedList<String>(); // creating new linkedlist named 'll'
		
		// adding elements by add() method
		ll.add("India");
		ll.add("Japan");
		ll.add("Russia");
		ll.add("USA");
		ll.add("France");
		
		Iterator<String> itr = ll.descendingIterator(); // iterator object 
		while(itr.hasNext())
			System.out.println(itr.next()); // printing elements in descending(reverse) order
	}

}
