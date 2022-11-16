package Linked_List;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> ll = new LinkedList<String>(); // creating new linkedlist named 'll'
		
		// adding elements in ll by add() method
		ll.add("India");
		ll.add("Japan");
		ll.add("India");
		ll.add("Japan");
		ll.add("India");
		
		System.out.println("After adding :");
		
		ll.add(1,"China"); // again adding one new element
		System.out.println(ll);
		
		LinkedList<String> lll = new LinkedList<String>(); // creating new linkedlist named 'lll'

		// adding elements in lll by add() method
		lll.add("Iran");
		lll.add("Russia");
		System.out.println(lll);
				
		ll.addAll(lll); // adding elements of 2nd linkedlist to the 1st linkedlist
		ll.addAll(1,lll); // adding elements of 2nd linkedlist to the 1st linkedlist in the 2nd position -- index 1
		System.out.println(ll);
		
		ll.addFirst("USA"); // adding element in the 1st position
		ll.addLast("Ukrain"); // adding element in the last position
		System.out.println(ll);
		
		ll.remove("USA"); // removing specific element
		ll.remove(1); //removing specific element by giving specific index
		System.out.println(ll);
		
		ll.removeAll(lll); // all of the elements will be removed
		System.out.println(ll);
		
		ll.removeFirst(); // removing element in the 1st position
		ll.removeLast(); // removing element in the last position
		System.out.println(ll);
		
		// if duplicate elements are there
		ll.removeFirstOccurrence("Japan"); //removing when the element comes for the 1st time
		ll.removeLastOccurrence("India"); //removing when the element comes for the last time
		System.out.println(ll);

	}

}
