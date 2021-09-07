package com.MyExceptions.Java;

public class FinallyBlockEg {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Is it possible to divide a number Zero? Let's check out \n");
			int A = 5;
			int B = 0;
			double C = 5/0;
			
			System.out.println("Result => "+C);
		} 
		catch (ArithmeticException e) {
			System.out.println("You cannot divide a number by Zero");
		}
		finally {
			System.out.println("I'm inside a finally block");
		}

	}

}
