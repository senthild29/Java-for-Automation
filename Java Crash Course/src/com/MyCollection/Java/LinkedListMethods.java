package com.MyCollection.Java;

import java.util.LinkedList;
import java.util.List;

public class LinkedListMethods {

	public void exploreLinkedList() {

		// Created object to LinkedList using LinkedList Class, have more methods
		LinkedList<String> linklist = new LinkedList<String>();

		//Created object to LinkedList, using List Interface, have only limited methods compare to LinkedList
		//List<Integer> link= new LinkedList<Integer>();

		linklist.add("Hero");
		linklist.add("Bajaj");
		linklist.add("Honda");
		linklist.add("Hero");


		System.out.println("LinkedList => "+linklist);

		// To add element at first
		linklist.addFirst("Yamaha");
		System.out.println("Add First => "+linklist);

		// To add element at last
		linklist.addLast("Suzuki");
		System.out.println("Add Last => "+linklist);

		// To remove element at first
		linklist.removeFirst();
		System.out.println("Remove First => "+linklist);

		// To remove element at last
		linklist.removeLast();
		System.out.println("Remove Last => "+linklist);

		// To get the element from list
		System.out.println("Get Element Using Index => "+linklist.get(2));	

		// To get the First element from list
		System.out.println("Get Frist => "+linklist.getFirst());	

		// To get the Last element from list
		System.out.println("Get Last => "+linklist.getLast());	
		
		// To remove the 1st occurence of element
		linklist.removeFirstOccurrence("Hero");
		System.out.println("Remove 1st Occurence => "+linklist);
		
		// To remove the Last occurence of element
				linklist.removeLastOccurrence("hero");
				System.out.println("Remove Last Occurence => "+linklist);
		
		linklist.peek();
		System.out.println("peek => "+linklist);

		// To delete 1st element, same as remove first
		linklist.poll();
		System.out.println("Poll => "+linklist);
		
		// To delete 1st element, same as poll()
		linklist.pollFirst();
		System.out.println("Poll First=> "+linklist);
		


	}
	public static void main(String[] args) {

		LinkedListMethods LL = new LinkedListMethods();
		LL.exploreLinkedList();

	}

}
