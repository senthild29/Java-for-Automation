package com.MyCollection.Java;

import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ArrayListEg {

	public void arrayList() {

		//Created an object for arrayList class and added generics <>
		java.util.List<String >arrayList = new ArrayList<String>(); // Creating object for ArrayList using List Interface
		
	//ArrayList<String> array = new ArrayList<>(); // Creating object to ArrayList using ArrayList Class both are same

		//Using add(), added objects/items to arrayList
		arrayList.add("Monday");
		arrayList.add("Sunday");
		arrayList.add("Friday");
		arrayList.add("Tuesday");
		arrayList.add("Sunday"); //arrayList.add(1, "Friday");
		System.out.println("Size => "+arrayList.contains("Wednedsay"));

		System.out.println(arrayList);
		
		// To get item using index
		
		System.out.println("Get item using index=> "+arrayList.get(2));
		
		// To index using item
		
				System.out.println("Get index using item=> "+arrayList.indexOf("Thursday"));
				
		// To get the duplicate element using last index
				System.out.println("Get last index using item=> "+arrayList.lastIndexOf("Sunday"));

		// To copy elements from one arrayList to another
				java.util.List<String> arrayList2 = new ArrayList<String>();
				arrayList2.addAll(arrayList);
				System.out.println("To copy one array list to antoher list => "+arrayList2);
				
		// To remove specific element from list
				
				arrayList2.remove(1);
				System.out.println("Remove item from an arraylist using index =>"+arrayList2);
				
		// To clear all elements from an arraylist
				
				arrayList2.clear();	
				System.out.println("Cleared all elements from list => "+arrayList2);
				
		// we can add null elements to arraylist
				arrayList2.add("null");
				System.out.println("Added null value"+arrayList2);
				
		// To replace a existing element
				arrayList2.set(0, "not null");
				System.out.println("Replcaced null => "+arrayList2);
				
		// to know array is empty or not
				System.out.println(arrayList.isEmpty());
	}

	public static void main(String[] args) {
		ArrayListEg array = new ArrayListEg();
		array.arrayList();

	}

}
