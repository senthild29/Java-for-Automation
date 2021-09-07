package com.MyAbstraction.Java;

public class ChildClass1 implements MyFirstInterface, MySecondInterface, MyThirdInterface {

	public void Message1() {
		System.out.println("Message 1 implelemented from Interface");
	}

	public void Message2() {
		System.out.println("Message 2 implelemented from Interface");

	}
	public static void main(String[] args) {
		ChildClass1 child = new ChildClass1();
		child.Message1();
		child.Message2();
		
		
		
	}

}
