package com.MyCollection.Java;

import java.util.Iterator;
import java.util.TreeSet;

import com.sun.org.apache.bcel.internal.classfile.DescendingVisitor;

public class TreeSetItreatorEg {
	
	public void IterateTreeSet() {
		
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("Jan");
		tree.add("Feb");
		tree.add("Mar");
		tree.add("Apr");
		tree.add("May");		
		tree.add("Jun");
		
		System.out.println("Tree Set Elements => "+tree);
				
		// Method# 1 Using for each loop
		System.out.println("Using for each loop");
		for(String iterate: tree) {
			System.out.println(iterate);
		}
		System.out.println("****************");
		
		// Method# 2 using Iterator interface
		System.out.println("Using Iterator Interface");
		Iterator<String> iter = tree.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("****************");
		
		// Method# 3 using descendingIterator method
		System.out.println("Using descendingIterator()");
		Iterator<String> desc = tree.descendingIterator();
		while(desc.hasNext()) {
			System.out.println(desc.next());
		}
		System.out.println("****************");
	}
	

	public static void main(String[] args) {
		
		TreeSetItreatorEg iterat = new TreeSetItreatorEg();
		iterat.IterateTreeSet();

	}

}
