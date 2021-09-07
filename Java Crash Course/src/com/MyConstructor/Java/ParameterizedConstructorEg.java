package com.MyConstructor.Java;

public class ParameterizedConstructorEg {

	String Animal_Name;
	String Animal_Type;


	ParameterizedConstructorEg(String name, String type) {

		Animal_Name = name;
		Animal_Type = type;

	}

	public void animal_details() {
		System.out.println("Name of animal => "+Animal_Name +" Type => "+Animal_Type);
	}

	public static void main(String[] args) {

		ParameterizedConstructorEg paramcons = new ParameterizedConstructorEg("Lion", "Wild Animal");

		ParameterizedConstructorEg paramcons2 = new ParameterizedConstructorEg("Dog", "Domestic Animal");

		paramcons.animal_details();
		paramcons2.animal_details();



	}

}
