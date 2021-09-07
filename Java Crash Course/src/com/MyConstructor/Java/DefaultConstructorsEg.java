package com.MyConstructor.Java;

public class DefaultConstructorsEg {

	String EmpName;
	int EmpId;

	//Here do you see default constructor, nope right. But it is provided by compiler

	public static void main(String[] args) {

		DefaultConstructorsEg defaultConst = new DefaultConstructorsEg();

		System.out.println("Employee Name => "+defaultConst.EmpName);
		System.out.println("Employee ID => "+defaultConst.EmpId);


	}

}
