package com.Polymorphism.Java;

public class OverloadingEg { 

	// Created same method with different arguments

	public  int calc(int a, int b) {
		return a*b;
	}

	public int calc (int a, int b, int c) {
		return a+b+c;
	}

	public  String calc (String a) {
		return a;
	}

	public static void main(String[] args) {

		OverloadingEg load = new OverloadingEg();

		System.out.println("Multiply 2 values => "+load.calc(5, 6));

		System.out.println("Say => "+load.calc("Hello World"));

		System.out.println("Addition of 3 values => "+load.calc(10, 25, 15));

	}

}
