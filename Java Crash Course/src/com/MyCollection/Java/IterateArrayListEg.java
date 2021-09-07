package com.MyCollection.Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateArrayListEg {
	
	public void DiffererntWaysToIterateArrayList() {
		
		List<String> array = new ArrayList<String>();
		array.add("January"); // added using string
		array.add(1, "February"); // added using index
		array.add("March");
		array.add("April");
		
		// Method# 1 Using for each loop
		System.out.println("Using For Each Loop =>");
		for (String items : array) {
			
			System.out.println(items);
			}
		System.out.println("*********************");
		
		//Method# 2 Using for loop
		System.out.println("Using For Loop =>");
		 
		for(int i=0; i<array.size();i++) {
			System.out.println(array.get(i));
			}
		System.out.println("*********************");
		
		//Method# 3 Using ListIterator Interface
		System.out.println("Using ListIterator Interface =>");
		
		ListIterator<String> ListIterate = array.listIterator();
		
		while(ListIterate.hasNext()) {
			System.out.println(ListIterate.next());
		}
		System.out.println("*********************");
		
		System.out.println("Printing in Reverse Using ListIterator Interface =>");
		while(ListIterate.hasPrevious()) {
			System.out.println(ListIterate.previous());
		}
		System.out.println("*********************");
		
		//Method# 4 Using Iterator
		System.out.println("Using Iterator Interface =>");
		Iterator<String> Iterate = array.iterator();
		while(Iterate.hasNext()) {
			System.out.println(Iterate.next());
		}
		System.out.println("*********************");
	}

	public static void main(String[] args) {
		
		IterateArrayListEg iterat = new IterateArrayListEg();
		iterat.DiffererntWaysToIterateArrayList();

	}

}
