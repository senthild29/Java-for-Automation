package com.MyConstructor.Java;

public class ChildClass extends ParentClass{
	
	ChildClass() {
		System.out.println("This is a Child class");
	}

	public static void main(String[] args) {
		
		ChildClass child = new ChildClass();
//hidden
	}

}
