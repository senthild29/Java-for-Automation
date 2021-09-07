package com.MyPackage.Java;

public class StaticKeywordEg {
	
	public static void StaticEg() {
		
		System.out.println("This is a Static Method");
		
	}
	
	public void NonStaticEg() {
		StaticEg(); // Called StaticEg() from a nonStaticEg()
	}

	public static void main(String[] args) {
		StaticEg(); //Without creating object called method StaticEg()

	}

}
