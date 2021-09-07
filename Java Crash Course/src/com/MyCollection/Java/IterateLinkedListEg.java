package com.MyCollection.Java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IterateLinkedListEg {

	public void DiffererntWaysToIterateLinkedList() {

		LinkedList<Integer> values = new LinkedList<>();

		values.add(6);
		values.add(12);
		values.add(18);
		values.add(27);
		values.add(30);		
		

		// Method# 1 Using for Loop
		System.out.println("Using for Loop");

		for(int i=0; i<values.size(); i++) {
			System.out.println(values.get(i));
		}
		System.out.println("**********************");

		//Method# 2 Using for each Loop
		System.out.println("Using for each Loop");

		for(Integer elements: values) {
			System.out.println(elements);		
		}
		System.out.println("**********************");

		// Method# 3 Using Iterator
		System.out.println("Using Iterator Interface");

		Iterator<Integer> ite = values.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("**********************");

		// Method# 4 Using ListIterator
		System.out.println("Using ListIterator Interface");

		ListIterator<Integer> ListIte= values.listIterator();
		while(ListIte.hasNext()) {
			System.out.println(ListIte.next());
		}
		System.out.println("**********************");
		
		// Method# 5 Using ListIterator print in reverse order
		System.out.println("Using ListIterator Print in reverse");
				while(ListIte.hasPrevious()) {
			System.out.println(ListIte.previous());
		}
		System.out.println("**********************");
	}



	public static void main(String[] args) {

		IterateLinkedListEg LL = new IterateLinkedListEg();
		LL.DiffererntWaysToIterateLinkedList();

	}

}
