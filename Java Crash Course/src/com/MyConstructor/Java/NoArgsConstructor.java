package com.MyConstructor.Java;

public class NoArgsConstructor {

	String EmpName;
	int EmpID; 

	NoArgsConstructor() {

		EmpName = "Mathew";
		EmpID = 12698;

		System.out.println("This is an example of No Argument Constructor");
		System.out.println("Employee Name => " +EmpName  +" and Employee ID => "+EmpID);
	}

	public static void main(String[] args) {

		NoArgsConstructor cons = new NoArgsConstructor();

	}

}
