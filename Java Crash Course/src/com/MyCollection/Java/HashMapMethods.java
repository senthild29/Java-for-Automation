package com.MyCollection.Java;

import java.util.HashMap;

public class HashMapMethods {
	
	public void ExploreHashMap() {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		
		hash.put(10, "John"); // Entry
		hash.put(3, "Samuel");
		hash.put(2, "Murugan");
		hash.put(5, "Smith");
		hash.put(18, "Dawson");
		hash.put(6, "Samuel");
			
		System.out.println("Hash Set Elements => "+hash);
		
		System.out.println(hash);
		// To get value using Key
		System.out.println("Get Value using Key =>"+hash.get(18));
	
		// To get only keys
		System.out.println("Keys => "+hash.keySet());
	
		// To get only values
		System.out.println("Values => "+hash.values());
		
		// To clone the elements
		System.out.println("Clone Elements => "+hash.clone());
	
		// To know specific key is present
	System.out.println("Does key 20 is present => "+hash.containsKey(20));	
	
	// To know specific Value is present
	System.out.println("Does  value SMITH is present => "+hash.containsValue("Smith"));
		
	// To get all the keys and values
	System.out.println("Get all elements =>"+hash.entrySet());
	

	// To know map is empty or not
	System.out.println("Does this map is empty => "+hash.isEmpty());
	
	
	// To make a copy of existing map
	HashMap<Integer, String> hashCopy = new HashMap<Integer, String>();
	hashCopy.putAll(hash);


	System.out.println("HashCopy Elements => "+hashCopy);
	
	// To remove specific value
	System.out.println(hashCopy.remove(3));
	System.out.println("After Removal");
	
	// To replace a value
	System.out.println("Replace element=> "+hashCopy.replace(10, "Wick"));
	System.out.println("After Replace "+hashCopy);
	
	// To clear the keys and values from Map
	hashCopy.clear();
	System.out.println("After Clear => "+hashCopy);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMapMethods hashmap = new HashMapMethods();
		hashmap.ExploreHashMap();

	}

}
