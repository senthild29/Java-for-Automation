package com.MyStrings.Java;

public class StringBufferMutableEg {

	public static void main(String[] args) {
		// String immutable example
		String name = "John";
		System.out.println("Stirng Immutable:");
		System.out.println("Concat existing String => "+name.concat(" Wick"));
		System.out.println("String After Conact => "+name);
		System.out.println("*************************");
		//String immutable example
		System.out.println("Stirngbuffer Mutable:");
		StringBuffer name2 = new StringBuffer("John");
		System.out.println("Concat existing String => "+name2.append(" Wick"));
		System.out.println("String After Conact => "+name2);
		

	}

}
