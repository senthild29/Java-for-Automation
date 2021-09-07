package com.Conditional_Looping.java;

public class LoopEg {

	public void ExecuteLoop() {

		// For loop  
		/*
		 * for (int i=0; i<5; i++) {
		 * System.out.println("This statement is executed using For Loop"); }
		 */

		// While loop 

		/*
		 * int i=0; // in while (i<5) {
		 * System.out.println("This statement is executed using While loop"); i++; }
		 */

		//Do While loop

		int i =0; //Initialization 
		do {
			System.out.println("This statement is executed using Do While Loop");
			i++; // Increment
		} while (i<5); // Condition
	}
	public static void main(String[] args) {

		LoopEg execloop = new LoopEg();
		execloop.ExecuteLoop();



	}

}
