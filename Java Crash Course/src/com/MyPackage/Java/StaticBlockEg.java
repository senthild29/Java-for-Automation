package com.MyPackage.Java;

public class StaticBlockEg {
	
	static {
		
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}

	public static void main(String[] args) {
	
		System.out.println("Main method");
		

	}

}
