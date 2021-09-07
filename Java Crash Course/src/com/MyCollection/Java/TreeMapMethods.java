package com.MyCollection.Java;

import java.util.TreeMap;

public class TreeMapMethods {


	public void exploreTreeMap() {

		TreeMap<String, String> Tree = new TreeMap<String, String>();

		Tree.put("Porur", "chennai");
		Tree.put("Chepauk", "chennai");
		Tree.put("Mount Rd", "chennai");
		Tree.put("AnnaNagar", "Chennai");

		//Tree.put(null, "chennai");

		System.out.println("Tree Map Entries => "+Tree);

		// To get 1st entry in TreeMap
		System.out.println("Get 1st Entry => "+Tree.firstEntry());

		// To get Last Entry in TreeMap
		System.out.println("Get Last Entry => "+Tree.lastEntry());

		// To get 1st Key
		System.out.println("Get 1st Key => "+Tree.firstKey());

		// To get Lasy Key
		System.out.println("Get Last Key => "+Tree.lastKey());
		// To get specific Key
		System.out.println("Get Specific Key => "+Tree.ceilingKey("Porur"));

		// To get specific key and value
		System.out.println("Get Specific Key and Value => "+Tree.ceilingEntry("Mount Rd"));

		// To sort values in descending order using key
		System.out.println("Sort value in Desc => "+Tree.descendingKeySet());

		//  To sort the entries in descending order
		System.out.println("Sort entries in Desc => "+Tree.descendingMap());

		// To get higher key after specific key
		System.out.println("To get higher key after specific key=> "+Tree.higherKey("Chepauk"));	

		// To get lower key before specific key
		System.out.println("To get lower key before specific key =>"+Tree.lowerKey("Chepauk"));

		// To get higher entry after specific entry
		System.out.println("To get higher entry after specific entry => "+Tree.higherEntry("Mount Rd"));

		// To get lower entry before specific entry
		System.out.println("To get lower entry before specific entry => "+Tree.lowerEntry("Mount Rd"));

		// Retrieves the given entry and deletes the same
		System.out.println(Tree.pollFirstEntry());
		System.out.println("After pollFirstEntry => "+Tree);

		// Retrieves the given entry and deletes the same
		System.out.println(Tree.pollLastEntry());
		System.out.println("After pollLastEntry => "+Tree);

		TreeMap<Integer, StringBuffer> Tree2 = new TreeMap<Integer, StringBuffer>();

		Tree2.put(10, new StringBuffer("Name"));
		System.out.println(Tree2);

	}
	public static void main(String[] args) {
		TreeMapMethods map = new TreeMapMethods();
		map.exploreTreeMap();

	}

}
