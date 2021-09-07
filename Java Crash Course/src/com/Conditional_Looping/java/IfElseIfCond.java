package com.Conditional_Looping.java;

public class IfElseIfCond {

	Integer marks =80;

	public void ResultCalc() {

		if(marks.equals(40)) {
			System.out.println("You have just cleared the Exam");
		}
		else if(marks.equals(60)) {
			System.out.println("You have passed in 1st class");
		}
		else if(marks.equals(80)) {
			System.out.println("You have passed in Distinction");
		}
		else {
			System.out.println("Sorry!! you have not cleared the exam");
		}
	}

	public static void main(String[] args) {

		IfElseIfCond cond = new IfElseIfCond();
		cond.ResultCalc();


	}

}
