package com.MyExceptions.Java;

public class SingleTryCatchEg {

	public static void main(String[] args) {
		
		// written the code inside try {} which will throw exception		
		try {
			  String name = null;
			System.out.println(name.length());
			
		} 
		// Written the logic to handle the exception
		catch (Exception e) {
			System.out.println("Assign data to variable name");
		}
	}

}
