package com.MyPackage.Java;

public class StaticVariableEg {

	//Created static variable name
	static String name; //name is in Italic
	// Created normal variable ID
	int ID;

	public static void main(String[] args) {
		
		//Created an object for class StaticVariableEg 
		StaticVariableEg vari = new StaticVariableEg();
		vari.name = "John";
		vari.ID = 123;

		//Created an another object for the same class StaticVariableEg and passing different values
		StaticVariableEg vari2 = new StaticVariableEg();
		vari2.name = "Kennedy";
		vari2.ID = 987;

		System.out.println("Name of obj Vari => "+vari.name +" and ID => "+vari.ID);
		System.out.println("Name of obj Vari2  => "+vari2.name +" and ID => "+vari2.ID);


	}

}
