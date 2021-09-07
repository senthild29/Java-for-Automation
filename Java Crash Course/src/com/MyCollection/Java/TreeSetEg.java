package com.MyCollection.Java;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEg {

	public void TreeSetMethods() {

		TreeSet<Integer> tree = new TreeSet<>();

		tree.add(21);
		tree.add(56);
		tree.add(3);
		tree.add(18);
		tree.add(42);
		tree.add(35);
		tree.add(56);

		
		System.out.println("TreeSet Elements Sroted in Asecending => "+tree);

		//To get 1st Element
		System.out.println("Get 1st Element => "+tree.first());

		//To get Last Element
		System.out.println("Get Last Element => "+tree.last());

		// To get element before given value
		System.out.println("To get element before specific value=> "+tree.headSet(21));

		// To get element on/after given value
		System.out.println("To get element on/after specific value => "+tree.tailSet(35));

		// To get element between specific values
		System.out.println("Inbetween Values => "+tree.subSet(21, 42));

		// Comparator
		System.out.println("Does data sorted in descending order => "+tree.comparator());

		//To get the higher value after given element		
		System.out.println("higher value => "+tree.higher(35));

		//To get the lower value before given element
		System.out.println("higher value => "+tree.lower(35));

		// To retrieve the 1st element and deletes the same
		System.out.println("Poll => "+tree.pollFirst());

		//To retrieve the Last element and deletes the same
		System.out.println("Poll => "+tree.pollLast());

		System.out.println("After Polling =>"+tree);
		
		// To sort elements in descending order
		System.out.println("Elements Sorted Desc => "+tree.descendingSet());
		
		TreeSet<StringBuffer> buff = new TreeSet<StringBuffer>();
		buff.add(new StringBuffer  ("Monday"));
		buff.add(new StringBuffer ("Wednesday"));
		
		System.out.println(buff);
		
	}
	public static void main(String[] args) {
		TreeSetEg set = new TreeSetEg();
		set.TreeSetMethods();

	}

}
