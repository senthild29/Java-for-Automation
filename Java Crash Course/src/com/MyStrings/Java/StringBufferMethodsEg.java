package com.MyStrings.Java;

public class StringBufferMethodsEg {

	public static void main(String[] args) {

		// To append a String
		StringBuffer name = new StringBuffer("Welcome");		
		System.out.println("Append String=> "+name.append(" To Chennai"));

		// To delete a String
		StringBuffer name2 = new StringBuffer("Will Smith");		
		System.out.println("Delete String => "+name2.delete(4,10));

		// To insert  a String
		StringBuffer name3 = new StringBuffer("Hello");	
		System.out.println("Insert String => "+name3.insert(5, " World"));

		// To reverse a String
		StringBuffer name4 = new StringBuffer("namma chennai");	
		System.out.println("Reverse String => "+name4.reverse());

		// To replace a String
		StringBuffer name5 = new StringBuffer("Okay Siri");	
		System.out.println("Replace String => "+name5.replace(4, 9, " Google"));

		// To know a capacity of a String
				System.out.println("Capacity of String => "+name3.capacity());
	
	}

}
