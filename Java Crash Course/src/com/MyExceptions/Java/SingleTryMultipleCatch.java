package com.MyExceptions.Java;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {

		try {

			int a = 10;
			int b = 0;
			int divide = a/b;

			System.out.println("Divide => "+divide);

		} 


		catch (NullPointerException e) {
			System.out.println("null pointer exception"); }

		catch (ArithmeticException e) {
			System.out.println("cannot divide a number by Zero(0)"); 
		}

		catch (Exception e) {
			System.out.println("Please input a number > 0");

		}

	}

}
